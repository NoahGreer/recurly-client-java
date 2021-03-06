/**
 * This file is automatically created by Recurly's OpenAPI generation process and thus any edits you
 * make by hand will be lost. If you wish to make a change to this file, please create a Github
 * issue explaining the changes you need and we will usher them to the appropriate places.
 */
package com.recurly.v3.resources;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.recurly.v3.Resource;

public class SubscriptionAddOnTier extends Resource {

  /** Ending quantity */
  @SerializedName("ending_quantity")
  @Expose
  private Integer endingQuantity;

  /** Unit amount */
  @SerializedName("unit_amount")
  @Expose
  private Float unitAmount;

  /** Ending quantity */
  public Integer getEndingQuantity() {
    return this.endingQuantity;
  }

  /** @param endingQuantity Ending quantity */
  public void setEndingQuantity(final Integer endingQuantity) {
    this.endingQuantity = endingQuantity;
  }

  /** Unit amount */
  public Float getUnitAmount() {
    return this.unitAmount;
  }

  /** @param unitAmount Unit amount */
  public void setUnitAmount(final Float unitAmount) {
    this.unitAmount = unitAmount;
  }
}
