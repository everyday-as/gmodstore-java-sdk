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

/**
 * NewUserBadgePayload
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-04-14T01:48:11.419263Z[Etc/UTC]")
public class NewUserBadgePayload {
  /**
   * Gets or Sets badgeId
   */
  @JsonAdapter(BadgeIdEnum.Adapter.class)
  public enum BadgeIdEnum {
    _2FA("2fa"),
    
    ADDON_SUBMIT("addon-submit"),
    
    FORUM_POST("forum-post"),
    
    BETA("beta"),
    
    FIRST_PURCHASE("first-purchase"),
    
    RECEIVED_MESSAGE("received-message"),
    
    COAL("coal"),
    
    CONTRIBUTION("contribution"),
    
    DEVELOPER("developer"),
    
    DISCORD_BOOSTER("discord-booster"),
    
    DOWNLOAD("download"),
    
    JOB("job"),
    
    FEATURED("featured"),
    
    SPONSOR("sponsor"),
    
    KAWAII("kawaii"),
    
    CROWN("crown"),
    
    FAVOURITES("favourites"),
    
    SHIBA("shiba"),
    
    NEGOTIATED("negotiated"),
    
    PUG("pug"),
    
    EX_STAFF("ex-staff"),
    
    ASPIRING("aspiring"),
    
    STAFF("staff"),
    
    PUSH("push"),
    
    BOUGHT("bought");

    private String value;

    BadgeIdEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static BadgeIdEnum fromValue(String value) {
      for (BadgeIdEnum b : BadgeIdEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<BadgeIdEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final BadgeIdEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public BadgeIdEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return BadgeIdEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_BADGE_ID = "badge_id";
  @SerializedName(SERIALIZED_NAME_BADGE_ID)
  private BadgeIdEnum badgeId;


  public NewUserBadgePayload badgeId(BadgeIdEnum badgeId) {
    
    this.badgeId = badgeId;
    return this;
  }

   /**
   * Get badgeId
   * @return badgeId
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public BadgeIdEnum getBadgeId() {
    return badgeId;
  }


  public void setBadgeId(BadgeIdEnum badgeId) {
    this.badgeId = badgeId;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NewUserBadgePayload newUserBadgePayload = (NewUserBadgePayload) o;
    return Objects.equals(this.badgeId, newUserBadgePayload.badgeId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(badgeId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NewUserBadgePayload {\n");
    sb.append("    badgeId: ").append(toIndentedString(badgeId)).append("\n");
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

