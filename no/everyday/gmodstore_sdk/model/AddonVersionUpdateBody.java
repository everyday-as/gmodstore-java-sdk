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
/**
 * AddonVersionUpdateBody
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-08-27T02:49:59.885063Z[Etc/UTC]")
public class AddonVersionUpdateBody {
  @SerializedName("name")
  private String name = null;

  @SerializedName("changelog")
  private String changelog = null;

  /**
   * This can be a value of stable, beta, alpha, private or demo 
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

  public AddonVersionUpdateBody name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @Schema(description = "")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public AddonVersionUpdateBody changelog(String changelog) {
    this.changelog = changelog;
    return this;
  }

   /**
   * You can pass in markdown here 
   * @return changelog
  **/
  @Schema(description = "You can pass in markdown here ")
  public String getChangelog() {
    return changelog;
  }

  public void setChangelog(String changelog) {
    this.changelog = changelog;
  }

  public AddonVersionUpdateBody releaseType(ReleaseTypeEnum releaseType) {
    this.releaseType = releaseType;
    return this;
  }

   /**
   * This can be a value of stable, beta, alpha, private or demo 
   * @return releaseType
  **/
  @Schema(description = "This can be a value of stable, beta, alpha, private or demo ")
  public ReleaseTypeEnum getReleaseType() {
    return releaseType;
  }

  public void setReleaseType(ReleaseTypeEnum releaseType) {
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
    AddonVersionUpdateBody addonVersionUpdateBody = (AddonVersionUpdateBody) o;
    return Objects.equals(this.name, addonVersionUpdateBody.name) &&
        Objects.equals(this.changelog, addonVersionUpdateBody.changelog) &&
        Objects.equals(this.releaseType, addonVersionUpdateBody.releaseType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, changelog, releaseType);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AddonVersionUpdateBody {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    changelog: ").append(toIndentedString(changelog)).append("\n");
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
