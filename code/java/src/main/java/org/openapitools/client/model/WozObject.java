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
import java.util.ArrayList;
import java.util.List;
import org.openapitools.client.model.Belanghebbende;
import org.openapitools.client.model.BelanghebbendeEigenaar;
import org.openapitools.client.model.ObjectAanduiding;
import org.openapitools.client.model.Waarde;
import org.openapitools.client.model.Waardetabel;

/**
 * WozObject
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-01-29T15:06:01.841Z[Etc/UTC]")
public class WozObject {
  public static final String SERIALIZED_NAME_AANDUIDING = "aanduiding";
  @SerializedName(SERIALIZED_NAME_AANDUIDING)
  private ObjectAanduiding aanduiding = null;

  public static final String SERIALIZED_NAME_ADRESSEERBAAR_OBJECT_IDENTIFICATIES = "adresseerbaarObjectIdentificaties";
  @SerializedName(SERIALIZED_NAME_ADRESSEERBAAR_OBJECT_IDENTIFICATIES)
  private List<String> adresseerbaarObjectIdentificaties = null;

  public static final String SERIALIZED_NAME_BELANGHEBBENDE_EIGENAAR = "belanghebbendeEigenaar";
  @SerializedName(SERIALIZED_NAME_BELANGHEBBENDE_EIGENAAR)
  private BelanghebbendeEigenaar belanghebbendeEigenaar = null;

  public static final String SERIALIZED_NAME_BELANGHEBBENDE_GEBRUIKER = "belanghebbendeGebruiker";
  @SerializedName(SERIALIZED_NAME_BELANGHEBBENDE_GEBRUIKER)
  private Belanghebbende belanghebbendeGebruiker;

  public static final String SERIALIZED_NAME_GRONDOPPERVLAKTE = "grondoppervlakte";
  @SerializedName(SERIALIZED_NAME_GRONDOPPERVLAKTE)
  private Integer grondoppervlakte;

  public static final String SERIALIZED_NAME_IDENTIFICATIE = "identificatie";
  @SerializedName(SERIALIZED_NAME_IDENTIFICATIE)
  private String identificatie;

  public static final String SERIALIZED_NAME_KADASTRAAL_ONROERENDE_ZAAK_IDENTIFICATIES = "kadastraalOnroerendeZaakIdentificaties";
  @SerializedName(SERIALIZED_NAME_KADASTRAAL_ONROERENDE_ZAAK_IDENTIFICATIES)
  private List<String> kadastraalOnroerendeZaakIdentificaties = null;

  public static final String SERIALIZED_NAME_PAND_IDENTIFICATIES = "pandIdentificaties";
  @SerializedName(SERIALIZED_NAME_PAND_IDENTIFICATIES)
  private List<String> pandIdentificaties = null;

  public static final String SERIALIZED_NAME_VERANTWOORDELIJKE_GEMEENTE = "verantwoordelijkeGemeente";
  @SerializedName(SERIALIZED_NAME_VERANTWOORDELIJKE_GEMEENTE)
  private Waardetabel verantwoordelijkeGemeente;

  public static final String SERIALIZED_NAME_WAARDEN = "waarden";
  @SerializedName(SERIALIZED_NAME_WAARDEN)
  private List<Waarde> waarden = null;


  public WozObject aanduiding(ObjectAanduiding aanduiding) {
    
    this.aanduiding = aanduiding;
    return this;
  }

   /**
   * Get aanduiding
   * @return aanduiding
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public ObjectAanduiding getAanduiding() {
    return aanduiding;
  }


  public void setAanduiding(ObjectAanduiding aanduiding) {
    this.aanduiding = aanduiding;
  }


  public WozObject adresseerbaarObjectIdentificaties(List<String> adresseerbaarObjectIdentificaties) {
    
    this.adresseerbaarObjectIdentificaties = adresseerbaarObjectIdentificaties;
    return this;
  }

  public WozObject addAdresseerbaarObjectIdentificatiesItem(String adresseerbaarObjectIdentificatiesItem) {
    if (this.adresseerbaarObjectIdentificaties == null) {
      this.adresseerbaarObjectIdentificaties = new ArrayList<>();
    }
    this.adresseerbaarObjectIdentificaties.add(adresseerbaarObjectIdentificatiesItem);
    return this;
  }

   /**
   * BAG identificaties van verblijfsobjecten, standplaatsen en ligplaatsen die aan dit WOZ-object verbonden zijn.
   * @return adresseerbaarObjectIdentificaties
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "BAG identificaties van verblijfsobjecten, standplaatsen en ligplaatsen die aan dit WOZ-object verbonden zijn.")

  public List<String> getAdresseerbaarObjectIdentificaties() {
    return adresseerbaarObjectIdentificaties;
  }


  public void setAdresseerbaarObjectIdentificaties(List<String> adresseerbaarObjectIdentificaties) {
    this.adresseerbaarObjectIdentificaties = adresseerbaarObjectIdentificaties;
  }


  public WozObject belanghebbendeEigenaar(BelanghebbendeEigenaar belanghebbendeEigenaar) {
    
    this.belanghebbendeEigenaar = belanghebbendeEigenaar;
    return this;
  }

   /**
   * Get belanghebbendeEigenaar
   * @return belanghebbendeEigenaar
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public BelanghebbendeEigenaar getBelanghebbendeEigenaar() {
    return belanghebbendeEigenaar;
  }


  public void setBelanghebbendeEigenaar(BelanghebbendeEigenaar belanghebbendeEigenaar) {
    this.belanghebbendeEigenaar = belanghebbendeEigenaar;
  }


  public WozObject belanghebbendeGebruiker(Belanghebbende belanghebbendeGebruiker) {
    
    this.belanghebbendeGebruiker = belanghebbendeGebruiker;
    return this;
  }

   /**
   * Get belanghebbendeGebruiker
   * @return belanghebbendeGebruiker
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Belanghebbende getBelanghebbendeGebruiker() {
    return belanghebbendeGebruiker;
  }


  public void setBelanghebbendeGebruiker(Belanghebbende belanghebbendeGebruiker) {
    this.belanghebbendeGebruiker = belanghebbendeGebruiker;
  }


  public WozObject grondoppervlakte(Integer grondoppervlakte) {
    
    this.grondoppervlakte = grondoppervlakte;
    return this;
  }

   /**
   * De oppervlakte grond in vierkante meters die behoort tot het WOZ-object.
   * @return grondoppervlakte
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "De oppervlakte grond in vierkante meters die behoort tot het WOZ-object.")

  public Integer getGrondoppervlakte() {
    return grondoppervlakte;
  }


  public void setGrondoppervlakte(Integer grondoppervlakte) {
    this.grondoppervlakte = grondoppervlakte;
  }


  public WozObject identificatie(String identificatie) {
    
    this.identificatie = identificatie;
    return this;
  }

   /**
   * Unieke identificatie van het WOZ-object
   * @return identificatie
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Unieke identificatie van het WOZ-object")

  public String getIdentificatie() {
    return identificatie;
  }


  public void setIdentificatie(String identificatie) {
    this.identificatie = identificatie;
  }


  public WozObject kadastraalOnroerendeZaakIdentificaties(List<String> kadastraalOnroerendeZaakIdentificaties) {
    
    this.kadastraalOnroerendeZaakIdentificaties = kadastraalOnroerendeZaakIdentificaties;
    return this;
  }

  public WozObject addKadastraalOnroerendeZaakIdentificatiesItem(String kadastraalOnroerendeZaakIdentificatiesItem) {
    if (this.kadastraalOnroerendeZaakIdentificaties == null) {
      this.kadastraalOnroerendeZaakIdentificaties = new ArrayList<>();
    }
    this.kadastraalOnroerendeZaakIdentificaties.add(kadastraalOnroerendeZaakIdentificatiesItem);
    return this;
  }

   /**
   * De identificaties van kadastraal onroerende zaken die geheel of gedeeltelijk deel uitmaken van het WOZ-object
   * @return kadastraalOnroerendeZaakIdentificaties
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "De identificaties van kadastraal onroerende zaken die geheel of gedeeltelijk deel uitmaken van het WOZ-object")

  public List<String> getKadastraalOnroerendeZaakIdentificaties() {
    return kadastraalOnroerendeZaakIdentificaties;
  }


  public void setKadastraalOnroerendeZaakIdentificaties(List<String> kadastraalOnroerendeZaakIdentificaties) {
    this.kadastraalOnroerendeZaakIdentificaties = kadastraalOnroerendeZaakIdentificaties;
  }


  public WozObject pandIdentificaties(List<String> pandIdentificaties) {
    
    this.pandIdentificaties = pandIdentificaties;
    return this;
  }

  public WozObject addPandIdentificatiesItem(String pandIdentificatiesItem) {
    if (this.pandIdentificaties == null) {
      this.pandIdentificaties = new ArrayList<>();
    }
    this.pandIdentificaties.add(pandIdentificatiesItem);
    return this;
  }

   /**
   * Get pandIdentificaties
   * @return pandIdentificaties
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<String> getPandIdentificaties() {
    return pandIdentificaties;
  }


  public void setPandIdentificaties(List<String> pandIdentificaties) {
    this.pandIdentificaties = pandIdentificaties;
  }


  public WozObject verantwoordelijkeGemeente(Waardetabel verantwoordelijkeGemeente) {
    
    this.verantwoordelijkeGemeente = verantwoordelijkeGemeente;
    return this;
  }

   /**
   * Get verantwoordelijkeGemeente
   * @return verantwoordelijkeGemeente
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Waardetabel getVerantwoordelijkeGemeente() {
    return verantwoordelijkeGemeente;
  }


  public void setVerantwoordelijkeGemeente(Waardetabel verantwoordelijkeGemeente) {
    this.verantwoordelijkeGemeente = verantwoordelijkeGemeente;
  }


  public WozObject waarden(List<Waarde> waarden) {
    
    this.waarden = waarden;
    return this;
  }

  public WozObject addWaardenItem(Waarde waardenItem) {
    if (this.waarden == null) {
      this.waarden = new ArrayList<>();
    }
    this.waarden.add(waardenItem);
    return this;
  }

   /**
   * Get waarden
   * @return waarden
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<Waarde> getWaarden() {
    return waarden;
  }


  public void setWaarden(List<Waarde> waarden) {
    this.waarden = waarden;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WozObject wozObject = (WozObject) o;
    return Objects.equals(this.aanduiding, wozObject.aanduiding) &&
        Objects.equals(this.adresseerbaarObjectIdentificaties, wozObject.adresseerbaarObjectIdentificaties) &&
        Objects.equals(this.belanghebbendeEigenaar, wozObject.belanghebbendeEigenaar) &&
        Objects.equals(this.belanghebbendeGebruiker, wozObject.belanghebbendeGebruiker) &&
        Objects.equals(this.grondoppervlakte, wozObject.grondoppervlakte) &&
        Objects.equals(this.identificatie, wozObject.identificatie) &&
        Objects.equals(this.kadastraalOnroerendeZaakIdentificaties, wozObject.kadastraalOnroerendeZaakIdentificaties) &&
        Objects.equals(this.pandIdentificaties, wozObject.pandIdentificaties) &&
        Objects.equals(this.verantwoordelijkeGemeente, wozObject.verantwoordelijkeGemeente) &&
        Objects.equals(this.waarden, wozObject.waarden);
  }

  @Override
  public int hashCode() {
    return Objects.hash(aanduiding, adresseerbaarObjectIdentificaties, belanghebbendeEigenaar, belanghebbendeGebruiker, grondoppervlakte, identificatie, kadastraalOnroerendeZaakIdentificaties, pandIdentificaties, verantwoordelijkeGemeente, waarden);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WozObject {\n");
    sb.append("    aanduiding: ").append(toIndentedString(aanduiding)).append("\n");
    sb.append("    adresseerbaarObjectIdentificaties: ").append(toIndentedString(adresseerbaarObjectIdentificaties)).append("\n");
    sb.append("    belanghebbendeEigenaar: ").append(toIndentedString(belanghebbendeEigenaar)).append("\n");
    sb.append("    belanghebbendeGebruiker: ").append(toIndentedString(belanghebbendeGebruiker)).append("\n");
    sb.append("    grondoppervlakte: ").append(toIndentedString(grondoppervlakte)).append("\n");
    sb.append("    identificatie: ").append(toIndentedString(identificatie)).append("\n");
    sb.append("    kadastraalOnroerendeZaakIdentificaties: ").append(toIndentedString(kadastraalOnroerendeZaakIdentificaties)).append("\n");
    sb.append("    pandIdentificaties: ").append(toIndentedString(pandIdentificaties)).append("\n");
    sb.append("    verantwoordelijkeGemeente: ").append(toIndentedString(verantwoordelijkeGemeente)).append("\n");
    sb.append("    waarden: ").append(toIndentedString(waarden)).append("\n");
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

