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
import no.everyday.gmodstore_sdk.model.Addon;
import no.everyday.gmodstore_sdk.model.OrderItem;
import no.everyday.gmodstore_sdk.model.User;
import org.threeten.bp.OffsetDateTime;
/**
 * AddonPurchase
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2019-12-15T18:22:16.480775Z[Etc/UTC]")
public class AddonPurchase {
  @SerializedName("revoked")
  private Boolean revoked = null;

  @SerializedName("created_at")
  private OffsetDateTime createdAt = null;

  @SerializedName("updated_at")
  private Integer updatedAt = null;

  @SerializedName("addon")
  private Addon addon = null;

  @SerializedName("order_item")
  private OrderItem orderItem = null;

  @SerializedName("user")
  private User user = null;

  public AddonPurchase revoked(Boolean revoked) {
    this.revoked = revoked;
    return this;
  }

   /**
   * Get revoked
   * @return revoked
  **/
  @Schema(required = true, description = "")
  public Boolean isRevoked() {
    return revoked;
  }

  public void setRevoked(Boolean revoked) {
    this.revoked = revoked;
  }

  public AddonPurchase createdAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
    return this;
  }

   /**
   * Get createdAt
   * @return createdAt
  **/
  @Schema(required = true, description = "")
  public OffsetDateTime getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
  }

  public AddonPurchase updatedAt(Integer updatedAt) {
    this.updatedAt = updatedAt;
    return this;
  }

   /**
   * Get updatedAt
   * @return updatedAt
  **/
  @Schema(required = true, description = "")
  public Integer getUpdatedAt() {
    return updatedAt;
  }

  public void setUpdatedAt(Integer updatedAt) {
    this.updatedAt = updatedAt;
  }

  public AddonPurchase addon(Addon addon) {
    this.addon = addon;
    return this;
  }

   /**
   * Get addon
   * @return addon
  **/
  @Schema(description = "")
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
  @Schema(description = "")
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
  @Schema(description = "")
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
