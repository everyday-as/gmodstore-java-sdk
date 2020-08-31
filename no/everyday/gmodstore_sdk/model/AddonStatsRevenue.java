/*
 * GmodStore API
 * Welcome to the GmodStore API! You can use our API to access GmodStore API endpoints, which can be used interact with GmodStore programmatically.
 *
 * The version of the OpenAPI document: 1.1.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package no.everyday.gmodstore_sdk.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import no.everyday.gmodstore_sdk.model.AddonStatsRevenueCurrent;
import no.everyday.gmodstore_sdk.model.Money;

/**
 * AddonStatsRevenue
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-08-31T21:24:40.731564Z[Etc/UTC]")
public class AddonStatsRevenue {
  public static final String SERIALIZED_NAME_CURRENT = "current";
  @SerializedName(SERIALIZED_NAME_CURRENT)
  private AddonStatsRevenueCurrent current;

  public static final String SERIALIZED_NAME_PREVIOUS = "previous";
  @SerializedName(SERIALIZED_NAME_PREVIOUS)
  private AddonStatsRevenueCurrent previous;

  public static final String SERIALIZED_NAME_TOTAL = "total";
  @SerializedName(SERIALIZED_NAME_TOTAL)
  private Money total;


  public AddonStatsRevenue current(AddonStatsRevenueCurrent current) {
    
    this.current = current;
    return this;
  }

   /**
   * Get current
   * @return current
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public AddonStatsRevenueCurrent getCurrent() {
    return current;
  }


  public void setCurrent(AddonStatsRevenueCurrent current) {
    this.current = current;
  }


  public AddonStatsRevenue previous(AddonStatsRevenueCurrent previous) {
    
    this.previous = previous;
    return this;
  }

   /**
   * Get previous
   * @return previous
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public AddonStatsRevenueCurrent getPrevious() {
    return previous;
  }


  public void setPrevious(AddonStatsRevenueCurrent previous) {
    this.previous = previous;
  }


  public AddonStatsRevenue total(Money total) {
    
    this.total = total;
    return this;
  }

   /**
   * Get total
   * @return total
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Money getTotal() {
    return total;
  }


  public void setTotal(Money total) {
    this.total = total;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AddonStatsRevenue addonStatsRevenue = (AddonStatsRevenue) o;
    return Objects.equals(this.current, addonStatsRevenue.current) &&
        Objects.equals(this.previous, addonStatsRevenue.previous) &&
        Objects.equals(this.total, addonStatsRevenue.total);
  }

  @Override
  public int hashCode() {
    return Objects.hash(current, previous, total);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AddonStatsRevenue {\n");
    sb.append("    current: ").append(toIndentedString(current)).append("\n");
    sb.append("    previous: ").append(toIndentedString(previous)).append("\n");
    sb.append("    total: ").append(toIndentedString(total)).append("\n");
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

