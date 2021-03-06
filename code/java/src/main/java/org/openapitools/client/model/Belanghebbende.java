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
import org.openapitools.client.model.PersoonTypeEnum;

/**
 * Belanghebbende
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-01-29T15:06:01.841Z[Etc/UTC]")
public class Belanghebbende {
  public static final String SERIALIZED_NAME_BURGERSERVICENUMMER = "burgerservicenummer";
  @SerializedName(SERIALIZED_NAME_BURGERSERVICENUMMER)
  private String burgerservicenummer;

  public static final String SERIALIZED_NAME_GEHEIMHOUDING_PERSOONSGEGEVENS = "geheimhoudingPersoonsgegevens";
  @SerializedName(SERIALIZED_NAME_GEHEIMHOUDING_PERSOONSGEGEVENS)
  private Boolean geheimhoudingPersoonsgegevens;

  public static final String SERIALIZED_NAME_KVK_NUMMER = "kvkNummer";
  @SerializedName(SERIALIZED_NAME_KVK_NUMMER)
  private String kvkNummer;

  public static final String SERIALIZED_NAME_NAAM = "naam";
  @SerializedName(SERIALIZED_NAME_NAAM)
  private String naam;

  public static final String SERIALIZED_NAME_RSIN = "rsin";
  @SerializedName(SERIALIZED_NAME_RSIN)
  private String rsin;

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private PersoonTypeEnum type;

  public static final String SERIALIZED_NAME_VESTIGINGSNUMMER = "vestigingsnummer";
  @SerializedName(SERIALIZED_NAME_VESTIGINGSNUMMER)
  private String vestigingsnummer;


  public Belanghebbende burgerservicenummer(String burgerservicenummer) {
    
    this.burgerservicenummer = burgerservicenummer;
    return this;
  }

   /**
   * Get burgerservicenummer
   * @return burgerservicenummer
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getBurgerservicenummer() {
    return burgerservicenummer;
  }


  public void setBurgerservicenummer(String burgerservicenummer) {
    this.burgerservicenummer = burgerservicenummer;
  }


  public Belanghebbende geheimhoudingPersoonsgegevens(Boolean geheimhoudingPersoonsgegevens) {
    
    this.geheimhoudingPersoonsgegevens = geheimhoudingPersoonsgegevens;
    return this;
  }

   /**
   * Indien true: op verzoek van deze persoon is het verstrekken van gegevens over deze persoon aan bepaalde derden niet toegestaan.
   * @return geheimhoudingPersoonsgegevens
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Indien true: op verzoek van deze persoon is het verstrekken van gegevens over deze persoon aan bepaalde derden niet toegestaan.")

  public Boolean getGeheimhoudingPersoonsgegevens() {
    return geheimhoudingPersoonsgegevens;
  }


  public void setGeheimhoudingPersoonsgegevens(Boolean geheimhoudingPersoonsgegevens) {
    this.geheimhoudingPersoonsgegevens = geheimhoudingPersoonsgegevens;
  }


  public Belanghebbende kvkNummer(String kvkNummer) {
    
    this.kvkNummer = kvkNummer;
    return this;
  }

   /**
   * Get kvkNummer
   * @return kvkNummer
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getKvkNummer() {
    return kvkNummer;
  }


  public void setKvkNummer(String kvkNummer) {
    this.kvkNummer = kvkNummer;
  }


  public Belanghebbende naam(String naam) {
    
    this.naam = naam;
    return this;
  }

   /**
   * Get naam
   * @return naam
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Jan de Vries", value = "")

  public String getNaam() {
    return naam;
  }


  public void setNaam(String naam) {
    this.naam = naam;
  }


  public Belanghebbende rsin(String rsin) {
    
    this.rsin = rsin;
    return this;
  }

   /**
   * unieke identificatie van een niet-natuurlijk persoon (rechtspersoon of samenwerkingsverband)
   * @return rsin
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "unieke identificatie van een niet-natuurlijk persoon (rechtspersoon of samenwerkingsverband)")

  public String getRsin() {
    return rsin;
  }


  public void setRsin(String rsin) {
    this.rsin = rsin;
  }


  public Belanghebbende type(PersoonTypeEnum type) {
    
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public PersoonTypeEnum getType() {
    return type;
  }


  public void setType(PersoonTypeEnum type) {
    this.type = type;
  }


  public Belanghebbende vestigingsnummer(String vestigingsnummer) {
    
    this.vestigingsnummer = vestigingsnummer;
    return this;
  }

   /**
   * Get vestigingsnummer
   * @return vestigingsnummer
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getVestigingsnummer() {
    return vestigingsnummer;
  }


  public void setVestigingsnummer(String vestigingsnummer) {
    this.vestigingsnummer = vestigingsnummer;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Belanghebbende belanghebbende = (Belanghebbende) o;
    return Objects.equals(this.burgerservicenummer, belanghebbende.burgerservicenummer) &&
        Objects.equals(this.geheimhoudingPersoonsgegevens, belanghebbende.geheimhoudingPersoonsgegevens) &&
        Objects.equals(this.kvkNummer, belanghebbende.kvkNummer) &&
        Objects.equals(this.naam, belanghebbende.naam) &&
        Objects.equals(this.rsin, belanghebbende.rsin) &&
        Objects.equals(this.type, belanghebbende.type) &&
        Objects.equals(this.vestigingsnummer, belanghebbende.vestigingsnummer);
  }

  @Override
  public int hashCode() {
    return Objects.hash(burgerservicenummer, geheimhoudingPersoonsgegevens, kvkNummer, naam, rsin, type, vestigingsnummer);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Belanghebbende {\n");
    sb.append("    burgerservicenummer: ").append(toIndentedString(burgerservicenummer)).append("\n");
    sb.append("    geheimhoudingPersoonsgegevens: ").append(toIndentedString(geheimhoudingPersoonsgegevens)).append("\n");
    sb.append("    kvkNummer: ").append(toIndentedString(kvkNummer)).append("\n");
    sb.append("    naam: ").append(toIndentedString(naam)).append("\n");
    sb.append("    rsin: ").append(toIndentedString(rsin)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    vestigingsnummer: ").append(toIndentedString(vestigingsnummer)).append("\n");
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

