/*
 * gmodstore
 * Welcome to the GmodStore API! You can use our API to access GmodStore API endpoints, which can be used interact with GmodStore programmatically.  # Rate limits Every request you make to the GmodStore API will count against your rate limit, which at the time of writing this, is 60 requests / minute. An up-to-date value will always provided in the `X-RateLimit-Limit` header The number of requests you have remaining before you must wait is provided in the `X-RateLimit-Remaining` header.  # API SDKs For a list of available API SDKs check the README here: https://github.com/everyday-as/gmodstore-api-docs#client-libraries
 *
 * The version of the OpenAPI document: 3.0.0
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
import java.util.UUID;

/**
 * ProductPurchaseFilter
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-05-04T05:54:00.031332Z[Etc/UTC]")
public class ProductPurchaseFilter {
  public static final String SERIALIZED_NAME_REVOKED = "revoked";
  @SerializedName(SERIALIZED_NAME_REVOKED)
  private Boolean revoked;

  public static final String SERIALIZED_NAME_USER_ID = "userId";
  @SerializedName(SERIALIZED_NAME_USER_ID)
  private UUID userId;

  public static final String SERIALIZED_NAME_PRODUCT_ID = "productId";
  @SerializedName(SERIALIZED_NAME_PRODUCT_ID)
  private UUID productId;


  public ProductPurchaseFilter revoked(Boolean revoked) {
    
    this.revoked = revoked;
    return this;
  }

   /**
   * Get revoked
   * @return revoked
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getRevoked() {
    return revoked;
  }


  public void setRevoked(Boolean revoked) {
    this.revoked = revoked;
  }


  public ProductPurchaseFilter userId(UUID userId) {
    
    this.userId = userId;
    return this;
  }

   /**
   * Get userId
   * @return userId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public UUID getUserId() {
    return userId;
  }


  public void setUserId(UUID userId) {
    this.userId = userId;
  }


  public ProductPurchaseFilter productId(UUID productId) {
    
    this.productId = productId;
    return this;
  }

   /**
   * Get productId
   * @return productId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public UUID getProductId() {
    return productId;
  }


  public void setProductId(UUID productId) {
    this.productId = productId;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProductPurchaseFilter productPurchaseFilter = (ProductPurchaseFilter) o;
    return Objects.equals(this.revoked, productPurchaseFilter.revoked) &&
        Objects.equals(this.userId, productPurchaseFilter.userId) &&
        Objects.equals(this.productId, productPurchaseFilter.productId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(revoked, userId, productId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProductPurchaseFilter {\n");
    sb.append("    revoked: ").append(toIndentedString(revoked)).append("\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
    sb.append("    productId: ").append(toIndentedString(productId)).append("\n");
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

