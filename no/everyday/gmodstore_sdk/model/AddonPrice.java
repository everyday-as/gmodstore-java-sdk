/*
 * GmodStore API
 * Welcome to the GmodStore API! You can use our API to access GmodStore API endpoints, which can be used interact with GmodStore programmatically.
 *
 * The version of the OpenAPI document: 1.2.0
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
import no.everyday.gmodstore_sdk.model.Money;

/**
 * AddonPrice
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-05-23T17:32:01.693920Z[Etc/UTC]")
public class AddonPrice {
  public static final String SERIALIZED_NAME_ORIGINAL = "original";
  @SerializedName(SERIALIZED_NAME_ORIGINAL)
  private Money original;

  public static final String SERIALIZED_NAME_PURCHASE = "purchase";
  @SerializedName(SERIALIZED_NAME_PURCHASE)
  private Money purchase;


  public AddonPrice original(Money original) {
    
    this.original = original;
    return this;
  }

   /**
   * Get original
   * @return original
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Money getOriginal() {
    return original;
  }


  public void setOriginal(Money original) {
    this.original = original;
  }


  public AddonPrice purchase(Money purchase) {
    
    this.purchase = purchase;
    return this;
  }

   /**
   * Get purchase
   * @return purchase
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Money getPurchase() {
    return purchase;
  }


  public void setPurchase(Money purchase) {
    this.purchase = purchase;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AddonPrice addonPrice = (AddonPrice) o;
    return Objects.equals(this.original, addonPrice.original) &&
        Objects.equals(this.purchase, addonPrice.purchase);
  }

  @Override
  public int hashCode() {
    return Objects.hash(original, purchase);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AddonPrice {\n");
    sb.append("    original: ").append(toIndentedString(original)).append("\n");
    sb.append("    purchase: ").append(toIndentedString(purchase)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

