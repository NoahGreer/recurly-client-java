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
import org.joda.time.DateTime;

public class LineItemCreate extends Request {

  /**
   * Accounting Code for the `LineItem`. If `item_code`/`item_id` is part of the request then
   * `accounting_code` must be absent.
   */
  @SerializedName("accounting_code")
  @Expose
  private String accountingCode;

  /**
   * The reason the credit was given when line item is `type=credit`. When the Credit Invoices
   * feature is enabled, the value can be set and will default to `general`. When the Credit
   * Invoices feature is not enabled, the value will always be `null`.
   */
  @SerializedName("credit_reason_code")
  @Expose
  private String creditReasonCode;

  /**
   * 3-letter ISO 4217 currency code. If `item_code`/`item_id` is part of the request then
   * `currency` is optional, if the site has a single default currency. `currency` is required if
   * `item_code`/`item_id` is present, and there are multiple currencies defined on the site. If
   * `item_code`/`item_id` is not present `currency` is required.
   */
  @SerializedName("currency")
  @Expose
  private String currency;

  /**
   * Description that appears on the invoice. If `item_code`/`item_id` is part of the request then
   * `description` must be absent.
   */
  @SerializedName("description")
  @Expose
  private String description;

  /** If this date is provided, it indicates the end of a time range. */
  @SerializedName("end_date")
  @Expose
  private DateTime endDate;

  /**
   * Unique code to identify an item. Avaliable when the Credit Invoices and Subscription Billing
   * Terms features are enabled.
   */
  @SerializedName("item_code")
  @Expose
  private String itemCode;

  /**
   * System-generated unique identifier for an item. Available when the Credit Invoices and
   * Subscription Billing Terms features are enabled.
   */
  @SerializedName("item_id")
  @Expose
  private String itemId;

  /**
   * Only allowed if the Gift Cards feature is enabled on your site and `type` is `credit`. Can only
   * have a value of `external_gift_card`. Set this value in order to track gift card credits from
   * external gift cards (like InComm). It also skips billing information requirements.
   */
  @SerializedName("origin")
  @Expose
  private String origin;

  /**
   * Optional field to track a product code or SKU for the line item. This can be used to later
   * reporting on product purchases. For Vertex tax calculations, this field will be used as the
   * Vertex `product` field. If `item_code`/`item_id` is part of the request then `product_code`
   * must be absent.
   */
  @SerializedName("product_code")
  @Expose
  private String productCode;

  /**
   * This number will be multiplied by the unit amount to compute the subtotal before any discounts
   * or taxes.
   */
  @SerializedName("quantity")
  @Expose
  private Integer quantity;

  /** Revenue schedule type */
  @SerializedName("revenue_schedule_type")
  @Expose
  private String revenueScheduleType;

  /**
   * If an end date is present, this is value indicates the beginning of a billing time range. If no
   * end date is present it indicates billing for a specific date. Defaults to the current
   * date-time.
   */
  @SerializedName("start_date")
  @Expose
  private DateTime startDate;

  /**
   * Optional field used by Avalara, Vertex, and Recurly's EU VAT tax feature to determine taxation
   * rules. If you have your own AvaTax or Vertex account configured, use their tax codes to assign
   * specific tax rules. If you are using Recurly's EU VAT feature, you can use values of `unknown`,
   * `physical`, or `digital`.
   */
  @SerializedName("tax_code")
  @Expose
  private String taxCode;

  /**
   * `true` exempts tax on charges, `false` applies tax on charges. If not defined, then defaults to
   * the Plan and Site settings. This attribute does not work for credits (negative line items).
   * Credits are always applied post-tax. Pre-tax discounts should use the Coupons feature.
   */
  @SerializedName("tax_exempt")
  @Expose
  private Boolean taxExempt;

  /**
   * Line item type. If `item_code`/`item_id` is present then `type` should not be present. If
   * `item_code`/`item_id` is not present then `type` is required.
   */
  @SerializedName("type")
  @Expose
  private String type;

  /**
   * A positive or negative amount with `type=charge` will result in a positive `unit_amount`. A
   * positive or negative amount with `type=credit` will result in a negative `unit_amount`. If
   * `item_code`/`item_id` is present, `unit_amount` can be passed in, to override the `Item`'s
   * `unit_amount`. If `item_code`/`item_id` is not present then `unit_amount` is required.
   */
  @SerializedName("unit_amount")
  @Expose
  private Float unitAmount;

  /**
   * Accounting Code for the `LineItem`. If `item_code`/`item_id` is part of the request then
   * `accounting_code` must be absent.
   */
  public String getAccountingCode() {
    return this.accountingCode;
  }

  /**
   * @param accountingCode Accounting Code for the `LineItem`. If `item_code`/`item_id` is part of
   *     the request then `accounting_code` must be absent.
   */
  public void setAccountingCode(final String accountingCode) {
    this.accountingCode = accountingCode;
  }

  /**
   * The reason the credit was given when line item is `type=credit`. When the Credit Invoices
   * feature is enabled, the value can be set and will default to `general`. When the Credit
   * Invoices feature is not enabled, the value will always be `null`.
   */
  public String getCreditReasonCode() {
    return this.creditReasonCode;
  }

  /**
   * @param creditReasonCode The reason the credit was given when line item is `type=credit`. When
   *     the Credit Invoices feature is enabled, the value can be set and will default to `general`.
   *     When the Credit Invoices feature is not enabled, the value will always be `null`.
   */
  public void setCreditReasonCode(final String creditReasonCode) {
    this.creditReasonCode = creditReasonCode;
  }

  /**
   * 3-letter ISO 4217 currency code. If `item_code`/`item_id` is part of the request then
   * `currency` is optional, if the site has a single default currency. `currency` is required if
   * `item_code`/`item_id` is present, and there are multiple currencies defined on the site. If
   * `item_code`/`item_id` is not present `currency` is required.
   */
  public String getCurrency() {
    return this.currency;
  }

  /**
   * @param currency 3-letter ISO 4217 currency code. If `item_code`/`item_id` is part of the
   *     request then `currency` is optional, if the site has a single default currency. `currency`
   *     is required if `item_code`/`item_id` is present, and there are multiple currencies defined
   *     on the site. If `item_code`/`item_id` is not present `currency` is required.
   */
  public void setCurrency(final String currency) {
    this.currency = currency;
  }

  /**
   * Description that appears on the invoice. If `item_code`/`item_id` is part of the request then
   * `description` must be absent.
   */
  public String getDescription() {
    return this.description;
  }

  /**
   * @param description Description that appears on the invoice. If `item_code`/`item_id` is part of
   *     the request then `description` must be absent.
   */
  public void setDescription(final String description) {
    this.description = description;
  }

  /** If this date is provided, it indicates the end of a time range. */
  public DateTime getEndDate() {
    return this.endDate;
  }

  /** @param endDate If this date is provided, it indicates the end of a time range. */
  public void setEndDate(final DateTime endDate) {
    this.endDate = endDate;
  }

  /**
   * Unique code to identify an item. Avaliable when the Credit Invoices and Subscription Billing
   * Terms features are enabled.
   */
  public String getItemCode() {
    return this.itemCode;
  }

  /**
   * @param itemCode Unique code to identify an item. Avaliable when the Credit Invoices and
   *     Subscription Billing Terms features are enabled.
   */
  public void setItemCode(final String itemCode) {
    this.itemCode = itemCode;
  }

  /**
   * System-generated unique identifier for an item. Available when the Credit Invoices and
   * Subscription Billing Terms features are enabled.
   */
  public String getItemId() {
    return this.itemId;
  }

  /**
   * @param itemId System-generated unique identifier for an item. Available when the Credit
   *     Invoices and Subscription Billing Terms features are enabled.
   */
  public void setItemId(final String itemId) {
    this.itemId = itemId;
  }

  /**
   * Only allowed if the Gift Cards feature is enabled on your site and `type` is `credit`. Can only
   * have a value of `external_gift_card`. Set this value in order to track gift card credits from
   * external gift cards (like InComm). It also skips billing information requirements.
   */
  public String getOrigin() {
    return this.origin;
  }

  /**
   * @param origin Only allowed if the Gift Cards feature is enabled on your site and `type` is
   *     `credit`. Can only have a value of `external_gift_card`. Set this value in order to track
   *     gift card credits from external gift cards (like InComm). It also skips billing information
   *     requirements.
   */
  public void setOrigin(final String origin) {
    this.origin = origin;
  }

  /**
   * Optional field to track a product code or SKU for the line item. This can be used to later
   * reporting on product purchases. For Vertex tax calculations, this field will be used as the
   * Vertex `product` field. If `item_code`/`item_id` is part of the request then `product_code`
   * must be absent.
   */
  public String getProductCode() {
    return this.productCode;
  }

  /**
   * @param productCode Optional field to track a product code or SKU for the line item. This can be
   *     used to later reporting on product purchases. For Vertex tax calculations, this field will
   *     be used as the Vertex `product` field. If `item_code`/`item_id` is part of the request then
   *     `product_code` must be absent.
   */
  public void setProductCode(final String productCode) {
    this.productCode = productCode;
  }

  /**
   * This number will be multiplied by the unit amount to compute the subtotal before any discounts
   * or taxes.
   */
  public Integer getQuantity() {
    return this.quantity;
  }

  /**
   * @param quantity This number will be multiplied by the unit amount to compute the subtotal
   *     before any discounts or taxes.
   */
  public void setQuantity(final Integer quantity) {
    this.quantity = quantity;
  }

  /** Revenue schedule type */
  public String getRevenueScheduleType() {
    return this.revenueScheduleType;
  }

  /** @param revenueScheduleType Revenue schedule type */
  public void setRevenueScheduleType(final String revenueScheduleType) {
    this.revenueScheduleType = revenueScheduleType;
  }

  /**
   * If an end date is present, this is value indicates the beginning of a billing time range. If no
   * end date is present it indicates billing for a specific date. Defaults to the current
   * date-time.
   */
  public DateTime getStartDate() {
    return this.startDate;
  }

  /**
   * @param startDate If an end date is present, this is value indicates the beginning of a billing
   *     time range. If no end date is present it indicates billing for a specific date. Defaults to
   *     the current date-time.
   */
  public void setStartDate(final DateTime startDate) {
    this.startDate = startDate;
  }

  /**
   * Optional field used by Avalara, Vertex, and Recurly's EU VAT tax feature to determine taxation
   * rules. If you have your own AvaTax or Vertex account configured, use their tax codes to assign
   * specific tax rules. If you are using Recurly's EU VAT feature, you can use values of `unknown`,
   * `physical`, or `digital`.
   */
  public String getTaxCode() {
    return this.taxCode;
  }

  /**
   * @param taxCode Optional field used by Avalara, Vertex, and Recurly's EU VAT tax feature to
   *     determine taxation rules. If you have your own AvaTax or Vertex account configured, use
   *     their tax codes to assign specific tax rules. If you are using Recurly's EU VAT feature,
   *     you can use values of `unknown`, `physical`, or `digital`.
   */
  public void setTaxCode(final String taxCode) {
    this.taxCode = taxCode;
  }

  /**
   * `true` exempts tax on charges, `false` applies tax on charges. If not defined, then defaults to
   * the Plan and Site settings. This attribute does not work for credits (negative line items).
   * Credits are always applied post-tax. Pre-tax discounts should use the Coupons feature.
   */
  public Boolean getTaxExempt() {
    return this.taxExempt;
  }

  /**
   * @param taxExempt `true` exempts tax on charges, `false` applies tax on charges. If not defined,
   *     then defaults to the Plan and Site settings. This attribute does not work for credits
   *     (negative line items). Credits are always applied post-tax. Pre-tax discounts should use
   *     the Coupons feature.
   */
  public void setTaxExempt(final Boolean taxExempt) {
    this.taxExempt = taxExempt;
  }

  /**
   * Line item type. If `item_code`/`item_id` is present then `type` should not be present. If
   * `item_code`/`item_id` is not present then `type` is required.
   */
  public String getType() {
    return this.type;
  }

  /**
   * @param type Line item type. If `item_code`/`item_id` is present then `type` should not be
   *     present. If `item_code`/`item_id` is not present then `type` is required.
   */
  public void setType(final String type) {
    this.type = type;
  }

  /**
   * A positive or negative amount with `type=charge` will result in a positive `unit_amount`. A
   * positive or negative amount with `type=credit` will result in a negative `unit_amount`. If
   * `item_code`/`item_id` is present, `unit_amount` can be passed in, to override the `Item`'s
   * `unit_amount`. If `item_code`/`item_id` is not present then `unit_amount` is required.
   */
  public Float getUnitAmount() {
    return this.unitAmount;
  }

  /**
   * @param unitAmount A positive or negative amount with `type=charge` will result in a positive
   *     `unit_amount`. A positive or negative amount with `type=credit` will result in a negative
   *     `unit_amount`. If `item_code`/`item_id` is present, `unit_amount` can be passed in, to
   *     override the `Item`'s `unit_amount`. If `item_code`/`item_id` is not present then
   *     `unit_amount` is required.
   */
  public void setUnitAmount(final Float unitAmount) {
    this.unitAmount = unitAmount;
  }
}
