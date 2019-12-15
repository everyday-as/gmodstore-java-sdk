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
/**
 * Ban
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2019-12-15T17:05:34.392102Z[Etc/UTC]")
public class Ban {
  @SerializedName("id")
  private Integer id = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("avatar")
  private String avatar = null;

  @SerializedName("country_code")
  private String countryCode = null;

  @SerializedName("slug")
  private String slug = null;

  /**
   * Gets or Sets banProperties
   */
  @JsonAdapter(BanPropertiesEnum.Adapter.class)
  public enum BanPropertiesEnum {
    EVERYTHING("everything"),
    ADDON_CREATE("addon.create"),
    ADDON_PURCHASE("addon.purchase"),
    ADDON_DOWNLOAD("addon.download"),
    ADDON_REVIEW("addon.review"),
    ADDON_COMMENT("addon.comment"),
    JOB_CREATE("job.create"),
    JOB_APPLY("job.apply"),
    JOB_REVIEW("job.review"),
    JOB_COMMENT("job.comment"),
    BAN_APPEAL("ban.appeal");

    private String value;

    BanPropertiesEnum(String value) {
      this.value = value;
    }
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
    public static BanPropertiesEnum fromValue(String text) {
      for (BanPropertiesEnum b : BanPropertiesEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
    public static class Adapter extends TypeAdapter<BanPropertiesEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final BanPropertiesEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public BanPropertiesEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return BanPropertiesEnum.fromValue(String.valueOf(value));
      }
    }
  }  @SerializedName("ban_properties")
  private List<BanPropertiesEnum> banProperties = new ArrayList<BanPropertiesEnum>();

  public Ban id(Integer id) {
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

  public Ban name(String name) {
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

  public Ban avatar(String avatar) {
    this.avatar = avatar;
    return this;
  }

   /**
   * Get avatar
   * @return avatar
  **/
  @Schema(required = true, description = "")
  public String getAvatar() {
    return avatar;
  }

  public void setAvatar(String avatar) {
    this.avatar = avatar;
  }

  public Ban countryCode(String countryCode) {
    this.countryCode = countryCode;
    return this;
  }

   /**
   * Get countryCode
   * @return countryCode
  **/
  @Schema(description = "")
  public String getCountryCode() {
    return countryCode;
  }

  public void setCountryCode(String countryCode) {
    this.countryCode = countryCode;
  }

  public Ban slug(String slug) {
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

  public Ban banProperties(List<BanPropertiesEnum> banProperties) {
    this.banProperties = banProperties;
    return this;
  }

  public Ban addBanPropertiesItem(BanPropertiesEnum banPropertiesItem) {
    this.banProperties.add(banPropertiesItem);
    return this;
  }

   /**
   * Get banProperties
   * @return banProperties
  **/
  @Schema(required = true, description = "")
  public List<BanPropertiesEnum> getBanProperties() {
    return banProperties;
  }

  public void setBanProperties(List<BanPropertiesEnum> banProperties) {
    this.banProperties = banProperties;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Ban ban = (Ban) o;
    return Objects.equals(this.id, ban.id) &&
        Objects.equals(this.name, ban.name) &&
        Objects.equals(this.avatar, ban.avatar) &&
        Objects.equals(this.countryCode, ban.countryCode) &&
        Objects.equals(this.slug, ban.slug) &&
        Objects.equals(this.banProperties, ban.banProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, avatar, countryCode, slug, banProperties);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Ban {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    avatar: ").append(toIndentedString(avatar)).append("\n");
    sb.append("    countryCode: ").append(toIndentedString(countryCode)).append("\n");
    sb.append("    slug: ").append(toIndentedString(slug)).append("\n");
    sb.append("    banProperties: ").append(toIndentedString(banProperties)).append("\n");
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
