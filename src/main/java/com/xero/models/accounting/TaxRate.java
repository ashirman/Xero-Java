/*
 * Accounting API
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: 2.0.0
 * Contact: api@xero.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.xero.models.accounting;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.xero.models.accounting.TaxComponent;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

/**
 * TaxRate
 */

public class TaxRate {
  
  @JsonProperty("Name")
  private String name;

  
  @JsonProperty("TaxType")
  private String taxType;

  
  @JsonProperty("TaxComponents")
  private List<TaxComponent> taxComponents = null;

  /**
   * See Status Codes
   */
  public enum StatusEnum {
    ACTIVE("ACTIVE"),
    
    DELETED("DELETED"),
    
    ARCHIVED("ARCHIVED");

    private String value;

    StatusEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static StatusEnum fromValue(String text) {
      for (StatusEnum b : StatusEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + text + "'");
    }
  }

  
  @JsonProperty("Status")
  private StatusEnum status;

  /**
   * See ReportTaxTypes
   */
  public enum ReportTaxTypeEnum {
    OUTPUT("OUTPUT"),
    
    INPUT("INPUT"),
    
    EXEMPTOUTPUT("EXEMPTOUTPUT"),
    
    INPUTTAXED("INPUTTAXED"),
    
    BASEXCLUDED("BASEXCLUDED"),
    
    EXEMPTEXPENSES("EXEMPTEXPENSES"),
    
    EXEMPTINPUT("EXEMPTINPUT"),
    
    ECOUTPUT("ECOUTPUT"),
    
    ECOUTPUTSERVICES("ECOUTPUTSERVICES"),
    
    ECINPUT("ECINPUT"),
    
    ECACQUISITIONS("ECACQUISITIONS"),
    
    CAPITALSALESOUTPUT("CAPITALSALESOUTPUT"),
    
    CAPITALEXPENSESINPUT("CAPITALEXPENSESINPUT"),
    
    MOSSSALES("MOSSSALES"),
    
    NONE("NONE"),
    
    GSTONIMPORTS("GSTONIMPORTS");

    private String value;

    ReportTaxTypeEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static ReportTaxTypeEnum fromValue(String text) {
      for (ReportTaxTypeEnum b : ReportTaxTypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + text + "'");
    }
  }

  
  @JsonProperty("ReportTaxType")
  private ReportTaxTypeEnum reportTaxType;

  
  @JsonProperty("CanApplyToAssets")
  private Boolean canApplyToAssets;

  
  @JsonProperty("CanApplyToEquity")
  private Boolean canApplyToEquity;

  
  @JsonProperty("CanApplyToExpenses")
  private Boolean canApplyToExpenses;

  
  @JsonProperty("CanApplyToLiabilities")
  private Boolean canApplyToLiabilities;

  
  @JsonProperty("CanApplyToRevenue")
  private Boolean canApplyToRevenue;

  
  @JsonProperty("DisplayTaxRate")
  private Double displayTaxRate;

  
  @JsonProperty("EffectiveRate")
  private Double effectiveRate;

  public TaxRate name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Name of tax rate
   * @return name
  **/
  @ApiModelProperty(value = "Name of tax rate")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public TaxRate taxType(String taxType) {
    this.taxType = taxType;
    return this;
  }

   /**
   * The tax type
   * @return taxType
  **/
  @ApiModelProperty(value = "The tax type")
  public String getTaxType() {
    return taxType;
  }

  public void setTaxType(String taxType) {
    this.taxType = taxType;
  }

  public TaxRate taxComponents(List<TaxComponent> taxComponents) {
    this.taxComponents = taxComponents;
    return this;
  }

  public TaxRate addTaxComponentsItem(TaxComponent taxComponentsItem) {
    if (this.taxComponents == null) {
      this.taxComponents = new ArrayList<TaxComponent>();
    }
    this.taxComponents.add(taxComponentsItem);
    return this;
  }

   /**
   * See TaxComponents
   * @return taxComponents
  **/
  @ApiModelProperty(value = "See TaxComponents")
  public List<TaxComponent> getTaxComponents() {
    return taxComponents;
  }

  public void setTaxComponents(List<TaxComponent> taxComponents) {
    this.taxComponents = taxComponents;
  }

  public TaxRate status(StatusEnum status) {
    this.status = status;
    return this;
  }

   /**
   * See Status Codes
   * @return status
  **/
  @ApiModelProperty(value = "See Status Codes")
  public StatusEnum getStatus() {
    return status;
  }

  public void setStatus(StatusEnum status) {
    this.status = status;
  }

  public TaxRate reportTaxType(ReportTaxTypeEnum reportTaxType) {
    this.reportTaxType = reportTaxType;
    return this;
  }

   /**
   * See ReportTaxTypes
   * @return reportTaxType
  **/
  @ApiModelProperty(required = true, value = "See ReportTaxTypes")
  public ReportTaxTypeEnum getReportTaxType() {
    return reportTaxType;
  }

  public void setReportTaxType(ReportTaxTypeEnum reportTaxType) {
    this.reportTaxType = reportTaxType;
  }

   /**
   * Boolean to describe if tax rate can be used for asset accounts i.e.  true,false
   * @return canApplyToAssets
  **/
  @ApiModelProperty(value = "Boolean to describe if tax rate can be used for asset accounts i.e.  true,false")
  public Boolean getCanApplyToAssets() {
    return canApplyToAssets;
  }

   /**
   * Boolean to describe if tax rate can be used for equity accounts i.e true,false
   * @return canApplyToEquity
  **/
  @ApiModelProperty(value = "Boolean to describe if tax rate can be used for equity accounts i.e true,false")
  public Boolean getCanApplyToEquity() {
    return canApplyToEquity;
  }

   /**
   * Boolean to describe if tax rate can be used for expense accounts  i.e. true,false
   * @return canApplyToExpenses
  **/
  @ApiModelProperty(value = "Boolean to describe if tax rate can be used for expense accounts  i.e. true,false")
  public Boolean getCanApplyToExpenses() {
    return canApplyToExpenses;
  }

   /**
   * Boolean to describe if tax rate can be used for liability accounts  i.e. true,false
   * @return canApplyToLiabilities
  **/
  @ApiModelProperty(value = "Boolean to describe if tax rate can be used for liability accounts  i.e. true,false")
  public Boolean getCanApplyToLiabilities() {
    return canApplyToLiabilities;
  }

   /**
   * Boolean to describe if tax rate can be used for revenue accounts i.e. true,false
   * @return canApplyToRevenue
  **/
  @ApiModelProperty(value = "Boolean to describe if tax rate can be used for revenue accounts i.e. true,false")
  public Boolean getCanApplyToRevenue() {
    return canApplyToRevenue;
  }

   /**
   * Tax Rate (decimal to 4dp) e.g 12.5000
   * @return displayTaxRate
  **/
  @ApiModelProperty(value = "Tax Rate (decimal to 4dp) e.g 12.5000")
  public Double getDisplayTaxRate() {
    return displayTaxRate;
  }

   /**
   * Effective Tax Rate (decimal to 4dp) e.g 12.5000
   * @return effectiveRate
  **/
  @ApiModelProperty(value = "Effective Tax Rate (decimal to 4dp) e.g 12.5000")
  public Double getEffectiveRate() {
    return effectiveRate;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TaxRate taxRate = (TaxRate) o;
    return Objects.equals(this.name, taxRate.name) &&
        Objects.equals(this.taxType, taxRate.taxType) &&
        Objects.equals(this.taxComponents, taxRate.taxComponents) &&
        Objects.equals(this.status, taxRate.status) &&
        Objects.equals(this.reportTaxType, taxRate.reportTaxType) &&
        Objects.equals(this.canApplyToAssets, taxRate.canApplyToAssets) &&
        Objects.equals(this.canApplyToEquity, taxRate.canApplyToEquity) &&
        Objects.equals(this.canApplyToExpenses, taxRate.canApplyToExpenses) &&
        Objects.equals(this.canApplyToLiabilities, taxRate.canApplyToLiabilities) &&
        Objects.equals(this.canApplyToRevenue, taxRate.canApplyToRevenue) &&
        Objects.equals(this.displayTaxRate, taxRate.displayTaxRate) &&
        Objects.equals(this.effectiveRate, taxRate.effectiveRate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, taxType, taxComponents, status, reportTaxType, canApplyToAssets, canApplyToEquity, canApplyToExpenses, canApplyToLiabilities, canApplyToRevenue, displayTaxRate, effectiveRate);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TaxRate {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    taxType: ").append(toIndentedString(taxType)).append("\n");
    sb.append("    taxComponents: ").append(toIndentedString(taxComponents)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    reportTaxType: ").append(toIndentedString(reportTaxType)).append("\n");
    sb.append("    canApplyToAssets: ").append(toIndentedString(canApplyToAssets)).append("\n");
    sb.append("    canApplyToEquity: ").append(toIndentedString(canApplyToEquity)).append("\n");
    sb.append("    canApplyToExpenses: ").append(toIndentedString(canApplyToExpenses)).append("\n");
    sb.append("    canApplyToLiabilities: ").append(toIndentedString(canApplyToLiabilities)).append("\n");
    sb.append("    canApplyToRevenue: ").append(toIndentedString(canApplyToRevenue)).append("\n");
    sb.append("    displayTaxRate: ").append(toIndentedString(displayTaxRate)).append("\n");
    sb.append("    effectiveRate: ").append(toIndentedString(effectiveRate)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

