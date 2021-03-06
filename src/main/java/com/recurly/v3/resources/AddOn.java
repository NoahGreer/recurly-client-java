/**
 * This file is automatically created by Recurly's OpenAPI generation process and thus any edits you
 * make by hand will be lost. If you wish to make a change to this file, please create a Github
 * issue explaining the changes you need and we will usher them to the appropriate places.
 */
package com.recurly.v3.resources;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.recurly.v3.Resource;
import java.util.List;
import org.joda.time.DateTime;

public class AddOn extends Resource {

  /**
   * Accounting code for invoice line items for this add-on. If no value is provided, it defaults to
   * add-on's code.
   */
  @SerializedName("accounting_code")
  @Expose
  private String accountingCode;

  /** The unique identifier for the add-on within its plan. */
  @SerializedName("code")
  @Expose
  private String code;

  /** Created at */
  @SerializedName("created_at")
  @Expose
  private DateTime createdAt;

  /** Add-on pricing */
  @SerializedName("currencies")
  @Expose
  private List<AddOnPricing> currencies;

  /** Default quantity for the hosted pages. */
  @SerializedName("default_quantity")
  @Expose
  private Integer defaultQuantity;

  /** Deleted at */
  @SerializedName("deleted_at")
  @Expose
  private DateTime deletedAt;

  /** Determines if the quantity field is displayed on the hosted pages for the add-on. */
  @SerializedName("display_quantity")
  @Expose
  private Boolean displayQuantity;

  /** Optional, stock keeping unit to link the item to other inventory systems. */
  @SerializedName("external_sku")
  @Expose
  private String externalSku;

  /** Add-on ID */
  @SerializedName("id")
  @Expose
  private String id;

  /** Just the important parts. */
  @SerializedName("item")
  @Expose
  private ItemMini item;

  /** Describes your add-on and will appear in subscribers' invoices. */
  @SerializedName("name")
  @Expose
  private String name;

  /** Object type */
  @SerializedName("object")
  @Expose
  private String object;

  /**
   * Whether the add-on is optional for the customer to include in their purchase on the hosted
   * payment page. If false, the add-on will be included when a subscription is created through the
   * Recurly UI. However, the add-on will not be included when a subscription is created through the
   * API.
   */
  @SerializedName("optional")
  @Expose
  private Boolean optional;

  /** Plan ID */
  @SerializedName("plan_id")
  @Expose
  private String planId;

  /**
   * When this add-on is invoiced, the line item will use this revenue schedule. If
   * `item_code`/`item_id` is part of the request then `revenue_schedule_type` must be absent in the
   * request as the value will be set from the item.
   */
  @SerializedName("revenue_schedule_type")
  @Expose
  private String revenueScheduleType;

  /** Add-ons can be either active or inactive. */
  @SerializedName("state")
  @Expose
  private String state;

  /**
   * Used by Avalara, Vertex, and Recurly’s EU VAT tax feature. The tax code values are specific to
   * each tax system. If you are using Recurly’s EU VAT feature you can use `unknown`, `physical`,
   * or `digital`.
   */
  @SerializedName("tax_code")
  @Expose
  private String taxCode;

  /** The type of tiering used by the Add-on. */
  @SerializedName("tier_type")
  @Expose
  private String tierType;

  /** Tiers */
  @SerializedName("tiers")
  @Expose
  private List<Tier> tiers;

  /** Last updated at */
  @SerializedName("updated_at")
  @Expose
  private DateTime updatedAt;

  /**
   * Accounting code for invoice line items for this add-on. If no value is provided, it defaults to
   * add-on's code.
   */
  public String getAccountingCode() {
    return this.accountingCode;
  }

  /**
   * @param accountingCode Accounting code for invoice line items for this add-on. If no value is
   *     provided, it defaults to add-on's code.
   */
  public void setAccountingCode(final String accountingCode) {
    this.accountingCode = accountingCode;
  }

  /** The unique identifier for the add-on within its plan. */
  public String getCode() {
    return this.code;
  }

  /** @param code The unique identifier for the add-on within its plan. */
  public void setCode(final String code) {
    this.code = code;
  }

  /** Created at */
  public DateTime getCreatedAt() {
    return this.createdAt;
  }

  /** @param createdAt Created at */
  public void setCreatedAt(final DateTime createdAt) {
    this.createdAt = createdAt;
  }

  /** Add-on pricing */
  public List<AddOnPricing> getCurrencies() {
    return this.currencies;
  }

  /** @param currencies Add-on pricing */
  public void setCurrencies(final List<AddOnPricing> currencies) {
    this.currencies = currencies;
  }

  /** Default quantity for the hosted pages. */
  public Integer getDefaultQuantity() {
    return this.defaultQuantity;
  }

  /** @param defaultQuantity Default quantity for the hosted pages. */
  public void setDefaultQuantity(final Integer defaultQuantity) {
    this.defaultQuantity = defaultQuantity;
  }

  /** Deleted at */
  public DateTime getDeletedAt() {
    return this.deletedAt;
  }

  /** @param deletedAt Deleted at */
  public void setDeletedAt(final DateTime deletedAt) {
    this.deletedAt = deletedAt;
  }

  /** Determines if the quantity field is displayed on the hosted pages for the add-on. */
  public Boolean getDisplayQuantity() {
    return this.displayQuantity;
  }

  /**
   * @param displayQuantity Determines if the quantity field is displayed on the hosted pages for
   *     the add-on.
   */
  public void setDisplayQuantity(final Boolean displayQuantity) {
    this.displayQuantity = displayQuantity;
  }

  /** Optional, stock keeping unit to link the item to other inventory systems. */
  public String getExternalSku() {
    return this.externalSku;
  }

  /**
   * @param externalSku Optional, stock keeping unit to link the item to other inventory systems.
   */
  public void setExternalSku(final String externalSku) {
    this.externalSku = externalSku;
  }

  /** Add-on ID */
  public String getId() {
    return this.id;
  }

  /** @param id Add-on ID */
  public void setId(final String id) {
    this.id = id;
  }

  /** Just the important parts. */
  public ItemMini getItem() {
    return this.item;
  }

  /** @param item Just the important parts. */
  public void setItem(final ItemMini item) {
    this.item = item;
  }

  /** Describes your add-on and will appear in subscribers' invoices. */
  public String getName() {
    return this.name;
  }

  /** @param name Describes your add-on and will appear in subscribers' invoices. */
  public void setName(final String name) {
    this.name = name;
  }

  /** Object type */
  public String getObject() {
    return this.object;
  }

  /** @param object Object type */
  public void setObject(final String object) {
    this.object = object;
  }

  /**
   * Whether the add-on is optional for the customer to include in their purchase on the hosted
   * payment page. If false, the add-on will be included when a subscription is created through the
   * Recurly UI. However, the add-on will not be included when a subscription is created through the
   * API.
   */
  public Boolean getOptional() {
    return this.optional;
  }

  /**
   * @param optional Whether the add-on is optional for the customer to include in their purchase on
   *     the hosted payment page. If false, the add-on will be included when a subscription is
   *     created through the Recurly UI. However, the add-on will not be included when a
   *     subscription is created through the API.
   */
  public void setOptional(final Boolean optional) {
    this.optional = optional;
  }

  /** Plan ID */
  public String getPlanId() {
    return this.planId;
  }

  /** @param planId Plan ID */
  public void setPlanId(final String planId) {
    this.planId = planId;
  }

  /**
   * When this add-on is invoiced, the line item will use this revenue schedule. If
   * `item_code`/`item_id` is part of the request then `revenue_schedule_type` must be absent in the
   * request as the value will be set from the item.
   */
  public String getRevenueScheduleType() {
    return this.revenueScheduleType;
  }

  /**
   * @param revenueScheduleType When this add-on is invoiced, the line item will use this revenue
   *     schedule. If `item_code`/`item_id` is part of the request then `revenue_schedule_type` must
   *     be absent in the request as the value will be set from the item.
   */
  public void setRevenueScheduleType(final String revenueScheduleType) {
    this.revenueScheduleType = revenueScheduleType;
  }

  /** Add-ons can be either active or inactive. */
  public String getState() {
    return this.state;
  }

  /** @param state Add-ons can be either active or inactive. */
  public void setState(final String state) {
    this.state = state;
  }

  /**
   * Used by Avalara, Vertex, and Recurly’s EU VAT tax feature. The tax code values are specific to
   * each tax system. If you are using Recurly’s EU VAT feature you can use `unknown`, `physical`,
   * or `digital`.
   */
  public String getTaxCode() {
    return this.taxCode;
  }

  /**
   * @param taxCode Used by Avalara, Vertex, and Recurly’s EU VAT tax feature. The tax code values
   *     are specific to each tax system. If you are using Recurly’s EU VAT feature you can use
   *     `unknown`, `physical`, or `digital`.
   */
  public void setTaxCode(final String taxCode) {
    this.taxCode = taxCode;
  }

  /** The type of tiering used by the Add-on. */
  public String getTierType() {
    return this.tierType;
  }

  /** @param tierType The type of tiering used by the Add-on. */
  public void setTierType(final String tierType) {
    this.tierType = tierType;
  }

  /** Tiers */
  public List<Tier> getTiers() {
    return this.tiers;
  }

  /** @param tiers Tiers */
  public void setTiers(final List<Tier> tiers) {
    this.tiers = tiers;
  }

  /** Last updated at */
  public DateTime getUpdatedAt() {
    return this.updatedAt;
  }

  /** @param updatedAt Last updated at */
  public void setUpdatedAt(final DateTime updatedAt) {
    this.updatedAt = updatedAt;
  }
}
