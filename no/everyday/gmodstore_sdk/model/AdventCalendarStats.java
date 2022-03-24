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

/**
 * AdventCalendarStats
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-03-24T21:08:52.646883Z[Etc/UTC]")
public class AdventCalendarStats {
  public static final String SERIALIZED_NAME_SQUARES_OPENED = "squares_opened";
  @SerializedName(SERIALIZED_NAME_SQUARES_OPENED)
  private Integer squaresOpened;

  public static final String SERIALIZED_NAME_ADDONS_AWARDED = "addons_awarded";
  @SerializedName(SERIALIZED_NAME_ADDONS_AWARDED)
  private Integer addonsAwarded;

  public static final String SERIALIZED_NAME_COUPONS_AWARDED = "coupons_awarded";
  @SerializedName(SERIALIZED_NAME_COUPONS_AWARDED)
  private Integer couponsAwarded;


  public AdventCalendarStats squaresOpened(Integer squaresOpened) {
    
    this.squaresOpened = squaresOpened;
    return this;
  }

   /**
   * Get squaresOpened
   * @return squaresOpened
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getSquaresOpened() {
    return squaresOpened;
  }


  public void setSquaresOpened(Integer squaresOpened) {
    this.squaresOpened = squaresOpened;
  }


  public AdventCalendarStats addonsAwarded(Integer addonsAwarded) {
    
    this.addonsAwarded = addonsAwarded;
    return this;
  }

   /**
   * Get addonsAwarded
   * @return addonsAwarded
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getAddonsAwarded() {
    return addonsAwarded;
  }


  public void setAddonsAwarded(Integer addonsAwarded) {
    this.addonsAwarded = addonsAwarded;
  }


  public AdventCalendarStats couponsAwarded(Integer couponsAwarded) {
    
    this.couponsAwarded = couponsAwarded;
    return this;
  }

   /**
   * Get couponsAwarded
   * @return couponsAwarded
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getCouponsAwarded() {
    return couponsAwarded;
  }


  public void setCouponsAwarded(Integer couponsAwarded) {
    this.couponsAwarded = couponsAwarded;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AdventCalendarStats adventCalendarStats = (AdventCalendarStats) o;
    return Objects.equals(this.squaresOpened, adventCalendarStats.squaresOpened) &&
        Objects.equals(this.addonsAwarded, adventCalendarStats.addonsAwarded) &&
        Objects.equals(this.couponsAwarded, adventCalendarStats.couponsAwarded);
  }

  @Override
  public int hashCode() {
    return Objects.hash(squaresOpened, addonsAwarded, couponsAwarded);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AdventCalendarStats {\n");
    sb.append("    squaresOpened: ").append(toIndentedString(squaresOpened)).append("\n");
    sb.append("    addonsAwarded: ").append(toIndentedString(addonsAwarded)).append("\n");
    sb.append("    couponsAwarded: ").append(toIndentedString(couponsAwarded)).append("\n");
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

