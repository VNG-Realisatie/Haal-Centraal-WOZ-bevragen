/*
 * Waardering onroerende zaken
 * Deze API levert actuele gegevens over WOZ-objecten 
 *
 * The version of the OpenAPI document: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package org.openapitools.client.model;

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
import org.openapitools.client.model.HalCollectionLinks;
import org.openapitools.client.model.HalLink;
import org.openapitools.client.model.HalPaginationLinksAllOf;

/**
 * HalPaginationLinks bevat de link properties die nodig zijn om te kunnen navigeren in een collectie:  - first: uri voor het opvragen van de eerste pagina van deze collectie - previous: uri voor het opvragen van de vorige pagina van deze collectie - next: uri voor het opvragen van de volgende pagina van deze collectie 
 */
@ApiModel(description = "HalPaginationLinks bevat de link properties die nodig zijn om te kunnen navigeren in een collectie:  - first: uri voor het opvragen van de eerste pagina van deze collectie - previous: uri voor het opvragen van de vorige pagina van deze collectie - next: uri voor het opvragen van de volgende pagina van deze collectie ")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-11-09T07:56:59.068811Z[Etc/UTC]")
public class HalPaginationLinks {
  public static final String SERIALIZED_NAME_SELF = "self";
  @SerializedName(SERIALIZED_NAME_SELF)
  private HalLink self;

  public static final String SERIALIZED_NAME_FIRST = "first";
  @SerializedName(SERIALIZED_NAME_FIRST)
  private HalLink first;

  public static final String SERIALIZED_NAME_PREVIOUS = "previous";
  @SerializedName(SERIALIZED_NAME_PREVIOUS)
  private HalLink previous;

  public static final String SERIALIZED_NAME_NEXT = "next";
  @SerializedName(SERIALIZED_NAME_NEXT)
  private HalLink next;


  public HalPaginationLinks self(HalLink self) {
    
    this.self = self;
    return this;
  }

   /**
   * Get self
   * @return self
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public HalLink getSelf() {
    return self;
  }


  public void setSelf(HalLink self) {
    this.self = self;
  }


  public HalPaginationLinks first(HalLink first) {
    
    this.first = first;
    return this;
  }

   /**
   * Get first
   * @return first
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public HalLink getFirst() {
    return first;
  }


  public void setFirst(HalLink first) {
    this.first = first;
  }


  public HalPaginationLinks previous(HalLink previous) {
    
    this.previous = previous;
    return this;
  }

   /**
   * Get previous
   * @return previous
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public HalLink getPrevious() {
    return previous;
  }


  public void setPrevious(HalLink previous) {
    this.previous = previous;
  }


  public HalPaginationLinks next(HalLink next) {
    
    this.next = next;
    return this;
  }

   /**
   * Get next
   * @return next
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public HalLink getNext() {
    return next;
  }


  public void setNext(HalLink next) {
    this.next = next;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    HalPaginationLinks halPaginationLinks = (HalPaginationLinks) o;
    return Objects.equals(this.self, halPaginationLinks.self) &&
        Objects.equals(this.first, halPaginationLinks.first) &&
        Objects.equals(this.previous, halPaginationLinks.previous) &&
        Objects.equals(this.next, halPaginationLinks.next);
  }

  @Override
  public int hashCode() {
    return Objects.hash(self, first, previous, next);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class HalPaginationLinks {\n");
    sb.append("    self: ").append(toIndentedString(self)).append("\n");
    sb.append("    first: ").append(toIndentedString(first)).append("\n");
    sb.append("    previous: ").append(toIndentedString(previous)).append("\n");
    sb.append("    next: ").append(toIndentedString(next)).append("\n");
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

