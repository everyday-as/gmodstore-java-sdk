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

/**
 * ProductImages
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-04-13T21:14:19.338654Z[Etc/UTC]")
public class ProductImages {
  public static final String SERIALIZED_NAME_BIGSPOT = "bigspot";
  @SerializedName(SERIALIZED_NAME_BIGSPOT)
  private String bigspot;

  public static final String SERIALIZED_NAME_LISTING = "listing";
  @SerializedName(SERIALIZED_NAME_LISTING)
  private String listing;

  public static final String SERIALIZED_NAME_LISTING_SMALL = "listingSmall";
  @SerializedName(SERIALIZED_NAME_LISTING_SMALL)
  private String listingSmall;


  public ProductImages bigspot(String bigspot) {
    
    this.bigspot = bigspot;
    return this;
  }

   /**
   * Get bigspot
   * @return bigspot
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getBigspot() {
    return bigspot;
  }


  public void setBigspot(String bigspot) {
    this.bigspot = bigspot;
  }


  public ProductImages listing(String listing) {
    
    this.listing = listing;
    return this;
  }

   /**
   * Get listing
   * @return listing
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getListing() {
    return listing;
  }


  public void setListing(String listing) {
    this.listing = listing;
  }


  public ProductImages listingSmall(String listingSmall) {
    
    this.listingSmall = listingSmall;
    return this;
  }

   /**
   * Get listingSmall
   * @return listingSmall
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getListingSmall() {
    return listingSmall;
  }


  public void setListingSmall(String listingSmall) {
    this.listingSmall = listingSmall;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProductImages productImages = (ProductImages) o;
    return Objects.equals(this.bigspot, productImages.bigspot) &&
        Objects.equals(this.listing, productImages.listing) &&
        Objects.equals(this.listingSmall, productImages.listingSmall);
  }

  @Override
  public int hashCode() {
    return Objects.hash(bigspot, listing, listingSmall);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProductImages {\n");
    sb.append("    bigspot: ").append(toIndentedString(bigspot)).append("\n");
    sb.append("    listing: ").append(toIndentedString(listing)).append("\n");
    sb.append("    listingSmall: ").append(toIndentedString(listingSmall)).append("\n");
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
