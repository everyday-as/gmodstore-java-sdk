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
import no.everyday.gmodstore_sdk.model.AddonStatsRevenue;
import no.everyday.gmodstore_sdk.model.AddonStatsSales;
import no.everyday.gmodstore_sdk.model.AddonStatsViews;
/**
 * AddonStats
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-08-27T02:30:11.740426Z[Etc/UTC]")
public class AddonStats {
  @SerializedName("revenue")
  private AddonStatsRevenue revenue = null;

  @SerializedName("views")
  private AddonStatsViews views = null;

  @SerializedName("sales")
  private AddonStatsSales sales = null;

  public AddonStats revenue(AddonStatsRevenue revenue) {
    this.revenue = revenue;
    return this;
  }

   /**
   * Get revenue
   * @return revenue
  **/
  @Schema(description = "")
  public AddonStatsRevenue getRevenue() {
    return revenue;
  }

  public void setRevenue(AddonStatsRevenue revenue) {
    this.revenue = revenue;
  }

  public AddonStats views(AddonStatsViews views) {
    this.views = views;
    return this;
  }

   /**
   * Get views
   * @return views
  **/
  @Schema(description = "")
  public AddonStatsViews getViews() {
    return views;
  }

  public void setViews(AddonStatsViews views) {
    this.views = views;
  }

  public AddonStats sales(AddonStatsSales sales) {
    this.sales = sales;
    return this;
  }

   /**
   * Get sales
   * @return sales
  **/
  @Schema(description = "")
  public AddonStatsSales getSales() {
    return sales;
  }

  public void setSales(AddonStatsSales sales) {
    this.sales = sales;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AddonStats addonStats = (AddonStats) o;
    return Objects.equals(this.revenue, addonStats.revenue) &&
        Objects.equals(this.views, addonStats.views) &&
        Objects.equals(this.sales, addonStats.sales);
  }

  @Override
  public int hashCode() {
    return Objects.hash(revenue, views, sales);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AddonStats {\n");
    
    sb.append("    revenue: ").append(toIndentedString(revenue)).append("\n");
    sb.append("    views: ").append(toIndentedString(views)).append("\n");
    sb.append("    sales: ").append(toIndentedString(sales)).append("\n");
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
