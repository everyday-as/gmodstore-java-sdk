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
import no.everyday.gmodstore_sdk.model.AddonStatsRevenue;
import no.everyday.gmodstore_sdk.model.AddonStatsSales;
import no.everyday.gmodstore_sdk.model.AddonStatsViews;

/**
 * AddonStats
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-11-03T15:34:03.666245Z[Etc/UTC]")
public class AddonStats {
  public static final String SERIALIZED_NAME_REVENUE = "revenue";
  @SerializedName(SERIALIZED_NAME_REVENUE)
  private AddonStatsRevenue revenue;

  public static final String SERIALIZED_NAME_VIEWS = "views";
  @SerializedName(SERIALIZED_NAME_VIEWS)
  private AddonStatsViews views;

  public static final String SERIALIZED_NAME_SALES = "sales";
  @SerializedName(SERIALIZED_NAME_SALES)
  private AddonStatsSales sales;


  public AddonStats revenue(AddonStatsRevenue revenue) {
    
    this.revenue = revenue;
    return this;
  }

   /**
   * Get revenue
   * @return revenue
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

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
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

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
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public AddonStatsSales getSales() {
    return sales;
  }


  public void setSales(AddonStatsSales sales) {
    this.sales = sales;
  }


  @Override
  public boolean equals(Object o) {
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

