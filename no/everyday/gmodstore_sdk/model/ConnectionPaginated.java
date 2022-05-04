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
import java.util.ArrayList;
import java.util.List;
import no.everyday.gmodstore_sdk.model.ConnectionPaginatedCursors;
import no.everyday.gmodstore_sdk.model.ConnectionPaginatedMeta;

/**
 * ConnectionPaginated
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-05-04T06:27:05.446126Z[Etc/UTC]")
public class ConnectionPaginated {
  public static final String SERIALIZED_NAME_CURSORS = "cursors";
  @SerializedName(SERIALIZED_NAME_CURSORS)
  private ConnectionPaginatedCursors cursors;

  public static final String SERIALIZED_NAME_CONNECTIONS = "connections";
  @SerializedName(SERIALIZED_NAME_CONNECTIONS)
  private List<String> connections = new ArrayList<String>();

  public static final String SERIALIZED_NAME_META = "meta";
  @SerializedName(SERIALIZED_NAME_META)
  private ConnectionPaginatedMeta meta;


  public ConnectionPaginated cursors(ConnectionPaginatedCursors cursors) {
    
    this.cursors = cursors;
    return this;
  }

   /**
   * Get cursors
   * @return cursors
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public ConnectionPaginatedCursors getCursors() {
    return cursors;
  }


  public void setCursors(ConnectionPaginatedCursors cursors) {
    this.cursors = cursors;
  }


  public ConnectionPaginated connections(List<String> connections) {
    
    this.connections = connections;
    return this;
  }

  public ConnectionPaginated addConnectionsItem(String connectionsItem) {
    this.connections.add(connectionsItem);
    return this;
  }

   /**
   * Get connections
   * @return connections
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public List<String> getConnections() {
    return connections;
  }


  public void setConnections(List<String> connections) {
    this.connections = connections;
  }


  public ConnectionPaginated meta(ConnectionPaginatedMeta meta) {
    
    this.meta = meta;
    return this;
  }

   /**
   * Get meta
   * @return meta
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public ConnectionPaginatedMeta getMeta() {
    return meta;
  }


  public void setMeta(ConnectionPaginatedMeta meta) {
    this.meta = meta;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ConnectionPaginated connectionPaginated = (ConnectionPaginated) o;
    return Objects.equals(this.cursors, connectionPaginated.cursors) &&
        Objects.equals(this.connections, connectionPaginated.connections) &&
        Objects.equals(this.meta, connectionPaginated.meta);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cursors, connections, meta);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConnectionPaginated {\n");
    sb.append("    cursors: ").append(toIndentedString(cursors)).append("\n");
    sb.append("    connections: ").append(toIndentedString(connections)).append("\n");
    sb.append("    meta: ").append(toIndentedString(meta)).append("\n");
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

