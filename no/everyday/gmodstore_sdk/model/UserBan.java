/*
 * GmodStore
 * Welcome to the Gmodstore API! You can use our API to access Gmodstore API endpoints, which can be used interact with Gmodstore programmatically.
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
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import org.threeten.bp.OffsetDateTime;

/**
 * UserBan
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-08-27T16:44:02.267387Z[Etc/UTC]")
public class UserBan {
  public static final String SERIALIZED_NAME_USER_ID = "user_id";
  @SerializedName(SERIALIZED_NAME_USER_ID)
  private Long userId;

  public static final String SERIALIZED_NAME_REASON = "reason";
  @SerializedName(SERIALIZED_NAME_REASON)
  private String reason;

  public static final String SERIALIZED_NAME_UNBAN_REASON = "unban_reason";
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
  private Set<PropertiesEnum> properties = null;

  public static final String SERIALIZED_NAME_START = "start";
  @SerializedName(SERIALIZED_NAME_START)
  private OffsetDateTime start;

  public static final String SERIALIZED_NAME_END = "end";
  @SerializedName(SERIALIZED_NAME_END)
  private OffsetDateTime end;


  public UserBan userId(Long userId) {
    
    this.userId = userId;
    return this;
  }

   /**
   * Get userId
   * @return userId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Long getUserId() {
    return userId;
  }


  public void setUserId(Long userId) {
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
    if (this.properties == null) {
      this.properties = new LinkedHashSet<PropertiesEnum>();
    }
    this.properties.add(propertiesItem);
    return this;
  }

   /**
   * Get properties
   * @return properties
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

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
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

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
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public OffsetDateTime getEnd() {
    return end;
  }


  public void setEnd(OffsetDateTime end) {
    this.end = end;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UserBan userBan = (UserBan) o;
    return Objects.equals(this.userId, userBan.userId) &&
        Objects.equals(this.reason, userBan.reason) &&
        Objects.equals(this.unbanReason, userBan.unbanReason) &&
        Objects.equals(this.properties, userBan.properties) &&
        Objects.equals(this.start, userBan.start) &&
        Objects.equals(this.end, userBan.end);
  }

  @Override
  public int hashCode() {
    return Objects.hash(userId, reason, unbanReason, properties, start, end);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserBan {\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
    sb.append("    reason: ").append(toIndentedString(reason)).append("\n");
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
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

