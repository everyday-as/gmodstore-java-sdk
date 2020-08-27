/*
 * GmodStore
 * Welcome to the GmodStore API! You can use our API to access Gmodstore API endpoints, which can be used interact with Gmodstore programmatically.
 *
 * The version of the OpenAPI document: 1.0.1
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
import no.everyday.gmodstore_sdk.model.Addon;
import no.everyday.gmodstore_sdk.model.OrderItem;
import no.everyday.gmodstore_sdk.model.User;
import org.threeten.bp.OffsetDateTime;

/**
 * AddonPurchase
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-08-27T18:46:03.868123Z[Etc/UTC]")
public class AddonPurchase {
  public static final String SERIALIZED_NAME_REVOKED = "revoked";
  @SerializedName(SERIALIZED_NAME_REVOKED)
  private Boolean revoked;

  public static final String SERIALIZED_NAME_CREATED_AT = "created_at";
  @SerializedName(SERIALIZED_NAME_CREATED_AT)
  private OffsetDateTime createdAt;

  public static final String SERIALIZED_NAME_UPDATED_AT = "updated_at";
  @SerializedName(SERIALIZED_NAME_UPDATED_AT)
  private Integer updatedAt;

  public static final String SERIALIZED_NAME_ADDON = "addon";
  @SerializedName(SERIALIZED_NAME_ADDON)
  private Addon addon;

  public static final String SERIALIZED_NAME_ORDER_ITEM = "order_item";
  @SerializedName(SERIALIZED_NAME_ORDER_ITEM)
  private OrderItem orderItem;

  public static final String SERIALIZED_NAME_USER = "user";
  @SerializedName(SERIALIZED_NAME_USER)
  private User user;


  public AddonPurchase revoked(Boolean revoked) {
    
    this.revoked = revoked;
    return this;
  }

   /**
   * Get revoked
   * @return revoked
  **/
  @ApiModelProperty(required = true, value = "")

  public Boolean getRevoked() {
    return revoked;
  }


  public void setRevoked(Boolean revoked) {
    this.revoked = revoked;
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

  public Integer getUpdatedAt() {
    return updatedAt;
  }




  public AddonPurchase addon(Addon addon) {
    
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


  public AddonPurchase orderItem(OrderItem orderItem) {
    
    this.orderItem = orderItem;
    return this;
  }

   /**
   * Get orderItem
   * @return orderItem
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public OrderItem getOrderItem() {
    return orderItem;
  }


  public void setOrderItem(OrderItem orderItem) {
    this.orderItem = orderItem;
  }


  public AddonPurchase user(User user) {
    
    this.user = user;
    return this;
  }

   /**
   * Get user
   * @return user
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public User getUser() {
    return user;
  }


  public void setUser(User user) {
    this.user = user;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AddonPurchase addonPurchase = (AddonPurchase) o;
    return Objects.equals(this.revoked, addonPurchase.revoked) &&
        Objects.equals(this.createdAt, addonPurchase.createdAt) &&
        Objects.equals(this.updatedAt, addonPurchase.updatedAt) &&
        Objects.equals(this.addon, addonPurchase.addon) &&
        Objects.equals(this.orderItem, addonPurchase.orderItem) &&
        Objects.equals(this.user, addonPurchase.user);
  }

  @Override
  public int hashCode() {
    return Objects.hash(revoked, createdAt, updatedAt, addon, orderItem, user);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AddonPurchase {\n");
    sb.append("    revoked: ").append(toIndentedString(revoked)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
    sb.append("    addon: ").append(toIndentedString(addon)).append("\n");
    sb.append("    orderItem: ").append(toIndentedString(orderItem)).append("\n");
    sb.append("    user: ").append(toIndentedString(user)).append("\n");
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

