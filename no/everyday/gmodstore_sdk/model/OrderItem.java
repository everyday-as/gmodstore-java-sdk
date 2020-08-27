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
import java.util.UUID;
import no.everyday.gmodstore_sdk.model.Money;
import org.threeten.bp.OffsetDateTime;
/**
 * OrderItem
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-08-27T03:37:05.881781Z[Etc/UTC]")
public class OrderItem {
  @SerializedName("id")
  private UUID id = null;

  @SerializedName("price")
  private Money price = null;

  @SerializedName("reversed_at")
  private OffsetDateTime reversedAt = null;

  public OrderItem id(UUID id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @Schema(required = true, description = "")
  public UUID getId() {
    return id;
  }

  public void setId(UUID id) {
    this.id = id;
  }

  public OrderItem price(Money price) {
    this.price = price;
    return this;
  }

   /**
   * Get price
   * @return price
  **/
  @Schema(required = true, description = "")
  public Money getPrice() {
    return price;
  }

  public void setPrice(Money price) {
    this.price = price;
  }

  public OrderItem reversedAt(OffsetDateTime reversedAt) {
    this.reversedAt = reversedAt;
    return this;
  }

   /**
   * Get reversedAt
   * @return reversedAt
  **/
  @Schema(description = "")
  public OffsetDateTime getReversedAt() {
    return reversedAt;
  }

  public void setReversedAt(OffsetDateTime reversedAt) {
    this.reversedAt = reversedAt;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrderItem orderItem = (OrderItem) o;
    return Objects.equals(this.id, orderItem.id) &&
        Objects.equals(this.price, orderItem.price) &&
        Objects.equals(this.reversedAt, orderItem.reversedAt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, price, reversedAt);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrderItem {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    price: ").append(toIndentedString(price)).append("\n");
    sb.append("    reversedAt: ").append(toIndentedString(reversedAt)).append("\n");
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
