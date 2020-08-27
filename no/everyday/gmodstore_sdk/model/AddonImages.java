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
/**
 * AddonImages
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-08-27T02:30:11.740426Z[Etc/UTC]")
public class AddonImages {
  @SerializedName("bigspot")
  private String bigspot = null;

  @SerializedName("listing")
  private String listing = null;

  @SerializedName("listing_small")
  private String listingSmall = null;

  public AddonImages bigspot(String bigspot) {
    this.bigspot = bigspot;
    return this;
  }

   /**
   * Get bigspot
   * @return bigspot
  **/
  @Schema(description = "")
  public String getBigspot() {
    return bigspot;
  }

  public void setBigspot(String bigspot) {
    this.bigspot = bigspot;
  }

  public AddonImages listing(String listing) {
    this.listing = listing;
    return this;
  }

   /**
   * Get listing
   * @return listing
  **/
  @Schema(description = "")
  public String getListing() {
    return listing;
  }

  public void setListing(String listing) {
    this.listing = listing;
  }

  public AddonImages listingSmall(String listingSmall) {
    this.listingSmall = listingSmall;
    return this;
  }

   /**
   * Get listingSmall
   * @return listingSmall
  **/
  @Schema(description = "")
  public String getListingSmall() {
    return listingSmall;
  }

  public void setListingSmall(String listingSmall) {
    this.listingSmall = listingSmall;
  }


  @Override
  public boolean equals(java.lang.Object o) {
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
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}
