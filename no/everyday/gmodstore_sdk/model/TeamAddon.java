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
import java.util.ArrayList;
import java.util.List;
import no.everyday.gmodstore_sdk.model.AddonImages;
import no.everyday.gmodstore_sdk.model.AddonPrice;
import no.everyday.gmodstore_sdk.model.AddonStats;
import no.everyday.gmodstore_sdk.model.AddonVersion;
import no.everyday.gmodstore_sdk.model.Team;
import org.openapitools.jackson.nullable.JsonNullable;
import org.threeten.bp.OffsetDateTime;

/**
 * TeamAddon
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-03-27T22:03:29.204136Z[Etc/UTC]")
public class TeamAddon {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private Long id;

  public static final String SERIALIZED_NAME_ACTIVE = "active";
  @SerializedName(SERIALIZED_NAME_ACTIVE)
  private Boolean active;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_SHORT_DESCRIPTION = "short_description";
  @SerializedName(SERIALIZED_NAME_SHORT_DESCRIPTION)
  private String shortDescription;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_REQUIREMENTS = "requirements";
  @SerializedName(SERIALIZED_NAME_REQUIREMENTS)
  private List<String> requirements = null;

  public static final String SERIALIZED_NAME_PRICE = "price";
  @SerializedName(SERIALIZED_NAME_PRICE)
  private AddonPrice price;

  public static final String SERIALIZED_NAME_IMAGES = "images";
  @SerializedName(SERIALIZED_NAME_IMAGES)
  private AddonImages images;

  public static final String SERIALIZED_NAME_VIEWS = "views";
  @SerializedName(SERIALIZED_NAME_VIEWS)
  private Integer views;

  public static final String SERIALIZED_NAME_RATING_AVG = "rating_avg";
  @SerializedName(SERIALIZED_NAME_RATING_AVG)
  private String ratingAvg;

  public static final String SERIALIZED_NAME_RATING_COUNT = "rating_count";
  @SerializedName(SERIALIZED_NAME_RATING_COUNT)
  private Integer ratingCount;

  public static final String SERIALIZED_NAME_PURCHASES_COUNT = "purchases_count";
  @SerializedName(SERIALIZED_NAME_PURCHASES_COUNT)
  private Integer purchasesCount;

  public static final String SERIALIZED_NAME_DEPENDENT_ADDON = "dependent_addon";
  @SerializedName(SERIALIZED_NAME_DEPENDENT_ADDON)
  private Long dependentAddon;

  public static final String SERIALIZED_NAME_HAS_DRM = "has_drm";
  @SerializedName(SERIALIZED_NAME_HAS_DRM)
  private Boolean hasDrm;

  public static final String SERIALIZED_NAME_REQUIRES_CHROMIUM = "requires_chromium";
  @SerializedName(SERIALIZED_NAME_REQUIRES_CHROMIUM)
  private Boolean requiresChromium;

  public static final String SERIALIZED_NAME_SLUG = "slug";
  @SerializedName(SERIALIZED_NAME_SLUG)
  private String slug;

  public static final String SERIALIZED_NAME_ROUTE = "route";
  @SerializedName(SERIALIZED_NAME_ROUTE)
  private String route;

  public static final String SERIALIZED_NAME_CREATED_AT = "created_at";
  @SerializedName(SERIALIZED_NAME_CREATED_AT)
  private OffsetDateTime createdAt;

  public static final String SERIALIZED_NAME_UPDATED_AT = "updated_at";
  @SerializedName(SERIALIZED_NAME_UPDATED_AT)
  private OffsetDateTime updatedAt;

  public static final String SERIALIZED_NAME_LATEST_VERSION = "latest_version";
  @SerializedName(SERIALIZED_NAME_LATEST_VERSION)
  private AddonVersion latestVersion;

  public static final String SERIALIZED_NAME_TEAM = "team";
  @SerializedName(SERIALIZED_NAME_TEAM)
  private Team team;

  public static final String SERIALIZED_NAME_STATS = "stats";
  @SerializedName(SERIALIZED_NAME_STATS)
  private AddonStats stats;


  public TeamAddon id(Long id) {
    
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Long getId() {
    return id;
  }


  public void setId(Long id) {
    this.id = id;
  }


  public TeamAddon active(Boolean active) {
    
    this.active = active;
    return this;
  }

   /**
   * Get active
   * @return active
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getActive() {
    return active;
  }


  public void setActive(Boolean active) {
    this.active = active;
  }


  public TeamAddon name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public TeamAddon shortDescription(String shortDescription) {
    
    this.shortDescription = shortDescription;
    return this;
  }

   /**
   * Get shortDescription
   * @return shortDescription
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getShortDescription() {
    return shortDescription;
  }


  public void setShortDescription(String shortDescription) {
    this.shortDescription = shortDescription;
  }


  public TeamAddon description(String description) {
    
    this.description = description;
    return this;
  }

   /**
   * Get description
   * @return description
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getDescription() {
    return description;
  }


  public void setDescription(String description) {
    this.description = description;
  }


  public TeamAddon requirements(List<String> requirements) {
    
    this.requirements = requirements;
    return this;
  }

  public TeamAddon addRequirementsItem(String requirementsItem) {
    if (this.requirements == null) {
      this.requirements = new ArrayList<String>();
    }
    this.requirements.add(requirementsItem);
    return this;
  }

   /**
   * Get requirements
   * @return requirements
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<String> getRequirements() {
    return requirements;
  }


  public void setRequirements(List<String> requirements) {
    this.requirements = requirements;
  }


  public TeamAddon price(AddonPrice price) {
    
    this.price = price;
    return this;
  }

   /**
   * Get price
   * @return price
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public AddonPrice getPrice() {
    return price;
  }


  public void setPrice(AddonPrice price) {
    this.price = price;
  }


  public TeamAddon images(AddonImages images) {
    
    this.images = images;
    return this;
  }

   /**
   * Get images
   * @return images
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public AddonImages getImages() {
    return images;
  }


  public void setImages(AddonImages images) {
    this.images = images;
  }


   /**
   * Get views
   * @return views
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getViews() {
    return views;
  }




   /**
   * Get ratingAvg
   * @return ratingAvg
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getRatingAvg() {
    return ratingAvg;
  }




   /**
   * Get ratingCount
   * @return ratingCount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getRatingCount() {
    return ratingCount;
  }




   /**
   * Get purchasesCount
   * @return purchasesCount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getPurchasesCount() {
    return purchasesCount;
  }




   /**
   * Get dependentAddon
   * @return dependentAddon
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Long getDependentAddon() {
    return dependentAddon;
  }




   /**
   * Get hasDrm
   * @return hasDrm
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getHasDrm() {
    return hasDrm;
  }




   /**
   * Get requiresChromium
   * @return requiresChromium
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getRequiresChromium() {
    return requiresChromium;
  }




   /**
   * Get slug
   * @return slug
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getSlug() {
    return slug;
  }




   /**
   * Get route
   * @return route
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getRoute() {
    return route;
  }




   /**
   * Get createdAt
   * @return createdAt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public OffsetDateTime getCreatedAt() {
    return createdAt;
  }




   /**
   * Get updatedAt
   * @return updatedAt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public OffsetDateTime getUpdatedAt() {
    return updatedAt;
  }




  public TeamAddon latestVersion(AddonVersion latestVersion) {
    
    this.latestVersion = latestVersion;
    return this;
  }

   /**
   * Get latestVersion
   * @return latestVersion
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public AddonVersion getLatestVersion() {
    return latestVersion;
  }


  public void setLatestVersion(AddonVersion latestVersion) {
    this.latestVersion = latestVersion;
  }


  public TeamAddon team(Team team) {
    
    this.team = team;
    return this;
  }

   /**
   * Get team
   * @return team
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Team getTeam() {
    return team;
  }


  public void setTeam(Team team) {
    this.team = team;
  }


  public TeamAddon stats(AddonStats stats) {
    
    this.stats = stats;
    return this;
  }

   /**
   * Get stats
   * @return stats
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public AddonStats getStats() {
    return stats;
  }


  public void setStats(AddonStats stats) {
    this.stats = stats;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TeamAddon teamAddon = (TeamAddon) o;
    return Objects.equals(this.id, teamAddon.id) &&
        Objects.equals(this.active, teamAddon.active) &&
        Objects.equals(this.name, teamAddon.name) &&
        Objects.equals(this.shortDescription, teamAddon.shortDescription) &&
        Objects.equals(this.description, teamAddon.description) &&
        Objects.equals(this.requirements, teamAddon.requirements) &&
        Objects.equals(this.price, teamAddon.price) &&
        Objects.equals(this.images, teamAddon.images) &&
        Objects.equals(this.views, teamAddon.views) &&
        Objects.equals(this.ratingAvg, teamAddon.ratingAvg) &&
        Objects.equals(this.ratingCount, teamAddon.ratingCount) &&
        Objects.equals(this.purchasesCount, teamAddon.purchasesCount) &&
        Objects.equals(this.dependentAddon, teamAddon.dependentAddon) &&
        Objects.equals(this.hasDrm, teamAddon.hasDrm) &&
        Objects.equals(this.requiresChromium, teamAddon.requiresChromium) &&
        Objects.equals(this.slug, teamAddon.slug) &&
        Objects.equals(this.route, teamAddon.route) &&
        Objects.equals(this.createdAt, teamAddon.createdAt) &&
        Objects.equals(this.updatedAt, teamAddon.updatedAt) &&
        Objects.equals(this.latestVersion, teamAddon.latestVersion) &&
        Objects.equals(this.team, teamAddon.team) &&
        Objects.equals(this.stats, teamAddon.stats);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, active, name, shortDescription, description, requirements, price, images, views, ratingAvg, ratingCount, purchasesCount, dependentAddon, hasDrm, requiresChromium, slug, route, createdAt, updatedAt, latestVersion, team, stats);
  }

  private static <T> int hashCodeNullable(JsonNullable<T> a) {
    if (a == null) {
      return 1;
    }
    return a.isPresent() ? Arrays.deepHashCode(new Object[]{a.get()}) : 31;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TeamAddon {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    active: ").append(toIndentedString(active)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    shortDescription: ").append(toIndentedString(shortDescription)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    requirements: ").append(toIndentedString(requirements)).append("\n");
    sb.append("    price: ").append(toIndentedString(price)).append("\n");
    sb.append("    images: ").append(toIndentedString(images)).append("\n");
    sb.append("    views: ").append(toIndentedString(views)).append("\n");
    sb.append("    ratingAvg: ").append(toIndentedString(ratingAvg)).append("\n");
    sb.append("    ratingCount: ").append(toIndentedString(ratingCount)).append("\n");
    sb.append("    purchasesCount: ").append(toIndentedString(purchasesCount)).append("\n");
    sb.append("    dependentAddon: ").append(toIndentedString(dependentAddon)).append("\n");
    sb.append("    hasDrm: ").append(toIndentedString(hasDrm)).append("\n");
    sb.append("    requiresChromium: ").append(toIndentedString(requiresChromium)).append("\n");
    sb.append("    slug: ").append(toIndentedString(slug)).append("\n");
    sb.append("    route: ").append(toIndentedString(route)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
    sb.append("    latestVersion: ").append(toIndentedString(latestVersion)).append("\n");
    sb.append("    team: ").append(toIndentedString(team)).append("\n");
    sb.append("    stats: ").append(toIndentedString(stats)).append("\n");
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

