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

/**
 * Belanghebbende eigenaar, erfpachter of houder van een opstalrecht of een vruchtgebruiker
 */
@ApiModel(description = "Belanghebbende eigenaar, erfpachter of houder van een opstalrecht of een vruchtgebruiker")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-01-12T10:15:17.976Z[Etc/UTC]")
public class BelanghebbendeEigenaarAllOf {
  public static final String SERIALIZED_NAME_SOORT = "soort";
  @SerializedName(SERIALIZED_NAME_SOORT)
  private String soort;


  public BelanghebbendeEigenaarAllOf soort(String soort) {
    
    this.soort = soort;
    return this;
  }

   /**
   * omschrijving van het soort zakelijk recht dat de eigenaar heeft op het WOZ-object
   * @return soort
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "recht van erfpacht", value = "omschrijving van het soort zakelijk recht dat de eigenaar heeft op het WOZ-object")

  public String getSoort() {
    return soort;
  }


  public void setSoort(String soort) {
    this.soort = soort;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BelanghebbendeEigenaarAllOf belanghebbendeEigenaarAllOf = (BelanghebbendeEigenaarAllOf) o;
    return Objects.equals(this.soort, belanghebbendeEigenaarAllOf.soort);
  }

  @Override
  public int hashCode() {
    return Objects.hash(soort);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BelanghebbendeEigenaarAllOf {\n");
    sb.append("    soort: ").append(toIndentedString(soort)).append("\n");
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
