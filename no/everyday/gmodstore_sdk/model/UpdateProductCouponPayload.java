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
import org.openapitools.jackson.nullable.JsonNullable;
import org.threeten.bp.OffsetDateTime;

/**
 * UpdateProductCouponPayload
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-05-04T06:27:05.446126Z[Etc/UTC]")
public class UpdateProductCouponPayload {
  public static final String SERIALIZED_NAME_PERCENT = "percent";
  @SerializedName(SERIALIZED_NAME_PERCENT)
  private Integer percent;

  public static final String SERIALIZED_NAME_CODE = "code";
  @SerializedName(SERIALIZED_NAME_CODE)
  private String code;

  public static final String SERIALIZED_NAME_MAX_USES = "maxUses";
  @SerializedName(SERIALIZED_NAME_MAX_USES)
  private Integer maxUses;

  public static final String SERIALIZED_NAME_EXPIRES_AT = "expiresAt";
  @SerializedName(SERIALIZED_NAME_EXPIRES_AT)
  private OffsetDateTime expiresAt;

  public static final String SERIALIZED_NAME_BOUND_USER_ID = "boundUserId";
  @SerializedName(SERIALIZED_NAME_BOUND_USER_ID)
  private UUID boundUserId;


  public UpdateProductCouponPayload percent(Integer percent) {
    
    this.percent = percent;
    return this;
  }

   /**
   * Get percent
   * minimum: 1
   * maximum: 90
   * @return percent
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getPercent() {
    return percent;
  }


  public void setPercent(Integer percent) {
    this.percent = percent;
  }


  public UpdateProductCouponPayload code(String code) {
    
    this.code = code;
    return this;
  }

   /**
   * Get code
   * @return code
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getCode() {
    return code;
  }


  public void setCode(String code) {
    this.code = code;
  }


  public UpdateProductCouponPayload maxUses(Integer maxUses) {
    
    this.maxUses = maxUses;
    return this;
  }

   /**
   * Get maxUses
   * minimum: 1
   * maximum: 100
   * @return maxUses
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getMaxUses() {
    return maxUses;
  }


  public void setMaxUses(Integer maxUses) {
    this.maxUses = maxUses;
  }


  public UpdateProductCouponPayload expiresAt(OffsetDateTime expiresAt) {
    
    this.expiresAt = expiresAt;
    return this;
  }

   /**
   * Get expiresAt
   * @return expiresAt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public OffsetDateTime getExpiresAt() {
    return expiresAt;
  }


  public void setExpiresAt(OffsetDateTime expiresAt) {
    this.expiresAt = expiresAt;
  }


  public UpdateProductCouponPayload boundUserId(UUID boundUserId) {
    
    this.boundUserId = boundUserId;
    return this;
  }

   /**
   * Get boundUserId
   * @return boundUserId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public UUID getBoundUserId() {
    return boundUserId;
  }


  public void setBoundUserId(UUID boundUserId) {
    this.boundUserId = boundUserId;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdateProductCouponPayload updateProductCouponPayload = (UpdateProductCouponPayload) o;
    return Objects.equals(this.percent, updateProductCouponPayload.percent) &&
        Objects.equals(this.code, updateProductCouponPayload.code) &&
        Objects.equals(this.maxUses, updateProductCouponPayload.maxUses) &&
        Objects.equals(this.expiresAt, updateProductCouponPayload.expiresAt) &&
        Objects.equals(this.boundUserId, updateProductCouponPayload.boundUserId);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(percent, code, maxUses, expiresAt, boundUserId);
  }

  private static <T> int hashCodeNullable(JsonNullable<T> a) {
    if (a == null) {
      return 1;
    }
    return a.isPresent() ? Arrays.deepHashCode(new Object[]{a.get()}) : 31;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateProductCouponPayload {\n");
    sb.append("    percent: ").append(toIndentedString(percent)).append("\n");
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    maxUses: ").append(toIndentedString(maxUses)).append("\n");
    sb.append("    expiresAt: ").append(toIndentedString(expiresAt)).append("\n");
    sb.append("    boundUserId: ").append(toIndentedString(boundUserId)).append("\n");
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

