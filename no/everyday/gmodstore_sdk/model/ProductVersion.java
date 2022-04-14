/*
 * gmodstore
 * Welcome to the GmodStore API! You can use our API to access GmodStore API endpoints, which can be used interact with GmodStore programmatically.  # Rate limits Every request you make to the GmodStore API will count against your rate limit, which at the time of writing this, is 60 requests / minute. An up-to-date value will always provided in the `X-RateLimit-Limit` header The number of requests you have remaining before you must wait is provided in the `X-RateLimit-Remaining` header.  # API SDKs For a list of available API SDKs check the README here: https://github.com/everyday-as/gmodstore-api-docs#client-libraries
 *
 * The version of the OpenAPI document: 3.0.0
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
import java.math.BigDecimal;
import java.util.UUID;

/**
 * ProductVersion
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-04-14T01:48:11.419263Z[Etc/UTC]")
public class ProductVersion {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private UUID id;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_CHANGELOG = "changelog";
  @SerializedName(SERIALIZED_NAME_CHANGELOG)
  private String changelog;

  /**
   * Gets or Sets releaseType
   */
  @JsonAdapter(ReleaseTypeEnum.Adapter.class)
  public enum ReleaseTypeEnum {
    STABLE("stable"),
    
    BETA("beta"),
    
    ALPHA("alpha"),
    
    PRIVATE("private"),
    
    DEMO("demo");

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

    public static ReleaseTypeEnum fromValue(String value) {
      for (ReleaseTypeEnum b : ReleaseTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<ReleaseTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final ReleaseTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public ReleaseTypeEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return ReleaseTypeEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_RELEASE_TYPE = "releaseType";
  @SerializedName(SERIALIZED_NAME_RELEASE_TYPE)
  private ReleaseTypeEnum releaseType;

  public static final String SERIALIZED_NAME_FILE_SIZE = "fileSize";
  @SerializedName(SERIALIZED_NAME_FILE_SIZE)
  private BigDecimal fileSize;

  public static final String SERIALIZED_NAME_FILE_HASH = "fileHash";
  @SerializedName(SERIALIZED_NAME_FILE_HASH)
  private String fileHash;


  public ProductVersion id(UUID id) {
    
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public UUID getId() {
    return id;
  }


  public void setId(UUID id) {
    this.id = id;
  }


  public ProductVersion name(String name) {
    
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


  public ProductVersion changelog(String changelog) {
    
    this.changelog = changelog;
    return this;
  }

   /**
   * Get changelog
   * @return changelog
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public String getChangelog() {
    return changelog;
  }


  public void setChangelog(String changelog) {
    this.changelog = changelog;
  }


  public ProductVersion releaseType(ReleaseTypeEnum releaseType) {
    
    this.releaseType = releaseType;
    return this;
  }

   /**
   * Get releaseType
   * @return releaseType
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public ReleaseTypeEnum getReleaseType() {
    return releaseType;
  }


  public void setReleaseType(ReleaseTypeEnum releaseType) {
    this.releaseType = releaseType;
  }


  public ProductVersion fileSize(BigDecimal fileSize) {
    
    this.fileSize = fileSize;
    return this;
  }

   /**
   * Get fileSize
   * minimum: 0
   * @return fileSize
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public BigDecimal getFileSize() {
    return fileSize;
  }


  public void setFileSize(BigDecimal fileSize) {
    this.fileSize = fileSize;
  }


  public ProductVersion fileHash(String fileHash) {
    
    this.fileHash = fileHash;
    return this;
  }

   /**
   * Get fileHash
   * @return fileHash
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public String getFileHash() {
    return fileHash;
  }


  public void setFileHash(String fileHash) {
    this.fileHash = fileHash;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProductVersion productVersion = (ProductVersion) o;
    return Objects.equals(this.id, productVersion.id) &&
        Objects.equals(this.name, productVersion.name) &&
        Objects.equals(this.changelog, productVersion.changelog) &&
        Objects.equals(this.releaseType, productVersion.releaseType) &&
        Objects.equals(this.fileSize, productVersion.fileSize) &&
        Objects.equals(this.fileHash, productVersion.fileHash);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, changelog, releaseType, fileSize, fileHash);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProductVersion {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    changelog: ").append(toIndentedString(changelog)).append("\n");
    sb.append("    releaseType: ").append(toIndentedString(releaseType)).append("\n");
    sb.append("    fileSize: ").append(toIndentedString(fileSize)).append("\n");
    sb.append("    fileHash: ").append(toIndentedString(fileHash)).append("\n");
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

