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
import no.everyday.gmodstore_sdk.model.PersonalAccessToken;
import no.everyday.gmodstore_sdk.model.User;

/**
 * Me
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-04-14T01:48:11.419263Z[Etc/UTC]")
public class Me {
  public static final String SERIALIZED_NAME_PERSONAL_ACCESS_TOKEN = "personalAccessToken";
  @SerializedName(SERIALIZED_NAME_PERSONAL_ACCESS_TOKEN)
  private PersonalAccessToken personalAccessToken;

  public static final String SERIALIZED_NAME_USER = "user";
  @SerializedName(SERIALIZED_NAME_USER)
  private User user;


  public Me personalAccessToken(PersonalAccessToken personalAccessToken) {
    
    this.personalAccessToken = personalAccessToken;
    return this;
  }

   /**
   * Get personalAccessToken
   * @return personalAccessToken
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public PersonalAccessToken getPersonalAccessToken() {
    return personalAccessToken;
  }


  public void setPersonalAccessToken(PersonalAccessToken personalAccessToken) {
    this.personalAccessToken = personalAccessToken;
  }


  public Me user(User user) {
    
    this.user = user;
    return this;
  }

   /**
   * Get user
   * @return user
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public User getUser() {
    return user;
  }


  public void setUser(User user) {
    this.user = user;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Me me = (Me) o;
    return Objects.equals(this.personalAccessToken, me.personalAccessToken) &&
        Objects.equals(this.user, me.user);
  }

  @Override
  public int hashCode() {
    return Objects.hash(personalAccessToken, user);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Me {\n");
    sb.append("    personalAccessToken: ").append(toIndentedString(personalAccessToken)).append("\n");
    sb.append("    user: ").append(toIndentedString(user)).append("\n");
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

