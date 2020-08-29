/*
 * GmodStore API
 * Welcome to the GmodStore API! You can use our API to access GmodStore API endpoints, which can be used interact with GmodStore programmatically.
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
import java.io.File;
import java.io.IOException;
import no.everyday.gmodstore_sdk.model.AddonVersionReleaseType;

/**
 * NewAddonVersion
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-08-29T19:45:37.501353Z[Etc/UTC]")
public class NewAddonVersion {
  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_CHANGELOG = "changelog";
  @SerializedName(SERIALIZED_NAME_CHANGELOG)
  private String changelog;

  public static final String SERIALIZED_NAME_FILE = "file";
  @SerializedName(SERIALIZED_NAME_FILE)
  private File file;

  public static final String SERIALIZED_NAME_RELEASE_TYPE = "release_type";
  @SerializedName(SERIALIZED_NAME_RELEASE_TYPE)
  private AddonVersionReleaseType releaseType = AddonVersionReleaseType.STABLE;


  public NewAddonVersion name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @ApiModelProperty(required = true, value = "")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public NewAddonVersion changelog(String changelog) {
    
    this.changelog = changelog;
    return this;
  }

   /**
   * You can pass in markdown here
   * @return changelog
  **/
  @ApiModelProperty(required = true, value = "You can pass in markdown here")

  public String getChangelog() {
    return changelog;
  }


  public void setChangelog(String changelog) {
    this.changelog = changelog;
  }


  public NewAddonVersion file(File file) {
    
    this.file = file;
    return this;
  }

   /**
   * Get file
   * @return file
  **/
  @ApiModelProperty(required = true, value = "")

  public File getFile() {
    return file;
  }


  public void setFile(File file) {
    this.file = file;
  }


  public NewAddonVersion releaseType(AddonVersionReleaseType releaseType) {
    
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NewAddonVersion newAddonVersion = (NewAddonVersion) o;
    return Objects.equals(this.name, newAddonVersion.name) &&
        Objects.equals(this.changelog, newAddonVersion.changelog) &&
        Objects.equals(this.file, newAddonVersion.file) &&
        Objects.equals(this.releaseType, newAddonVersion.releaseType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, changelog, file, releaseType);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NewAddonVersion {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    changelog: ").append(toIndentedString(changelog)).append("\n");
    sb.append("    file: ").append(toIndentedString(file)).append("\n");
    sb.append("    releaseType: ").append(toIndentedString(releaseType)).append("\n");
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

