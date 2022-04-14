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
import java.net.URI;
import java.util.UUID;
import org.threeten.bp.OffsetDateTime;

/**
 * User
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-04-14T01:48:11.419263Z[Etc/UTC]")
public class User {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private UUID id;

  public static final String SERIALIZED_NAME_STEAM_ID = "steamId";
  @SerializedName(SERIALIZED_NAME_STEAM_ID)
  private Long steamId;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_EMAIL = "email";
  @SerializedName(SERIALIZED_NAME_EMAIL)
  private String email;

  public static final String SERIALIZED_NAME_AVATAR = "avatar";
  @SerializedName(SERIALIZED_NAME_AVATAR)
  private URI avatar;

  public static final String SERIALIZED_NAME_BIO = "bio";
  @SerializedName(SERIALIZED_NAME_BIO)
  private String bio;

  public static final String SERIALIZED_NAME_LAST_ACTION_AT = "lastActionAt";
  @SerializedName(SERIALIZED_NAME_LAST_ACTION_AT)
  private OffsetDateTime lastActionAt;

  public static final String SERIALIZED_NAME_CREATED_AT = "createdAt";
  @SerializedName(SERIALIZED_NAME_CREATED_AT)
  private OffsetDateTime createdAt;

  public static final String SERIALIZED_NAME_TEAMS_COUNT = "teamsCount";
  @SerializedName(SERIALIZED_NAME_TEAMS_COUNT)
  private Long teamsCount;


  public User id(UUID id) {
    
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


  public User steamId(Long steamId) {
    
    this.steamId = steamId;
    return this;
  }

   /**
   * Get steamId
   * @return steamId
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public Long getSteamId() {
    return steamId;
  }


  public void setSteamId(Long steamId) {
    this.steamId = steamId;
  }


  public User name(String name) {
    
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


  public User email(String email) {
    
    this.email = email;
    return this;
  }

   /**
   * Get email
   * @return email
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getEmail() {
    return email;
  }


  public void setEmail(String email) {
    this.email = email;
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
  @ApiModelProperty(required = true, value = "")

  public URI getAvatar() {
    return avatar;
  }


  public void setAvatar(URI avatar) {
    this.avatar = avatar;
  }


  public User bio(String bio) {
    
    this.bio = bio;
    return this;
  }

   /**
   * Get bio
   * @return bio
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public String getBio() {
    return bio;
  }


  public void setBio(String bio) {
    this.bio = bio;
  }


  public User lastActionAt(OffsetDateTime lastActionAt) {
    
    this.lastActionAt = lastActionAt;
    return this;
  }

   /**
   * Get lastActionAt
   * @return lastActionAt
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public OffsetDateTime getLastActionAt() {
    return lastActionAt;
  }


  public void setLastActionAt(OffsetDateTime lastActionAt) {
    this.lastActionAt = lastActionAt;
  }


  public User createdAt(OffsetDateTime createdAt) {
    
    this.createdAt = createdAt;
    return this;
  }

   /**
   * Get createdAt
   * @return createdAt
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public OffsetDateTime getCreatedAt() {
    return createdAt;
  }


  public void setCreatedAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
  }


  public User teamsCount(Long teamsCount) {
    
    this.teamsCount = teamsCount;
    return this;
  }

   /**
   * Get teamsCount
   * minimum: 0
   * @return teamsCount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Long getTeamsCount() {
    return teamsCount;
  }


  public void setTeamsCount(Long teamsCount) {
    this.teamsCount = teamsCount;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    User user = (User) o;
    return Objects.equals(this.id, user.id) &&
        Objects.equals(this.steamId, user.steamId) &&
        Objects.equals(this.name, user.name) &&
        Objects.equals(this.email, user.email) &&
        Objects.equals(this.avatar, user.avatar) &&
        Objects.equals(this.bio, user.bio) &&
        Objects.equals(this.lastActionAt, user.lastActionAt) &&
        Objects.equals(this.createdAt, user.createdAt) &&
        Objects.equals(this.teamsCount, user.teamsCount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, steamId, name, email, avatar, bio, lastActionAt, createdAt, teamsCount);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class User {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    steamId: ").append(toIndentedString(steamId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    avatar: ").append(toIndentedString(avatar)).append("\n");
    sb.append("    bio: ").append(toIndentedString(bio)).append("\n");
    sb.append("    lastActionAt: ").append(toIndentedString(lastActionAt)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    teamsCount: ").append(toIndentedString(teamsCount)).append("\n");
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

