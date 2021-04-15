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
import no.everyday.gmodstore_sdk.model.User;

/**
 * AddonReview
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-04-15T20:03:14.001768Z[Etc/UTC]")
public class AddonReview {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private Integer id;

  public static final String SERIALIZED_NAME_TITLE = "title";
  @SerializedName(SERIALIZED_NAME_TITLE)
  private String title;

  public static final String SERIALIZED_NAME_VERSION = "version";
  @SerializedName(SERIALIZED_NAME_VERSION)
  private String version;

  public static final String SERIALIZED_NAME_BODY = "body";
  @SerializedName(SERIALIZED_NAME_BODY)
  private String body;

  public static final String SERIALIZED_NAME_RATING = "rating";
  @SerializedName(SERIALIZED_NAME_RATING)
  private BigDecimal rating;

  public static final String SERIALIZED_NAME_ADDON = "addon";
  @SerializedName(SERIALIZED_NAME_ADDON)
  private Addon addon;

  public static final String SERIALIZED_NAME_AUTHOR = "author";
  @SerializedName(SERIALIZED_NAME_AUTHOR)
  private User author;


  public AddonReview id(Integer id) {
    
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

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
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

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
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

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
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

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
   * minimum: 1
   * maximum: 5
   * @return rating
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

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
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

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
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

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

