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
import no.everyday.gmodstore_sdk.model.Addon;
import org.threeten.bp.OffsetDateTime;
/**
 * AddonVersion
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-01-02T00:20:11.670828Z[Etc/UTC]")
public class AddonVersion {
  @SerializedName("id")
  private Integer id = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("changelog")
  private String changelog = null;

  @SerializedName("file_hash")
  private String fileHash = null;

  @SerializedName("file_size")
  private Integer fileSize = null;

  /**
   * Gets or Sets releaseType
   */
  @JsonAdapter(ReleaseTypeEnum.Adapter.class)
  public enum ReleaseTypeEnum {
    STABLE("stable"),
    BETA("beta"),
    ALPHA("alpha"),
    PRIVATE("private");

    private String value;

    ReleaseTypeEnum(String value) {
      this.value = value;
    }
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
    public static ReleaseTypeEnum fromValue(String text) {
      for (ReleaseTypeEnum b : ReleaseTypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
    public static class Adapter extends TypeAdapter<ReleaseTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final ReleaseTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public ReleaseTypeEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return ReleaseTypeEnum.fromValue(String.valueOf(value));
      }
    }
  }  @SerializedName("release_type")
  private ReleaseTypeEnum releaseType = null;

  @SerializedName("created_at")
  private OffsetDateTime createdAt = null;

  @SerializedName("updated_at")
  private OffsetDateTime updatedAt = null;

  @SerializedName("addon")
  private Addon addon = null;

  public AddonVersion id(Integer id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * minimum: 1
   * @return id
  **/
  @Schema(required = true, description = "")
  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public AddonVersion name(String name) {
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

  public AddonVersion changelog(String changelog) {
    this.changelog = changelog;
    return this;
  }

   /**
   * Get changelog
   * @return changelog
  **/
  @Schema(required = true, description = "")
  public String getChangelog() {
    return changelog;
  }

  public void setChangelog(String changelog) {
    this.changelog = changelog;
  }

  public AddonVersion fileHash(String fileHash) {
    this.fileHash = fileHash;
    return this;
  }

   /**
   * Get fileHash
   * @return fileHash
  **/
  @Schema(required = true, description = "")
  public String getFileHash() {
    return fileHash;
  }

  public void setFileHash(String fileHash) {
    this.fileHash = fileHash;
  }

  public AddonVersion fileSize(Integer fileSize) {
    this.fileSize = fileSize;
    return this;
  }

   /**
   * Get fileSize
   * minimum: 0
   * @return fileSize
  **/
  @Schema(required = true, description = "")
  public Integer getFileSize() {
    return fileSize;
  }

  public void setFileSize(Integer fileSize) {
    this.fileSize = fileSize;
  }

  public AddonVersion releaseType(ReleaseTypeEnum releaseType) {
    this.releaseType = releaseType;
    return this;
  }

   /**
   * Get releaseType
   * @return releaseType
  **/
  @Schema(description = "")
  public ReleaseTypeEnum getReleaseType() {
    return releaseType;
  }

  public void setReleaseType(ReleaseTypeEnum releaseType) {
    this.releaseType = releaseType;
  }

  public AddonVersion createdAt(OffsetDateTime createdAt) {
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

  public AddonVersion updatedAt(OffsetDateTime updatedAt) {
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

  public AddonVersion addon(Addon addon) {
    this.addon = addon;
    return this;
  }

   /**
   * Get addon
   * @return addon
  **/
  @Schema(description = "")
  public Addon getAddon() {
    return addon;
  }

  public void setAddon(Addon addon) {
    this.addon = addon;
  }


  @Override
  public boolean equals(java.lang.Object o) {
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
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}
