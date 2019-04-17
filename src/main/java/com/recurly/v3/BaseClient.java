package com.recurly.v3;
import com.recurly.v3.Resource;
import com.recurly.v3.http.HeaderInterceptor;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonParseException;

import com.fatboyindustrial.gsonjodatime.Converters;

import java.io.IOException;
import java.lang.reflect.Type;
import java.security.cert.CertificateException;
import java.util.Map;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSession;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManager;
import javax.net.ssl.X509TrustManager;

import okhttp3.Credentials;
import okhttp3.OkHttpClient;
import okhttp3.Headers;
import okhttp3.HttpUrl;
import okhttp3.logging.HttpLoggingInterceptor;
import okhttp3.MediaType;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Request.Builder;
import okhttp3.Response;

import org.joda.time.DateTime;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;

public abstract class BaseClient {
    class DateDeserializer implements JsonDeserializer<DateTime> {

        @Override
        public DateTime deserialize(JsonElement element, Type arg1, JsonDeserializationContext arg2) throws JsonParseException {
            String string = element.getAsString();
            DateTimeFormatter formatter = DateTimeFormat.forPattern("yyyy-MM-dd'T'HH:mm:ss'Z'");

            return formatter.parseDateTime(string);
        }
    }
    private static final String API_URL = "https://partner-api.recurly.com/";
    //private static OkHttpClient.Builder httpClientBuilder = new OkHttpClient.Builder();
    // TODO will want to use safe ^ version by default
    private static final OkHttpClient.Builder httpClientBuilder = getUnsafeOkHttpClientBuilder();
    private static final Gson gson = Converters.registerDateTime(new GsonBuilder()).create();
    private final String apiKey;
    private final String siteId;
    private final OkHttpClient client;
    private String apiUrl;

    protected BaseClient(String siteId, String apiKey) {
        if (siteId == null || siteId.isEmpty()) {
            throw new IllegalArgumentException("siteId is required. You passed in " + siteId);
        }

        if (apiKey == null || apiKey.isEmpty()) {
            throw new IllegalArgumentException("apiKey is required. You passed in " + apiKey);
        }

        this.siteId = siteId;
        this.apiKey = apiKey;

        final String authToken = Credentials.basic(this.apiKey, "");
        final HeaderInterceptor headerInterceptor =
                new HeaderInterceptor(authToken, Client.API_VERSION);

        if (!httpClientBuilder.interceptors().contains(headerInterceptor)) {
            httpClientBuilder.addInterceptor(headerInterceptor);
        }

        if ("true".equals(System.getenv("RECURLY_INSECURE"))) {
            HttpLoggingInterceptor logging = new HttpLoggingInterceptor();
            logging.setLevel(HttpLoggingInterceptor.Level.BASIC);
            httpClientBuilder.addInterceptor(logging);
        }

        this.client = httpClientBuilder.build();
        this.apiUrl = API_URL;
    }

    private static OkHttpClient.Builder getUnsafeOkHttpClientBuilder() {
        try {
            // Create a trust manager that does not validate certificate chains
            final TrustManager[] trustAllCerts = new TrustManager[] {
                    new X509TrustManager() {
                        public void checkClientTrusted(java.security.cert.X509Certificate[] chain, String authType) throws CertificateException {
                        }

                        public void checkServerTrusted(java.security.cert.X509Certificate[] chain, String authType) throws CertificateException {
                        }
                        public java.security.cert.X509Certificate[] getAcceptedIssuers() {
                            return new java.security.cert.X509Certificate[]{};
                        }
                    }
            };

            // Install the all-trusting trust manager
            final SSLContext sslContext = SSLContext.getInstance("SSL");
            sslContext.init(null, trustAllCerts, new java.security.SecureRandom());
            // Create an ssl socket factory with our all-trusting manager
            final SSLSocketFactory sslSocketFactory = sslContext.getSocketFactory();

            OkHttpClient.Builder builder = new OkHttpClient.Builder();
            builder.sslSocketFactory(sslSocketFactory);
            builder.hostnameVerifier(new HostnameVerifier() {
                public boolean verify(String hostname, SSLSession session) {
                    return true;
                }
            });

            return builder;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    protected <T> T makeRequest(String method, String url, Class<T> resourceClass) throws IOException {
        return makeRequest(method, url, null, null, resourceClass);
    }

    protected <T> T makeRequest(String method, String url, String body, Class<T> resourceClass) throws IOException {
        return makeRequest(method, url, body, null, resourceClass);
    }

    protected <T> T makeRequest(String method, String url, Map<String, String> queryParams, Class<T> resourceClass) throws IOException {
        return makeRequest(method, url, null, queryParams, resourceClass);
    }

    protected <T> T makeRequest(String method, String url, String body, Map<String, String> queryParams, Class<T> resourceClass) throws IOException {
        HttpUrl.Builder httpBuilder = HttpUrl.parse(this.apiUrl + url).newBuilder();

        if (queryParams != null) {
            for(Map.Entry<String, String> param : queryParams.entrySet()) {
                httpBuilder.addQueryParameter(param.getKey(),param.getValue());
            }
        }

        HttpUrl requestUrl = httpBuilder.build();

        if ("true".equals(System.getenv("RECURLY_INSECURE"))) {
            System.out.println("Performing " + method + " request to " + requestUrl);
        }

        Builder requestBuilder = new Request.Builder()
        .url(requestUrl);

        if (body != null) {
            requestBuilder = requestBuilder.post(
                RequestBody.create(
                    MediaType.parse("application/json; charset=utf-8"),
                    body
                )
            );
        }

        Request request = requestBuilder.build();

        try (Response response = client.newCall(request).execute()) {
            if (!response.isSuccessful()) throw new IOException("Unexpected code " + response);

            Headers responseHeaders = response.headers();
            String responseBody = response.body().string();

            if ("true".equals(System.getenv("RECURLY_INSECURE"))) {
                for (int i = 0; i < responseHeaders.size(); i++) {
                    System.out.println(responseHeaders.name(i) + ": " + responseHeaders.value(i));
                }
                System.out.println(responseBody);
            }

            return processResponse(responseBody, resourceClass);
        }
    }

    private <T> T processResponse(String responseBody, Class<T> resourceClass) {
        Gson gson = new GsonBuilder().registerTypeAdapter(DateTime.class, new DateDeserializer()).create();
        return gson.fromJson(responseBody, resourceClass);
    }

    protected String interpolatePath(String path, Map<String, String> urlParams) {
        urlParams.put("site_id", this.siteId);
        Pattern p = Pattern.compile("\\{([A-Za-z|_]*)\\}");
        Matcher m = p.matcher(path);

        while(m.find()) {
            String key = m.group(1).replace("{", "").replace("}", "");
            String value = urlParams.get(key);
            path = path.replace(m.group(1), value);
        }

        path = path.replaceAll("\\{", "").replaceAll("\\}", "");

        return path;
    }

    public void _setApiUrl(String uri) {
        System.out.println("[SECURITY WARNING] _SetApiUrl is for testing only and not supported in production.");

        if ("true".equals(System.getenv("RECURLY_INSECURE"))) {
            this.apiUrl = uri;
        } else {
            System.out.println("ApiUrl not changed. To change, set the environment variable RECURLY_INSECURE to true");
        }
    }
}
