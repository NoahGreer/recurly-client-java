package com.recurly.v3.requests;

import com.recurly.v3.resources.*;
import com.google.gson.annotations.SerializedName;
import com.recurly.v3.Request;
import org.joda.time.DateTime;
import java.util.List;
import java.util.Map;

public class SubscriptionAddOnCreate extends Request {

  @SerializedName("code")
  private String code;

  @SerializedName("id")
  private String id;

  @SerializedName("quantity")
  private Integer quantity;

  @SerializedName("unit_amount")
  private Float unitAmount;


  public String getCode() { return this.code; }
  public void setCode(final String code) { this.code = code; }

  public String getId() { return this.id; }
  public void setId(final String id) { this.id = id; }

  public Integer getQuantity() { return this.quantity; }
  public void setQuantity(final Integer quantity) { this.quantity = quantity; }

  public Float getUnitAmount() { return this.unitAmount; }
  public void setUnitAmount(final Float unitAmount) { this.unitAmount = unitAmount; }

}