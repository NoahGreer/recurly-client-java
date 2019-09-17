/**
 * This file is automatically created by Recurly's OpenAPI generation process and thus any edits you
 * make by hand will be lost. If you wish to make a change to this file, please create a Github
 * issue explaining the changes you need and we will usher them to the appropriate places.
 */
package com.recurly.v3.requests;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.recurly.v3.Request;
import com.recurly.v3.resources.*;

public class SubscriptionCancel extends Request {

  /** The option for when a subscription cancellation will expire the subscription. */
  @SerializedName("timeframe")
  @Expose
  private String timeframe;

  /** The option for when a subscription cancellation will expire the subscription. */
  public String getTimeframe() {
    return this.timeframe;
  }

  /**
   * @param timeframe The option for when a subscription cancellation will expire the subscription.
   */
  public void setTimeframe(final String timeframe) {
    this.timeframe = timeframe;
  }
}