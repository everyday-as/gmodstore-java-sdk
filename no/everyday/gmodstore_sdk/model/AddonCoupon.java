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
import java.math.BigDecimal;
import no.everyday.gmodstore_sdk.model.Addon;
import org.threeten.bp.OffsetDateTime;

/**
 * AddonCoupon
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-09-04T19:31:34.449268Z[Etc/UTC]")
public class AddonCoupon {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private Integer id;

  public static final String SERIALIZED_NAME_CODE = "code";
  @SerializedName(SERIALIZED_NAME_CODE)
  private String code;

  public static final String SERIALIZED_NAME_PERCENT = "percent";
  @SerializedName(SERIALIZED_NAME_PERCENT)
  private BigDecimal percent;

  public static final String SERIALIZED_NAME_MAX_USES = "max_uses";
  @SerializedName(SERIALIZED_NAME_MAX_USES)
  private Integer maxUses;

  public static final String SERIALIZED_NAME_EXPIRES_AT = "expires_at";
  @SerializedName(SERIALIZED_NAME_EXPIRES_AT)
  private OffsetDateTime expiresAt;

  public static final String SERIALIZED_NAME_CREATED_AT = "created_at";
  @SerializedName(SERIALIZED_NAME_CREATED_AT)
  private OffsetDateTime createdAt;

  public static final String SERIALIZED_NAME_UPDATED_AT = "updated_at";
  @SerializedName(SERIALIZED_NAME_UPDATED_AT)
  private OffsetDateTime updatedAt;

  public static final String SERIALIZED_NAME_ADDON = "addon";
  @SerializedName(SERIALIZED_NAME_ADDON)
  private Addon addon;


   /**
   * Get id
   * minimum: 1
   * @return id
  **/
  @ApiModelProperty(required = true, value = "")

  public Integer getId() {
    return id;
  }




  public AddonCoupon code(String code) {
    
    this.code = code;
    return this;
  }

   /**
   * Get code
   * @return code
  **/
  @ApiModelProperty(required = true, value = "")

  public String getCode() {
    return code;
  }


  public void setCode(String code) {
    this.code = code;
  }


  public AddonCoupon percent(BigDecimal percent) {
    
    this.percent = percent;
    return this;
  }

   /**
   * Get percent
   * minimum: 1
   * maximum: 99
   * @return percent
  **/
  @ApiModelProperty(required = true, value = "")

  public BigDecimal getPercent() {
    return percent;
  }


  public void setPercent(BigDecimal percent) {
    this.percent = percent;
  }


  public AddonCoupon maxUses(Integer maxUses) {
    
    this.maxUses = maxUses;
    return this;
  }

   /**
   * Get maxUses
   * minimum: 1
   * @return maxUses
  **/
  @ApiModelProperty(required = true, value = "")

  public Integer getMaxUses() {
    return maxUses;
  }


  public void setMaxUses(Integer maxUses) {
    this.maxUses = maxUses;
  }


  public AddonCoupon expiresAt(OffsetDateTime expiresAt) {
    
    this.expiresAt = expiresAt;
    return this;
  }

   /**
   * A future date less than 2 weeks from today
   * @return expiresAt
  **/
  @ApiModelProperty(required = true, value = "A future date less than 2 weeks from today")

  public OffsetDateTime getExpiresAt() {
    return expiresAt;
  }


  public void setExpiresAt(OffsetDateTime expiresAt) {
    this.expiresAt = expiresAt;
  }


   /**
   * Get createdAt
   * @return createdAt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public OffsetDateTime getCreatedAt() {
    return createdAt;
  }




   /**
   * Get updatedAt
   * @return updatedAt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public OffsetDateTime getUpdatedAt() {
    return updatedAt;
  }




  public AddonCoupon addon(Addon addon) {
    
    this.addon = addon;
    return this;
  }

   /**
   * Get addon
   * @return addon
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Addon getAddon() {
    return addon;
  }


  public void setAddon(Addon addon) {
    this.addon = addon;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AddonCoupon addonCoupon = (AddonCoupon) o;
    return Objects.equals(this.id, addonCoupon.id) &&
        Objects.equals(this.code, addonCoupon.code) &&
        Objects.equals(this.percent, addonCoupon.percent) &&
        Objects.equals(this.maxUses, addonCoupon.maxUses) &&
        Objects.equals(this.expiresAt, addonCoupon.expiresAt) &&
        Objects.equals(this.createdAt, addonCoupon.createdAt) &&
        Objects.equals(this.updatedAt, addonCoupon.updatedAt) &&
        Objects.equals(this.addon, addonCoupon.addon);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, code, percent, maxUses, expiresAt, createdAt, updatedAt, addon);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AddonCoupon {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    percent: ").append(toIndentedString(percent)).append("\n");
    sb.append("    maxUses: ").append(toIndentedString(maxUses)).append("\n");
    sb.append("    expiresAt: ").append(toIndentedString(expiresAt)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
    sb.append("    addon: ").append(toIndentedString(addon)).append("\n");
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

