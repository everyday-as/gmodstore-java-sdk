/*
 * GmodStore
 * Welcome to the Gmodstore API! You can use our API to access Gmodstore API endpoints, which can be used interact with Gmodstore programmatically.
 *
 * OpenAPI spec version: 1.0.1
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
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
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import no.everyday.gmodstore_sdk.model.Money;
/**
 * AddonPrice
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-01-02T00:18:02.785682Z[Etc/UTC]")
public class AddonPrice {
  @SerializedName("original")
  private Money original = null;

  @SerializedName("purchase")
  private Money purchase = null;

  public AddonPrice original(Money original) {
    this.original = original;
    return this;
  }

   /**
   * Get original
   * @return original
  **/
  @Schema(description = "")
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
  @Schema(description = "")
  public Money getPurchase() {
    return purchase;
  }

  public void setPurchase(Money purchase) {
    this.purchase = purchase;
  }


  @Override
  public boolean equals(java.lang.Object o) {
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
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}
