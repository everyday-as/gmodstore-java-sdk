/*
 * GmodStore API
 * Welcome to the GmodStore API! You can use our API to access GmodStore API endpoints, which can be used interact with GmodStore programmatically.
 *
 * The version of the OpenAPI document: 1.2.0
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
import java.net.URI;

/**
 * AddonImages
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-10-28T17:06:00.934176Z[Etc/UTC]")
public class AddonImages {
  public static final String SERIALIZED_NAME_BIGSPOT = "bigspot";
  @SerializedName(SERIALIZED_NAME_BIGSPOT)
  private URI bigspot;

  public static final String SERIALIZED_NAME_LISTING = "listing";
  @SerializedName(SERIALIZED_NAME_LISTING)
  private URI listing;

  public static final String SERIALIZED_NAME_LISTING_SMALL = "listing_small";
  @SerializedName(SERIALIZED_NAME_LISTING_SMALL)
  private URI listingSmall;


  public AddonImages bigspot(URI bigspot) {
    
    this.bigspot = bigspot;
    return this;
  }

   /**
   * Get bigspot
   * @return bigspot
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public URI getBigspot() {
    return bigspot;
  }


  public void setBigspot(URI bigspot) {
    this.bigspot = bigspot;
  }


  public AddonImages listing(URI listing) {
    
    this.listing = listing;
    return this;
  }

   /**
   * Get listing
   * @return listing
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public URI getListing() {
    return listing;
  }


  public void setListing(URI listing) {
    this.listing = listing;
  }


  public AddonImages listingSmall(URI listingSmall) {
    
    this.listingSmall = listingSmall;
    return this;
  }

   /**
   * Get listingSmall
   * @return listingSmall
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public URI getListingSmall() {
    return listingSmall;
  }


  public void setListingSmall(URI listingSmall) {
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
    AddonImages addonImages = (AddonImages) o;
    return Objects.equals(this.bigspot, addonImages.bigspot) &&
        Objects.equals(this.listing, addonImages.listing) &&
        Objects.equals(this.listingSmall, addonImages.listingSmall);
  }

  @Override
  public int hashCode() {
    return Objects.hash(bigspot, listing, listingSmall);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AddonImages {\n");
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

