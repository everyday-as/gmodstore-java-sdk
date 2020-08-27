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
 * AddonStatsViewsCurrent
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-08-27T02:49:59.885063Z[Etc/UTC]")
public class AddonStatsViewsCurrent {
  @SerializedName("day")
  private String day = null;

  @SerializedName("month")
  private String month = null;

  public AddonStatsViewsCurrent day(String day) {
    this.day = day;
    return this;
  }

   /**
   * Get day
   * @return day
  **/
  @Schema(description = "")
  public String getDay() {
    return day;
  }

  public void setDay(String day) {
    this.day = day;
  }

  public AddonStatsViewsCurrent month(String month) {
    this.month = month;
    return this;
  }

   /**
   * Get month
   * @return month
  **/
  @Schema(description = "")
  public String getMonth() {
    return month;
  }

  public void setMonth(String month) {
    this.month = month;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AddonStatsViewsCurrent addonStatsViewsCurrent = (AddonStatsViewsCurrent) o;
    return Objects.equals(this.day, addonStatsViewsCurrent.day) &&
        Objects.equals(this.month, addonStatsViewsCurrent.month);
  }

  @Override
  public int hashCode() {
    return Objects.hash(day, month);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AddonStatsViewsCurrent {\n");
    
    sb.append("    day: ").append(toIndentedString(day)).append("\n");
    sb.append("    month: ").append(toIndentedString(month)).append("\n");
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
