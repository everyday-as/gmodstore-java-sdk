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
import java.math.BigDecimal;
import no.everyday.gmodstore_sdk.model.Addon;
import no.everyday.gmodstore_sdk.model.User;
/**
 * AddonReview
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-01-12T21:49:39.344069Z[Etc/UTC]")
public class AddonReview {
  @SerializedName("id")
  private Integer id = null;

  @SerializedName("title")
  private String title = null;

  @SerializedName("version")
  private String version = null;

  @SerializedName("body")
  private String body = null;

  @SerializedName("rating")
  private BigDecimal rating = null;

  @SerializedName("addon")
  private Addon addon = null;

  @SerializedName("author")
  private User author = null;

  public AddonReview id(Integer id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * minimum: 1
   * @return id
  **/
  @Schema(required = true, description = "")
  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public AddonReview title(String title) {
    this.title = title;
    return this;
  }

   /**
   * Get title
   * @return title
  **/
  @Schema(required = true, description = "")
  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public AddonReview version(String version) {
    this.version = version;
    return this;
  }

   /**
   * Get version
   * @return version
  **/
  @Schema(required = true, description = "")
  public String getVersion() {
    return version;
  }

  public void setVersion(String version) {
    this.version = version;
  }

  public AddonReview body(String body) {
    this.body = body;
    return this;
  }

   /**
   * Get body
   * @return body
  **/
  @Schema(required = true, description = "")
  public String getBody() {
    return body;
  }

  public void setBody(String body) {
    this.body = body;
  }

  public AddonReview rating(BigDecimal rating) {
    this.rating = rating;
    return this;
  }

   /**
   * Get rating
   * minimum: 0
   * maximum: 5
   * @return rating
  **/
  @Schema(required = true, description = "")
  public BigDecimal getRating() {
    return rating;
  }

  public void setRating(BigDecimal rating) {
    this.rating = rating;
  }

  public AddonReview addon(Addon addon) {
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

  public AddonReview author(User author) {
    this.author = author;
    return this;
  }

   /**
   * Get author
   * @return author
  **/
  @Schema(description = "")
  public User getAuthor() {
    return author;
  }

  public void setAuthor(User author) {
    this.author = author;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AddonReview addonReview = (AddonReview) o;
    return Objects.equals(this.id, addonReview.id) &&
        Objects.equals(this.title, addonReview.title) &&
        Objects.equals(this.version, addonReview.version) &&
        Objects.equals(this.body, addonReview.body) &&
        Objects.equals(this.rating, addonReview.rating) &&
        Objects.equals(this.addon, addonReview.addon) &&
        Objects.equals(this.author, addonReview.author);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, title, version, body, rating, addon, author);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AddonReview {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    body: ").append(toIndentedString(body)).append("\n");
    sb.append("    rating: ").append(toIndentedString(rating)).append("\n");
    sb.append("    addon: ").append(toIndentedString(addon)).append("\n");
    sb.append("    author: ").append(toIndentedString(author)).append("\n");
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
