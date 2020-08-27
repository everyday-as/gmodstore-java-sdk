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
import no.everyday.gmodstore_sdk.model.AddonStatsViewsCurrent;
/**
 * AddonStatsViews
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-08-27T03:37:31.992165Z[Etc/UTC]")
public class AddonStatsViews {
  @SerializedName("current")
  private AddonStatsViewsCurrent current = null;

  @SerializedName("previous")
  private AddonStatsViewsCurrent previous = null;

  public AddonStatsViews current(AddonStatsViewsCurrent current) {
    this.current = current;
    return this;
  }

   /**
   * Get current
   * @return current
  **/
  @Schema(description = "")
  public AddonStatsViewsCurrent getCurrent() {
    return current;
  }

  public void setCurrent(AddonStatsViewsCurrent current) {
    this.current = current;
  }

  public AddonStatsViews previous(AddonStatsViewsCurrent previous) {
    this.previous = previous;
    return this;
  }

   /**
   * Get previous
   * @return previous
  **/
  @Schema(description = "")
  public AddonStatsViewsCurrent getPrevious() {
    return previous;
  }

  public void setPrevious(AddonStatsViewsCurrent previous) {
    this.previous = previous;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AddonStatsViews addonStatsViews = (AddonStatsViews) o;
    return Objects.equals(this.current, addonStatsViews.current) &&
        Objects.equals(this.previous, addonStatsViews.previous);
  }

  @Override
  public int hashCode() {
    return Objects.hash(current, previous);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AddonStatsViews {\n");
    
    sb.append("    current: ").append(toIndentedString(current)).append("\n");
    sb.append("    previous: ").append(toIndentedString(previous)).append("\n");
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
