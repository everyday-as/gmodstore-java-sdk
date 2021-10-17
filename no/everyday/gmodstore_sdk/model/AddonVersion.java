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
import no.everyday.gmodstore_sdk.model.Addon;
import no.everyday.gmodstore_sdk.model.AddonVersionReleaseType;
import org.threeten.bp.OffsetDateTime;

/**
 * AddonVersion
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-10-17T10:10:35.234725Z[Etc/UTC]")
public class AddonVersion {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private Long id;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_CHANGELOG = "changelog";
  @SerializedName(SERIALIZED_NAME_CHANGELOG)
  private String changelog;

  public static final String SERIALIZED_NAME_FILE_HASH = "file_hash";
  @SerializedName(SERIALIZED_NAME_FILE_HASH)
  private String fileHash;

  public static final String SERIALIZED_NAME_FILE_SIZE = "file_size";
  @SerializedName(SERIALIZED_NAME_FILE_SIZE)
  private Integer fileSize;

  public static final String SERIALIZED_NAME_RELEASE_TYPE = "release_type";
  @SerializedName(SERIALIZED_NAME_RELEASE_TYPE)
  private AddonVersionReleaseType releaseType = AddonVersionReleaseType.STABLE;

  public static final String SERIALIZED_NAME_CREATED_AT = "created_at";
  @SerializedName(SERIALIZED_NAME_CREATED_AT)
  private OffsetDateTime createdAt;

  public static final String SERIALIZED_NAME_UPDATED_AT = "updated_at";
  @SerializedName(SERIALIZED_NAME_UPDATED_AT)
  private OffsetDateTime updatedAt;

  public static final String SERIALIZED_NAME_ADDON = "addon";
  @SerializedName(SERIALIZED_NAME_ADDON)
  private Addon addon;


   /**
   * Get id
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Long getId() {
    return id;
  }




  public AddonVersion name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public AddonVersion changelog(String changelog) {
    
    this.changelog = changelog;
    return this;
  }

   /**
   * You can pass in markdown here
   * @return changelog
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "You can pass in markdown here")

  public String getChangelog() {
    return changelog;
  }


  public void setChangelog(String changelog) {
    this.changelog = changelog;
  }


   /**
   * Get fileHash
   * @return fileHash
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getFileHash() {
    return fileHash;
  }




   /**
   * Get fileSize
   * @return fileSize
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getFileSize() {
    return fileSize;
  }




  public AddonVersion releaseType(AddonVersionReleaseType releaseType) {
    
    this.releaseType = releaseType;
    return this;
  }

   /**
   * Get releaseType
   * @return releaseType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public AddonVersionReleaseType getReleaseType() {
    return releaseType;
  }


  public void setReleaseType(AddonVersionReleaseType releaseType) {
    this.releaseType = releaseType;
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




  public AddonVersion addon(Addon addon) {
    
    this.addon = addon;
    return this;
  }

   /**
   * Get addon
   * @return addon
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Addon getAddon() {
    return addon;
  }


  public void setAddon(Addon addon) {
    this.addon = addon;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AddonVersion addonVersion = (AddonVersion) o;
    return Objects.equals(this.id, addonVersion.id) &&
        Objects.equals(this.name, addonVersion.name) &&
        Objects.equals(this.changelog, addonVersion.changelog) &&
        Objects.equals(this.fileHash, addonVersion.fileHash) &&
        Objects.equals(this.fileSize, addonVersion.fileSize) &&
        Objects.equals(this.releaseType, addonVersion.releaseType) &&
        Objects.equals(this.createdAt, addonVersion.createdAt) &&
        Objects.equals(this.updatedAt, addonVersion.updatedAt) &&
        Objects.equals(this.addon, addonVersion.addon);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, changelog, fileHash, fileSize, releaseType, createdAt, updatedAt, addon);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AddonVersion {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    changelog: ").append(toIndentedString(changelog)).append("\n");
    sb.append("    fileHash: ").append(toIndentedString(fileHash)).append("\n");
    sb.append("    fileSize: ").append(toIndentedString(fileSize)).append("\n");
    sb.append("    releaseType: ").append(toIndentedString(releaseType)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
    sb.append("    addon: ").append(toIndentedString(addon)).append("\n");
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

