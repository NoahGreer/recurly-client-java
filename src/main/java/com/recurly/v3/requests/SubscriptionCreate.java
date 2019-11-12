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
import java.util.List;
import org.joda.time.DateTime;

public class SubscriptionCreate extends Request {

  @SerializedName("account")
  @Expose
  private AccountCreate account;

  /** Add-ons */
  @SerializedName("add_ons")
  @Expose
  private List<SubscriptionAddOnCreate> addOns;

  /** Collection method */
  @SerializedName("collection_method")
  @Expose
  private String collectionMethod;

  /**
   * Optional coupon code to redeem on the account and discount the subscription. Please note, the
   * subscription request will fail if the coupon is invalid.
   */
  @SerializedName("coupon_code")
  @Expose
  private String couponCode;

  /** 3-letter ISO 4217 currency code. */
  @SerializedName("currency")
  @Expose
  private String currency;

  /**
   * This will default to the Customer Notes text specified on the Invoice Settings. Specify custom
   * notes to add or override Customer Notes. Custom notes will stay with a subscription on all
   * renewals.
   */
  @SerializedName("customer_notes")
  @Expose
  private String customerNotes;

  /**
   * If set,indicates when the first renewal should occur. Subsequent renewals will be offset from
   * this date. The first invoice will be prorated appropriately so that the customer only pays for
   * the portion of the first billing period for which the subscription applies. Useful for forcing
   * a subscription to renew on the first of the month.
   */
  @SerializedName("first_renewal_date")
  @Expose
  private DateTime firstRenewalDate;

  /**
   * Integer representing the number of days after an invoice's creation that the invoice will
   * become past due. If an invoice's net terms are set to '0', it is due 'On Receipt' and will
   * become past due 24 hours after it’s created. If an invoice is due net 30, it will become past
   * due at 31 days exactly.
   */
  @SerializedName("net_terms")
  @Expose
  private Integer netTerms;

  /** Plan code */
  @SerializedName("plan_code")
  @Expose
  private String planCode;

  /** Plan ID */
  @SerializedName("plan_id")
  @Expose
  private String planId;

  /** For manual invoicing, this identifies the PO number associated with the subscription. */
  @SerializedName("po_number")
  @Expose
  private String poNumber;

  /** Optionally override the default quantity of 1. */
  @SerializedName("quantity")
  @Expose
  private Integer quantity;

  /** Create a shipping address on the account and assign it to the subscription. */
  @SerializedName("shipping_address")
  @Expose
  private ShippingAddressCreate shippingAddress;

  /**
   * Assign a shipping address from the account's existing shipping addresses. If this and
   * `shipping_address` are both present, `shipping_address` will take precedence.
   */
  @SerializedName("shipping_address_id")
  @Expose
  private String shippingAddressId;

  /**
   * If set, the subscription will begin in the future on this date. The subscription will apply the
   * setup fee and trial period, unless the plan has no trial.
   */
  @SerializedName("starts_at")
  @Expose
  private DateTime startsAt;

  /**
   * This will default to the Terms and Conditions text specified on the Invoice Settings page in
   * your Recurly admin. Specify custom notes to add or override Terms and Conditions. Custom notes
   * will stay with a subscription on all renewals.
   */
  @SerializedName("terms_and_conditions")
  @Expose
  private String termsAndConditions;

  /**
   * Renews the subscription for a specified number of total cycles, then automatically cancels.
   * Defaults to the subscription renewing indefinitely.
   */
  @SerializedName("total_billing_cycles")
  @Expose
  private Integer totalBillingCycles;

  /**
   * If set, overrides the default trial behavior for the subscription. The date must be in the
   * future.
   */
  @SerializedName("trial_ends_at")
  @Expose
  private DateTime trialEndsAt;

  /**
   * Override the unit amount of the subscription plan by setting this value. If not provided, the
   * subscription will inherit the price from the subscription plan for the provided currency.
   */
  @SerializedName("unit_amount")
  @Expose
  private Float unitAmount;

  public AccountCreate getAccount() {
    return this.account;
  }

  /** @param account */
  public void setAccount(final AccountCreate account) {
    this.account = account;
  }

  /** Add-ons */
  public List<SubscriptionAddOnCreate> getAddOns() {
    return this.addOns;
  }

  /** @param addOns Add-ons */
  public void setAddOns(final List<SubscriptionAddOnCreate> addOns) {
    this.addOns = addOns;
  }

  /** Collection method */
  public String getCollectionMethod() {
    return this.collectionMethod;
  }

  /** @param collectionMethod Collection method */
  public void setCollectionMethod(final String collectionMethod) {
    this.collectionMethod = collectionMethod;
  }

  /**
   * Optional coupon code to redeem on the account and discount the subscription. Please note, the
   * subscription request will fail if the coupon is invalid.
   */
  public String getCouponCode() {
    return this.couponCode;
  }

  /**
   * @param couponCode Optional coupon code to redeem on the account and discount the subscription.
   *     Please note, the subscription request will fail if the coupon is invalid.
   */
  public void setCouponCode(final String couponCode) {
    this.couponCode = couponCode;
  }

  /** 3-letter ISO 4217 currency code. */
  public String getCurrency() {
    return this.currency;
  }

  /** @param currency 3-letter ISO 4217 currency code. */
  public void setCurrency(final String currency) {
    this.currency = currency;
  }

  /**
   * This will default to the Customer Notes text specified on the Invoice Settings. Specify custom
   * notes to add or override Customer Notes. Custom notes will stay with a subscription on all
   * renewals.
   */
  public String getCustomerNotes() {
    return this.customerNotes;
  }

  /**
   * @param customerNotes This will default to the Customer Notes text specified on the Invoice
   *     Settings. Specify custom notes to add or override Customer Notes. Custom notes will stay
   *     with a subscription on all renewals.
   */
  public void setCustomerNotes(final String customerNotes) {
    this.customerNotes = customerNotes;
  }

  /**
   * If set,indicates when the first renewal should occur. Subsequent renewals will be offset from
   * this date. The first invoice will be prorated appropriately so that the customer only pays for
   * the portion of the first billing period for which the subscription applies. Useful for forcing
   * a subscription to renew on the first of the month.
   */
  public DateTime getFirstRenewalDate() {
    return this.firstRenewalDate;
  }

  /**
   * @param firstRenewalDate If set,indicates when the first renewal should occur. Subsequent
   *     renewals will be offset from this date. The first invoice will be prorated appropriately so
   *     that the customer only pays for the portion of the first billing period for which the
   *     subscription applies. Useful for forcing a subscription to renew on the first of the month.
   */
  public void setFirstRenewalDate(final DateTime firstRenewalDate) {
    this.firstRenewalDate = firstRenewalDate;
  }

  /**
   * Integer representing the number of days after an invoice's creation that the invoice will
   * become past due. If an invoice's net terms are set to '0', it is due 'On Receipt' and will
   * become past due 24 hours after it’s created. If an invoice is due net 30, it will become past
   * due at 31 days exactly.
   */
  public Integer getNetTerms() {
    return this.netTerms;
  }

  /**
   * @param netTerms Integer representing the number of days after an invoice's creation that the
   *     invoice will become past due. If an invoice's net terms are set to '0', it is due 'On
   *     Receipt' and will become past due 24 hours after it’s created. If an invoice is due net 30,
   *     it will become past due at 31 days exactly.
   */
  public void setNetTerms(final Integer netTerms) {
    this.netTerms = netTerms;
  }

  /** Plan code */
  public String getPlanCode() {
    return this.planCode;
  }

  /** @param planCode Plan code */
  public void setPlanCode(final String planCode) {
    this.planCode = planCode;
  }

  /** Plan ID */
  public String getPlanId() {
    return this.planId;
  }

  /** @param planId Plan ID */
  public void setPlanId(final String planId) {
    this.planId = planId;
  }

  /** For manual invoicing, this identifies the PO number associated with the subscription. */
  public String getPoNumber() {
    return this.poNumber;
  }

  /**
   * @param poNumber For manual invoicing, this identifies the PO number associated with the
   *     subscription.
   */
  public void setPoNumber(final String poNumber) {
    this.poNumber = poNumber;
  }

  /** Optionally override the default quantity of 1. */
  public Integer getQuantity() {
    return this.quantity;
  }

  /** @param quantity Optionally override the default quantity of 1. */
  public void setQuantity(final Integer quantity) {
    this.quantity = quantity;
  }

  /** Create a shipping address on the account and assign it to the subscription. */
  public ShippingAddressCreate getShippingAddress() {
    return this.shippingAddress;
  }

  /**
   * @param shippingAddress Create a shipping address on the account and assign it to the
   *     subscription.
   */
  public void setShippingAddress(final ShippingAddressCreate shippingAddress) {
    this.shippingAddress = shippingAddress;
  }

  /**
   * Assign a shipping address from the account's existing shipping addresses. If this and
   * `shipping_address` are both present, `shipping_address` will take precedence.
   */
  public String getShippingAddressId() {
    return this.shippingAddressId;
  }

  /**
   * @param shippingAddressId Assign a shipping address from the account's existing shipping
   *     addresses. If this and `shipping_address` are both present, `shipping_address` will take
   *     precedence.
   */
  public void setShippingAddressId(final String shippingAddressId) {
    this.shippingAddressId = shippingAddressId;
  }

  /**
   * If set, the subscription will begin in the future on this date. The subscription will apply the
   * setup fee and trial period, unless the plan has no trial.
   */
  public DateTime getStartsAt() {
    return this.startsAt;
  }

  /**
   * @param startsAt If set, the subscription will begin in the future on this date. The
   *     subscription will apply the setup fee and trial period, unless the plan has no trial.
   */
  public void setStartsAt(final DateTime startsAt) {
    this.startsAt = startsAt;
  }

  /**
   * This will default to the Terms and Conditions text specified on the Invoice Settings page in
   * your Recurly admin. Specify custom notes to add or override Terms and Conditions. Custom notes
   * will stay with a subscription on all renewals.
   */
  public String getTermsAndConditions() {
    return this.termsAndConditions;
  }

  /**
   * @param termsAndConditions This will default to the Terms and Conditions text specified on the
   *     Invoice Settings page in your Recurly admin. Specify custom notes to add or override Terms
   *     and Conditions. Custom notes will stay with a subscription on all renewals.
   */
  public void setTermsAndConditions(final String termsAndConditions) {
    this.termsAndConditions = termsAndConditions;
  }

  /**
   * Renews the subscription for a specified number of total cycles, then automatically cancels.
   * Defaults to the subscription renewing indefinitely.
   */
  public Integer getTotalBillingCycles() {
    return this.totalBillingCycles;
  }

  /**
   * @param totalBillingCycles Renews the subscription for a specified number of total cycles, then
   *     automatically cancels. Defaults to the subscription renewing indefinitely.
   */
  public void setTotalBillingCycles(final Integer totalBillingCycles) {
    this.totalBillingCycles = totalBillingCycles;
  }

  /**
   * If set, overrides the default trial behavior for the subscription. The date must be in the
   * future.
   */
  public DateTime getTrialEndsAt() {
    return this.trialEndsAt;
  }

  /**
   * @param trialEndsAt If set, overrides the default trial behavior for the subscription. The date
   *     must be in the future.
   */
  public void setTrialEndsAt(final DateTime trialEndsAt) {
    this.trialEndsAt = trialEndsAt;
  }

  /**
   * Override the unit amount of the subscription plan by setting this value. If not provided, the
   * subscription will inherit the price from the subscription plan for the provided currency.
   */
  public Float getUnitAmount() {
    return this.unitAmount;
  }

  /**
   * @param unitAmount Override the unit amount of the subscription plan by setting this value. If
   *     not provided, the subscription will inherit the price from the subscription plan for the
   *     provided currency.
   */
  public void setUnitAmount(final Float unitAmount) {
    this.unitAmount = unitAmount;
  }
}
