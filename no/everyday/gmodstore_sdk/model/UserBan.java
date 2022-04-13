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
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import org.threeten.bp.OffsetDateTime;

/**
 * UserBan
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-04-13T21:14:19.338654Z[Etc/UTC]")
public class UserBan {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private UUID id;

  public static final String SERIALIZED_NAME_USER_ID = "userId";
  @SerializedName(SERIALIZED_NAME_USER_ID)
  private UUID userId;

  public static final String SERIALIZED_NAME_REASON = "reason";
  @SerializedName(SERIALIZED_NAME_REASON)
  private String reason;

  public static final String SERIALIZED_NAME_BANNER_ID = "bannerId";
  @SerializedName(SERIALIZED_NAME_BANNER_ID)
  private UUID bannerId;

  public static final String SERIALIZED_NAME_UNBAN_ID = "unbanId";
  @SerializedName(SERIALIZED_NAME_UNBAN_ID)
  private UUID unbanId;

  public static final String SERIALIZED_NAME_UNBAN_REASON = "unbanReason";
  @SerializedName(SERIALIZED_NAME_UNBAN_REASON)
  private String unbanReason;

  /**
   * Gets or Sets properties
   */
  @JsonAdapter(PropertiesEnum.Adapter.class)
  public enum PropertiesEnum {
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
    
    FORUM_POST("forum.post"),
    
    BAN_APPEAL("ban.appeal");

    private String value;

    PropertiesEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static PropertiesEnum fromValue(String value) {
      for (PropertiesEnum b : PropertiesEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<PropertiesEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final PropertiesEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public PropertiesEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return PropertiesEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_PROPERTIES = "properties";
  @SerializedName(SERIALIZED_NAME_PROPERTIES)
  private Set<PropertiesEnum> properties = new LinkedHashSet<PropertiesEnum>();

  public static final String SERIALIZED_NAME_START = "start";
  @SerializedName(SERIALIZED_NAME_START)
  private OffsetDateTime start;

  public static final String SERIALIZED_NAME_END = "end";
  @SerializedName(SERIALIZED_NAME_END)
  private OffsetDateTime end;


  public UserBan id(UUID id) {
    
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


  public UserBan userId(UUID userId) {
    
    this.userId = userId;
    return this;
  }

   /**
   * Get userId
   * @return userId
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public UUID getUserId() {
    return userId;
  }


  public void setUserId(UUID userId) {
    this.userId = userId;
  }


  public UserBan reason(String reason) {
    
    this.reason = reason;
    return this;
  }

   /**
   * Get reason
   * @return reason
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getReason() {
    return reason;
  }


  public void setReason(String reason) {
    this.reason = reason;
  }


  public UserBan bannerId(UUID bannerId) {
    
    this.bannerId = bannerId;
    return this;
  }

   /**
   * Get bannerId
   * @return bannerId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public UUID getBannerId() {
    return bannerId;
  }


  public void setBannerId(UUID bannerId) {
    this.bannerId = bannerId;
  }


  public UserBan unbanId(UUID unbanId) {
    
    this.unbanId = unbanId;
    return this;
  }

   /**
   * Get unbanId
   * @return unbanId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public UUID getUnbanId() {
    return unbanId;
  }


  public void setUnbanId(UUID unbanId) {
    this.unbanId = unbanId;
  }


  public UserBan unbanReason(String unbanReason) {
    
    this.unbanReason = unbanReason;
    return this;
  }

   /**
   * Get unbanReason
   * @return unbanReason
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getUnbanReason() {
    return unbanReason;
  }


  public void setUnbanReason(String unbanReason) {
    this.unbanReason = unbanReason;
  }


  public UserBan properties(Set<PropertiesEnum> properties) {
    
    this.properties = properties;
    return this;
  }

  public UserBan addPropertiesItem(PropertiesEnum propertiesItem) {
    this.properties.add(propertiesItem);
    return this;
  }

   /**
   * Get properties
   * @return properties
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public Set<PropertiesEnum> getProperties() {
    return properties;
  }


  public void setProperties(Set<PropertiesEnum> properties) {
    this.properties = properties;
  }


  public UserBan start(OffsetDateTime start) {
    
    this.start = start;
    return this;
  }

   /**
   * Get start
   * @return start
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public OffsetDateTime getStart() {
    return start;
  }


  public void setStart(OffsetDateTime start) {
    this.start = start;
  }


  public UserBan end(OffsetDateTime end) {
    
    this.end = end;
    return this;
  }

   /**
   * Get end
   * @return end
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public OffsetDateTime getEnd() {
    return end;
  }


  public void setEnd(OffsetDateTime end) {
    this.end = end;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UserBan userBan = (UserBan) o;
    return Objects.equals(this.id, userBan.id) &&
        Objects.equals(this.userId, userBan.userId) &&
        Objects.equals(this.reason, userBan.reason) &&
        Objects.equals(this.bannerId, userBan.bannerId) &&
        Objects.equals(this.unbanId, userBan.unbanId) &&
        Objects.equals(this.unbanReason, userBan.unbanReason) &&
        Objects.equals(this.properties, userBan.properties) &&
        Objects.equals(this.start, userBan.start) &&
        Objects.equals(this.end, userBan.end);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, userId, reason, bannerId, unbanId, unbanReason, properties, start, end);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserBan {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
    sb.append("    reason: ").append(toIndentedString(reason)).append("\n");
    sb.append("    bannerId: ").append(toIndentedString(bannerId)).append("\n");
    sb.append("    unbanId: ").append(toIndentedString(unbanId)).append("\n");
    sb.append("    unbanReason: ").append(toIndentedString(unbanReason)).append("\n");
    sb.append("    properties: ").append(toIndentedString(properties)).append("\n");
    sb.append("    start: ").append(toIndentedString(start)).append("\n");
    sb.append("    end: ").append(toIndentedString(end)).append("\n");
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

