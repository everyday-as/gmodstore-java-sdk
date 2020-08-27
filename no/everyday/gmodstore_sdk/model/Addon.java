/*
 * GmodStore
 * Welcome to the GmodStore API! You can use our API to access Gmodstore API endpoints, which can be used interact with Gmodstore programmatically.
 *
 * The version of the OpenAPI document: 1.0.1
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
import no.everyday.gmodstore_sdk.model.AddonVersion;
import no.everyday.gmodstore_sdk.model.Team;
import org.threeten.bp.OffsetDateTime;

/**
 * Addon
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-08-27T19:20:40.370902Z[Etc/UTC]")
public class Addon {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private Integer id;

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


  public Addon id(Integer id) {
    
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


  public Addon active(Boolean active) {
    
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


  public Addon name(String name) {
    
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


  public Addon shortDescription(String shortDescription) {
    
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


  public Addon description(String description) {
    
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


  public Addon requirements(List<String> requirements) {
    
    this.requirements = requirements;
    return this;
  }

  public Addon addRequirementsItem(String requirementsItem) {
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


  public Addon price(AddonPrice price) {
    
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


  public Addon images(AddonImages images) {
    
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




  public Addon latestVersion(AddonVersion latestVersion) {
    
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


  public Addon team(Team team) {
    
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Addon addon = (Addon) o;
    return Objects.equals(this.id, addon.id) &&
        Objects.equals(this.active, addon.active) &&
        Objects.equals(this.name, addon.name) &&
        Objects.equals(this.shortDescription, addon.shortDescription) &&
        Objects.equals(this.description, addon.description) &&
        Objects.equals(this.requirements, addon.requirements) &&
        Objects.equals(this.price, addon.price) &&
        Objects.equals(this.images, addon.images) &&
        Objects.equals(this.slug, addon.slug) &&
        Objects.equals(this.route, addon.route) &&
        Objects.equals(this.createdAt, addon.createdAt) &&
        Objects.equals(this.updatedAt, addon.updatedAt) &&
        Objects.equals(this.latestVersion, addon.latestVersion) &&
        Objects.equals(this.team, addon.team);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, active, name, shortDescription, description, requirements, price, images, slug, route, createdAt, updatedAt, latestVersion, team);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Addon {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    active: ").append(toIndentedString(active)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    shortDescription: ").append(toIndentedString(shortDescription)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    requirements: ").append(toIndentedString(requirements)).append("\n");
    sb.append("    price: ").append(toIndentedString(price)).append("\n");
    sb.append("    images: ").append(toIndentedString(images)).append("\n");
    sb.append("    slug: ").append(toIndentedString(slug)).append("\n");
    sb.append("    route: ").append(toIndentedString(route)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
    sb.append("    latestVersion: ").append(toIndentedString(latestVersion)).append("\n");
    sb.append("    team: ").append(toIndentedString(team)).append("\n");
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

