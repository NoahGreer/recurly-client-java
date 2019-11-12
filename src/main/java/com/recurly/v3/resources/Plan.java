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
import java.util.Map;
import org.joda.time.DateTime;

public class Plan extends Resource {

  /**
   * Accounting code for invoice line items for the plan. If no value is provided, it defaults to
   * plan's code.
   */
  @SerializedName("accounting_code")
  @Expose
  private String accountingCode;

  /**
   * Unique code to identify the plan. This is used in Hosted Payment Page URLs and in the invoice
   * exports.
   */
  @SerializedName("code")
  @Expose
  private String code;

  /** Created at */
  @SerializedName("created_at")
  @Expose
  private DateTime createdAt;

  /** Pricing */
  @SerializedName("currencies")
  @Expose
  private List<Map> currencies;

  /** Deleted at */
  @SerializedName("deleted_at")
  @Expose
  private DateTime deletedAt;

  /** Optional description, not displayed. */
  @SerializedName("description")
  @Expose
  private String description;

  /** Hosted pages settings */
  @SerializedName("hosted_pages")
  @Expose
  private PlanHostedPages hostedPages;

  /** Plan ID */
  @SerializedName("id")
  @Expose
  private String id;

  /** Length of the plan's billing interval in `interval_unit`. */
  @SerializedName("interval_length")
  @Expose
  private Integer intervalLength;

  /** Unit for the plan's billing interval. */
  @SerializedName("interval_unit")
  @Expose
  private String intervalUnit;

  /**
   * This name describes your plan and will appear on the Hosted Payment Page and the subscriber's
   * invoice.
   */
  @SerializedName("name")
  @Expose
  private String name;

  /** Object type */
  @SerializedName("object")
  @Expose
  private String object;

  /**
   * Accounting code for invoice line items for the plan's setup fee. If no value is provided, it
   * defaults to plan's accounting code.
   */
  @SerializedName("setup_fee_accounting_code")
  @Expose
  private String setupFeeAccountingCode;

  /** Plans can be either active or inactive. */
  @SerializedName("state")
  @Expose
  private String state;

  /**
   * Used by Avalara, Vertex, and Recurly’s EU VAT tax feature. The tax code values are specific to
   * each tax system. If you are using Recurly’s EU VAT feature `P0000000` is `physical`, `D0000000`
   * is `digital`, and an empty string is `unknown`.
   */
  @SerializedName("tax_code")
  @Expose
  private String taxCode;

  /** `true` exempts tax on the plan, `false` applies tax on the plan. */
  @SerializedName("tax_exempt")
  @Expose
  private Boolean taxExempt;

  /**
   * Automatically terminate subscriptions after a defined number of billing cycles. Number of
   * billing cycles before the plan automatically stops renewing, defaults to `null` for continuous,
   * automatic renewal.
   */
  @SerializedName("total_billing_cycles")
  @Expose
  private Integer totalBillingCycles;

  /** Length of plan's trial period in `trial_units`. `0` means `no trial`. */
  @SerializedName("trial_length")
  @Expose
  private Integer trialLength;

  /** Units for the plan's trial period. */
  @SerializedName("trial_unit")
  @Expose
  private String trialUnit;

  /** Last updated at */
  @SerializedName("updated_at")
  @Expose
  private DateTime updatedAt;

  /**
   * Accounting code for invoice line items for the plan. If no value is provided, it defaults to
   * plan's code.
   */
  public String getAccountingCode() {
    return this.accountingCode;
  }

  /**
   * @param accountingCode Accounting code for invoice line items for the plan. If no value is
   *     provided, it defaults to plan's code.
   */
  public void setAccountingCode(final String accountingCode) {
    this.accountingCode = accountingCode;
  }

  /**
   * Unique code to identify the plan. This is used in Hosted Payment Page URLs and in the invoice
   * exports.
   */
  public String getCode() {
    return this.code;
  }

  /**
   * @param code Unique code to identify the plan. This is used in Hosted Payment Page URLs and in
   *     the invoice exports.
   */
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

  /** Pricing */
  public List<Map> getCurrencies() {
    return this.currencies;
  }

  /** @param currencies Pricing */
  public void setCurrencies(final List<Map> currencies) {
    this.currencies = currencies;
  }

  /** Deleted at */
  public DateTime getDeletedAt() {
    return this.deletedAt;
  }

  /** @param deletedAt Deleted at */
  public void setDeletedAt(final DateTime deletedAt) {
    this.deletedAt = deletedAt;
  }

  /** Optional description, not displayed. */
  public String getDescription() {
    return this.description;
  }

  /** @param description Optional description, not displayed. */
  public void setDescription(final String description) {
    this.description = description;
  }

  /** Hosted pages settings */
  public PlanHostedPages getHostedPages() {
    return this.hostedPages;
  }

  /** @param hostedPages Hosted pages settings */
  public void setHostedPages(final PlanHostedPages hostedPages) {
    this.hostedPages = hostedPages;
  }

  /** Plan ID */
  public String getId() {
    return this.id;
  }

  /** @param id Plan ID */
  public void setId(final String id) {
    this.id = id;
  }

  /** Length of the plan's billing interval in `interval_unit`. */
  public Integer getIntervalLength() {
    return this.intervalLength;
  }

  /** @param intervalLength Length of the plan's billing interval in `interval_unit`. */
  public void setIntervalLength(final Integer intervalLength) {
    this.intervalLength = intervalLength;
  }

  /** Unit for the plan's billing interval. */
  public String getIntervalUnit() {
    return this.intervalUnit;
  }

  /** @param intervalUnit Unit for the plan's billing interval. */
  public void setIntervalUnit(final String intervalUnit) {
    this.intervalUnit = intervalUnit;
  }

  /**
   * This name describes your plan and will appear on the Hosted Payment Page and the subscriber's
   * invoice.
   */
  public String getName() {
    return this.name;
  }

  /**
   * @param name This name describes your plan and will appear on the Hosted Payment Page and the
   *     subscriber's invoice.
   */
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
   * Accounting code for invoice line items for the plan's setup fee. If no value is provided, it
   * defaults to plan's accounting code.
   */
  public String getSetupFeeAccountingCode() {
    return this.setupFeeAccountingCode;
  }

  /**
   * @param setupFeeAccountingCode Accounting code for invoice line items for the plan's setup fee.
   *     If no value is provided, it defaults to plan's accounting code.
   */
  public void setSetupFeeAccountingCode(final String setupFeeAccountingCode) {
    this.setupFeeAccountingCode = setupFeeAccountingCode;
  }

  /** Plans can be either active or inactive. */
  public String getState() {
    return this.state;
  }

  /** @param state Plans can be either active or inactive. */
  public void setState(final String state) {
    this.state = state;
  }

  /**
   * Used by Avalara, Vertex, and Recurly’s EU VAT tax feature. The tax code values are specific to
   * each tax system. If you are using Recurly’s EU VAT feature `P0000000` is `physical`, `D0000000`
   * is `digital`, and an empty string is `unknown`.
   */
  public String getTaxCode() {
    return this.taxCode;
  }

  /**
   * @param taxCode Used by Avalara, Vertex, and Recurly’s EU VAT tax feature. The tax code values
   *     are specific to each tax system. If you are using Recurly’s EU VAT feature `P0000000` is
   *     `physical`, `D0000000` is `digital`, and an empty string is `unknown`.
   */
  public void setTaxCode(final String taxCode) {
    this.taxCode = taxCode;
  }

  /** `true` exempts tax on the plan, `false` applies tax on the plan. */
  public Boolean getTaxExempt() {
    return this.taxExempt;
  }

  /** @param taxExempt `true` exempts tax on the plan, `false` applies tax on the plan. */
  public void setTaxExempt(final Boolean taxExempt) {
    this.taxExempt = taxExempt;
  }

  /**
   * Automatically terminate subscriptions after a defined number of billing cycles. Number of
   * billing cycles before the plan automatically stops renewing, defaults to `null` for continuous,
   * automatic renewal.
   */
  public Integer getTotalBillingCycles() {
    return this.totalBillingCycles;
  }

  /**
   * @param totalBillingCycles Automatically terminate subscriptions after a defined number of
   *     billing cycles. Number of billing cycles before the plan automatically stops renewing,
   *     defaults to `null` for continuous, automatic renewal.
   */
  public void setTotalBillingCycles(final Integer totalBillingCycles) {
    this.totalBillingCycles = totalBillingCycles;
  }

  /** Length of plan's trial period in `trial_units`. `0` means `no trial`. */
  public Integer getTrialLength() {
    return this.trialLength;
  }

  /** @param trialLength Length of plan's trial period in `trial_units`. `0` means `no trial`. */
  public void setTrialLength(final Integer trialLength) {
    this.trialLength = trialLength;
  }

  /** Units for the plan's trial period. */
  public String getTrialUnit() {
    return this.trialUnit;
  }

  /** @param trialUnit Units for the plan's trial period. */
  public void setTrialUnit(final String trialUnit) {
    this.trialUnit = trialUnit;
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
