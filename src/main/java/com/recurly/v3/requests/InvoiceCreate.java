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

public class InvoiceCreate extends Request {

  /**
   * An automatic invoice means a corresponding transaction is run using the account's billing
   * information at the same time the invoice is created. Manual invoices are created without a
   * corresponding transaction. The merchant must enter a manual payment transaction or have the
   * customer pay the invoice with an automatic method, like credit card, PayPal, Amazon, or ACH
   * bank payment.
   */
  @SerializedName("collection_method")
  @Expose
  private String collectionMethod;

  /** 3-letter ISO 4217 currency code. */
  @SerializedName("currency")
  @Expose
  private String currency;

  /**
   * This will default to the Customer Notes text specified on the Invoice Settings. Specify custom
   * notes to add or override Customer Notes.
   */
  @SerializedName("customer_notes")
  @Expose
  private String customerNotes;

  /**
   * Integer representing the number of days after an invoice's creation that the invoice will
   * become past due. If an invoice's net terms are set to '0', it is due 'On Receipt' and will
   * become past due 24 hours after it’s created. If an invoice is due net 30, it will become past
   * due at 31 days exactly.
   */
  @SerializedName("net_terms")
  @Expose
  private Integer netTerms;

  /** For manual invoicing, this identifies the PO number associated with the subscription. */
  @SerializedName("po_number")
  @Expose
  private String poNumber;

  /**
   * This will default to the Terms and Conditions text specified on the Invoice Settings page in
   * your Recurly admin. Specify custom notes to add or override Terms and Conditions.
   */
  @SerializedName("terms_and_conditions")
  @Expose
  private String termsAndConditions;

  /**
   * VAT Reverse Charge Notes only appear if you have EU VAT enabled or are using your own Avalara
   * AvaTax account and the customer is in the EU, has a VAT number, and is in a different country
   * than your own. This will default to the VAT Reverse Charge Notes text specified on the Tax
   * Settings page in your Recurly admin, unless custom notes were created with the original
   * subscription.
   */
  @SerializedName("vat_reverse_charge_notes")
  @Expose
  private String vatReverseChargeNotes;

  /**
   * An automatic invoice means a corresponding transaction is run using the account's billing
   * information at the same time the invoice is created. Manual invoices are created without a
   * corresponding transaction. The merchant must enter a manual payment transaction or have the
   * customer pay the invoice with an automatic method, like credit card, PayPal, Amazon, or ACH
   * bank payment.
   */
  public String getCollectionMethod() {
    return this.collectionMethod;
  }

  /**
   * @param collectionMethod An automatic invoice means a corresponding transaction is run using the
   *     account's billing information at the same time the invoice is created. Manual invoices are
   *     created without a corresponding transaction. The merchant must enter a manual payment
   *     transaction or have the customer pay the invoice with an automatic method, like credit
   *     card, PayPal, Amazon, or ACH bank payment.
   */
  public void setCollectionMethod(final String collectionMethod) {
    this.collectionMethod = collectionMethod;
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
   * notes to add or override Customer Notes.
   */
  public String getCustomerNotes() {
    return this.customerNotes;
  }

  /**
   * @param customerNotes This will default to the Customer Notes text specified on the Invoice
   *     Settings. Specify custom notes to add or override Customer Notes.
   */
  public void setCustomerNotes(final String customerNotes) {
    this.customerNotes = customerNotes;
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

  /**
   * This will default to the Terms and Conditions text specified on the Invoice Settings page in
   * your Recurly admin. Specify custom notes to add or override Terms and Conditions.
   */
  public String getTermsAndConditions() {
    return this.termsAndConditions;
  }

  /**
   * @param termsAndConditions This will default to the Terms and Conditions text specified on the
   *     Invoice Settings page in your Recurly admin. Specify custom notes to add or override Terms
   *     and Conditions.
   */
  public void setTermsAndConditions(final String termsAndConditions) {
    this.termsAndConditions = termsAndConditions;
  }

  /**
   * VAT Reverse Charge Notes only appear if you have EU VAT enabled or are using your own Avalara
   * AvaTax account and the customer is in the EU, has a VAT number, and is in a different country
   * than your own. This will default to the VAT Reverse Charge Notes text specified on the Tax
   * Settings page in your Recurly admin, unless custom notes were created with the original
   * subscription.
   */
  public String getVatReverseChargeNotes() {
    return this.vatReverseChargeNotes;
  }

  /**
   * @param vatReverseChargeNotes VAT Reverse Charge Notes only appear if you have EU VAT enabled or
   *     are using your own Avalara AvaTax account and the customer is in the EU, has a VAT number,
   *     and is in a different country than your own. This will default to the VAT Reverse Charge
   *     Notes text specified on the Tax Settings page in your Recurly admin, unless custom notes
   *     were created with the original subscription.
   */
  public void setVatReverseChargeNotes(final String vatReverseChargeNotes) {
    this.vatReverseChargeNotes = vatReverseChargeNotes;
  }
}
