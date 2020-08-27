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

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-08-27T03:37:31.992165Z[Etc/UTC]")
public class Addon {
  @SerializedName("id")
  private Integer id = null;

  @SerializedName("active")
  private Boolean active = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("short_description")
  private String shortDescription = null;

  @SerializedName("description")
  private String description = null;

  @SerializedName("requirements")
  private List<String> requirements = new ArrayList<String>();

  @SerializedName("price")
  private AddonPrice price = null;

  @SerializedName("images")
  private AddonImages images = null;

  @SerializedName("slug")
  private String slug = null;

  @SerializedName("route")
  private String route = null;

  @SerializedName("created_at")
  private OffsetDateTime createdAt = null;

  @SerializedName("updated_at")
  private OffsetDateTime updatedAt = null;

  @SerializedName("latest_version")
  private AddonVersion latestVersion = null;

  @SerializedName("team")
  private Team team = null;

  public Addon id(Integer id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @Schema(required = true, description = "")
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
  @Schema(required = true, description = "")
  public Boolean isActive() {
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
  @Schema(required = true, description = "")
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
  @Schema(required = true, description = "")
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
  @Schema(required = true, description = "")
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
    this.requirements.add(requirementsItem);
    return this;
  }

   /**
   * Get requirements
   * @return requirements
  **/
  @Schema(required = true, description = "")
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
  @Schema(required = true, description = "")
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
  @Schema(required = true, description = "")
  public AddonImages getImages() {
    return images;
  }

  public void setImages(AddonImages images) {
    this.images = images;
  }

  public Addon slug(String slug) {
    this.slug = slug;
    return this;
  }

   /**
   * Get slug
   * @return slug
  **/
  @Schema(required = true, description = "")
  public String getSlug() {
    return slug;
  }

  public void setSlug(String slug) {
    this.slug = slug;
  }

  public Addon route(String route) {
    this.route = route;
    return this;
  }

   /**
   * Get route
   * @return route
  **/
  @Schema(required = true, description = "")
  public String getRoute() {
    return route;
  }

  public void setRoute(String route) {
    this.route = route;
  }

  public Addon createdAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
    return this;
  }

   /**
   * Get createdAt
   * @return createdAt
  **/
  @Schema(required = true, description = "")
  public OffsetDateTime getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
  }

  public Addon updatedAt(OffsetDateTime updatedAt) {
    this.updatedAt = updatedAt;
    return this;
  }

   /**
   * Get updatedAt
   * @return updatedAt
  **/
  @Schema(required = true, description = "")
  public OffsetDateTime getUpdatedAt() {
    return updatedAt;
  }

  public void setUpdatedAt(OffsetDateTime updatedAt) {
    this.updatedAt = updatedAt;
  }

  public Addon latestVersion(AddonVersion latestVersion) {
    this.latestVersion = latestVersion;
    return this;
  }

   /**
   * Get latestVersion
   * @return latestVersion
  **/
  @Schema(description = "")
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
  @Schema(description = "")
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
