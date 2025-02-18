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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

/**
 * CISSetting
 */

public class CISSetting {
  
  @JsonProperty("CISEnabled")
  private Boolean ciSEnabled;

  
  @JsonProperty("Rate")
  private Integer rate;

  public CISSetting ciSEnabled(Boolean ciSEnabled) {
    this.ciSEnabled = ciSEnabled;
    return this;
  }

   /**
   * Boolean that describes if the contact is a CIS Subcontractor
   * @return ciSEnabled
  **/
  @ApiModelProperty(value = "Boolean that describes if the contact is a CIS Subcontractor")
  public Boolean getCiSEnabled() {
    return ciSEnabled;
  }

  public void setCiSEnabled(Boolean ciSEnabled) {
    this.ciSEnabled = ciSEnabled;
  }

  public CISSetting rate(Integer rate) {
    this.rate = rate;
    return this;
  }

   /**
   * CIS Deduction rate for the contact if he is a subcontractor. If the contact is not CISEnabled, then the rate is not returned
   * @return rate
  **/
  @ApiModelProperty(value = "CIS Deduction rate for the contact if he is a subcontractor. If the contact is not CISEnabled, then the rate is not returned")
  public Integer getRate() {
    return rate;
  }

  public void setRate(Integer rate) {
    this.rate = rate;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CISSetting ciSSetting = (CISSetting) o;
    return Objects.equals(this.ciSEnabled, ciSSetting.ciSEnabled) &&
        Objects.equals(this.rate, ciSSetting.rate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ciSEnabled, rate);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CISSetting {\n");
    
    sb.append("    ciSEnabled: ").append(toIndentedString(ciSEnabled)).append("\n");
    sb.append("    rate: ").append(toIndentedString(rate)).append("\n");
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

