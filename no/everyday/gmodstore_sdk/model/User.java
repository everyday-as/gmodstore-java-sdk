/*
 * GmodStore API
 * Welcome to the GmodStore API! You can use our API to access GmodStore API endpoints, which can be used interact with GmodStore programmatically.
 *
 * The version of the OpenAPI document: 1.1.0
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
import java.net.URI;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import no.everyday.gmodstore_sdk.model.PermissionGroup;

/**
 * User
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-12-07T20:21:58.330625Z[Etc/UTC]")
public class User {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private Long id;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_AVATAR = "avatar";
  @SerializedName(SERIALIZED_NAME_AVATAR)
  private URI avatar;

  public static final String SERIALIZED_NAME_COUNTRY_CODE = "country_code";
  @SerializedName(SERIALIZED_NAME_COUNTRY_CODE)
  private String countryCode;

  public static final String SERIALIZED_NAME_SLUG = "slug";
  @SerializedName(SERIALIZED_NAME_SLUG)
  private String slug;

  public static final String SERIALIZED_NAME_REPUTATION = "reputation";
  @SerializedName(SERIALIZED_NAME_REPUTATION)
  private Long reputation;

  public static final String SERIALIZED_NAME_TEAM_REPUTATION = "team_reputation";
  @SerializedName(SERIALIZED_NAME_TEAM_REPUTATION)
  private Long teamReputation;

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

    public static BanPropertiesEnum fromValue(String value) {
      for (BanPropertiesEnum b : BanPropertiesEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<BanPropertiesEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final BanPropertiesEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public BanPropertiesEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return BanPropertiesEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_BAN_PROPERTIES = "ban_properties";
  @SerializedName(SERIALIZED_NAME_BAN_PROPERTIES)
  private Set<BanPropertiesEnum> banProperties = null;

  public static final String SERIALIZED_NAME_GROUP = "group";
  @SerializedName(SERIALIZED_NAME_GROUP)
  private PermissionGroup group;


  public User id(Long id) {
    
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


  public User name(String name) {
    
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


  public User avatar(URI avatar) {
    
    this.avatar = avatar;
    return this;
  }

   /**
   * Get avatar
   * @return avatar
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public URI getAvatar() {
    return avatar;
  }


  public void setAvatar(URI avatar) {
    this.avatar = avatar;
  }


  public User countryCode(String countryCode) {
    
    this.countryCode = countryCode;
    return this;
  }

   /**
   * Get countryCode
   * @return countryCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getCountryCode() {
    return countryCode;
  }


  public void setCountryCode(String countryCode) {
    this.countryCode = countryCode;
  }


  public User slug(String slug) {
    
    this.slug = slug;
    return this;
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


  public void setSlug(String slug) {
    this.slug = slug;
  }


  public User reputation(Long reputation) {
    
    this.reputation = reputation;
    return this;
  }

   /**
   * Get reputation
   * @return reputation
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Long getReputation() {
    return reputation;
  }


  public void setReputation(Long reputation) {
    this.reputation = reputation;
  }


  public User teamReputation(Long teamReputation) {
    
    this.teamReputation = teamReputation;
    return this;
  }

   /**
   * Get teamReputation
   * @return teamReputation
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Long getTeamReputation() {
    return teamReputation;
  }


  public void setTeamReputation(Long teamReputation) {
    this.teamReputation = teamReputation;
  }


  public User banProperties(Set<BanPropertiesEnum> banProperties) {
    
    this.banProperties = banProperties;
    return this;
  }

  public User addBanPropertiesItem(BanPropertiesEnum banPropertiesItem) {
    if (this.banProperties == null) {
      this.banProperties = new LinkedHashSet<BanPropertiesEnum>();
    }
    this.banProperties.add(banPropertiesItem);
    return this;
  }

   /**
   * Get banProperties
   * @return banProperties
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Set<BanPropertiesEnum> getBanProperties() {
    return banProperties;
  }


  public void setBanProperties(Set<BanPropertiesEnum> banProperties) {
    this.banProperties = banProperties;
  }


  public User group(PermissionGroup group) {
    
    this.group = group;
    return this;
  }

   /**
   * Get group
   * @return group
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public PermissionGroup getGroup() {
    return group;
  }


  public void setGroup(PermissionGroup group) {
    this.group = group;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    User user = (User) o;
    return Objects.equals(this.id, user.id) &&
        Objects.equals(this.name, user.name) &&
        Objects.equals(this.avatar, user.avatar) &&
        Objects.equals(this.countryCode, user.countryCode) &&
        Objects.equals(this.slug, user.slug) &&
        Objects.equals(this.reputation, user.reputation) &&
        Objects.equals(this.teamReputation, user.teamReputation) &&
        Objects.equals(this.banProperties, user.banProperties) &&
        Objects.equals(this.group, user.group);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, avatar, countryCode, slug, reputation, teamReputation, banProperties, group);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class User {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    avatar: ").append(toIndentedString(avatar)).append("\n");
    sb.append("    countryCode: ").append(toIndentedString(countryCode)).append("\n");
    sb.append("    slug: ").append(toIndentedString(slug)).append("\n");
    sb.append("    reputation: ").append(toIndentedString(reputation)).append("\n");
    sb.append("    teamReputation: ").append(toIndentedString(teamReputation)).append("\n");
    sb.append("    banProperties: ").append(toIndentedString(banProperties)).append("\n");
    sb.append("    group: ").append(toIndentedString(group)).append("\n");
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

