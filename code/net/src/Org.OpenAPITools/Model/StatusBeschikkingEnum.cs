/*
 * Waardering onroerende zaken
 *
 * Deze API levert actuele gegevens over WOZ-objecten 
 *
 * The version of the OpenAPI document: 1.0.0
 * 
 * Generated by: https://github.com/openapitools/openapi-generator.git
 */

using System;
using System.Linq;
using System.IO;
using System.Text;
using System.Text.RegularExpressions;
using System.Collections;
using System.Collections.Generic;
using System.Collections.ObjectModel;
using System.Runtime.Serialization;
using Newtonsoft.Json;
using Newtonsoft.Json.Converters;
using System.ComponentModel.DataAnnotations;
using OpenAPIDateConverter = Org.OpenAPITools.Client.OpenAPIDateConverter;

namespace Org.OpenAPITools.Model
{
    /// <summary>
    /// De status van een beschikking waarmee de waarde is vastgesteld. * &#x60;beschikking_genomen&#x60; - 01: beschikking genomen * &#x60;beschikking_vernietigd&#x60; - 02: vernietigingbeschikking * &#x60;beschikking_herzien&#x60; - 03: herzieningsbeschikking * &#x60;bezwaar_ingediend&#x60; - 10: bezwaar ingediend * &#x60;bezwaar_gehandhaafd&#x60; - 11: bezwaar afgehandeld, beschikking gehandhaafd * &#x60;bezwaar_veranderd&#x60; - 12: bezwaar afgehandeld, vastgestelde waarde veranderd * &#x60;waarde_ambtshalve_verminderd&#x60; - 13: waarde ambtshalve verminderd * &#x60;beroep_aangetekend&#x60; - 20: beroepaangetekend * &#x60;beroep_gehandhaafd&#x60; - 21: uitspraak beroep, beschikking gehandhaafd * &#x60;beroep_veranderd&#x60; - 22: uitspraak beroep, vastgestelde waarde veranderd * &#x60;hoger_beroep_aangetekend&#x60; - 23: hogerberoep aangetekend * &#x60;hoger_beroep_gehandhaafd&#x60; - 24: uitspraak hoger beroep, beschikking gehandhaafd * &#x60;hoger_beroep_veranderd&#x60; - 25: uitspraak hoger beroep, vastgestelde waarde veranderd * &#x60;cassatie_ingesteld&#x60; - 30: cassatie ingesteld * &#x60;hoge_raad_gehandhaafd&#x60; - 31: arrest Hoge Raad, beschikking gehandhaafd * &#x60;hoge_raad_veranderd&#x60; - 32: arrest Hoge Raad, vastgestelde waarde veranderd * &#x60;hoge_raad_geding_verwezen&#x60; - 33: arrestHogeRaad,geding verwezen * &#x60;voorlopige_aanslag&#x60; - 99: waarde te gebruiken voor voorlopige aanslag 
    /// </summary>
    /// <value>De status van een beschikking waarmee de waarde is vastgesteld. * &#x60;beschikking_genomen&#x60; - 01: beschikking genomen * &#x60;beschikking_vernietigd&#x60; - 02: vernietigingbeschikking * &#x60;beschikking_herzien&#x60; - 03: herzieningsbeschikking * &#x60;bezwaar_ingediend&#x60; - 10: bezwaar ingediend * &#x60;bezwaar_gehandhaafd&#x60; - 11: bezwaar afgehandeld, beschikking gehandhaafd * &#x60;bezwaar_veranderd&#x60; - 12: bezwaar afgehandeld, vastgestelde waarde veranderd * &#x60;waarde_ambtshalve_verminderd&#x60; - 13: waarde ambtshalve verminderd * &#x60;beroep_aangetekend&#x60; - 20: beroepaangetekend * &#x60;beroep_gehandhaafd&#x60; - 21: uitspraak beroep, beschikking gehandhaafd * &#x60;beroep_veranderd&#x60; - 22: uitspraak beroep, vastgestelde waarde veranderd * &#x60;hoger_beroep_aangetekend&#x60; - 23: hogerberoep aangetekend * &#x60;hoger_beroep_gehandhaafd&#x60; - 24: uitspraak hoger beroep, beschikking gehandhaafd * &#x60;hoger_beroep_veranderd&#x60; - 25: uitspraak hoger beroep, vastgestelde waarde veranderd * &#x60;cassatie_ingesteld&#x60; - 30: cassatie ingesteld * &#x60;hoge_raad_gehandhaafd&#x60; - 31: arrest Hoge Raad, beschikking gehandhaafd * &#x60;hoge_raad_veranderd&#x60; - 32: arrest Hoge Raad, vastgestelde waarde veranderd * &#x60;hoge_raad_geding_verwezen&#x60; - 33: arrestHogeRaad,geding verwezen * &#x60;voorlopige_aanslag&#x60; - 99: waarde te gebruiken voor voorlopige aanslag </value>
    
    [JsonConverter(typeof(StringEnumConverter))]
    
    public enum StatusBeschikkingEnum
    {
        /// <summary>
        /// Enum Beschikkinggenomen for value: beschikking_genomen
        /// </summary>
        [EnumMember(Value = "beschikking_genomen")]
        Beschikkinggenomen = 1,

        /// <summary>
        /// Enum Beschikkingvernietigd for value: beschikking_vernietigd
        /// </summary>
        [EnumMember(Value = "beschikking_vernietigd")]
        Beschikkingvernietigd = 2,

        /// <summary>
        /// Enum Beschikkingherzien for value: beschikking_herzien
        /// </summary>
        [EnumMember(Value = "beschikking_herzien")]
        Beschikkingherzien = 3,

        /// <summary>
        /// Enum Bezwaaringediend for value: bezwaar_ingediend
        /// </summary>
        [EnumMember(Value = "bezwaar_ingediend")]
        Bezwaaringediend = 4,

        /// <summary>
        /// Enum Bezwaargehandhaafd for value: bezwaar_gehandhaafd
        /// </summary>
        [EnumMember(Value = "bezwaar_gehandhaafd")]
        Bezwaargehandhaafd = 5,

        /// <summary>
        /// Enum Bezwaarveranderd for value: bezwaar_veranderd
        /// </summary>
        [EnumMember(Value = "bezwaar_veranderd")]
        Bezwaarveranderd = 6,

        /// <summary>
        /// Enum Waardeambtshalveverminderd for value: waarde_ambtshalve_verminderd
        /// </summary>
        [EnumMember(Value = "waarde_ambtshalve_verminderd")]
        Waardeambtshalveverminderd = 7,

        /// <summary>
        /// Enum Beroepaangetekend for value: beroep_aangetekend
        /// </summary>
        [EnumMember(Value = "beroep_aangetekend")]
        Beroepaangetekend = 8,

        /// <summary>
        /// Enum Beroepgehandhaafd for value: beroep_gehandhaafd
        /// </summary>
        [EnumMember(Value = "beroep_gehandhaafd")]
        Beroepgehandhaafd = 9,

        /// <summary>
        /// Enum Beroepveranderd for value: beroep_veranderd
        /// </summary>
        [EnumMember(Value = "beroep_veranderd")]
        Beroepveranderd = 10,

        /// <summary>
        /// Enum Hogerberoepaangetekend for value: hoger_beroep_aangetekend
        /// </summary>
        [EnumMember(Value = "hoger_beroep_aangetekend")]
        Hogerberoepaangetekend = 11,

        /// <summary>
        /// Enum Hogerberoepgehandhaafd for value: hoger_beroep_gehandhaafd
        /// </summary>
        [EnumMember(Value = "hoger_beroep_gehandhaafd")]
        Hogerberoepgehandhaafd = 12,

        /// <summary>
        /// Enum Hogerberoepveranderd for value: hoger_beroep_veranderd
        /// </summary>
        [EnumMember(Value = "hoger_beroep_veranderd")]
        Hogerberoepveranderd = 13,

        /// <summary>
        /// Enum Cassatieingesteld for value: cassatie_ingesteld
        /// </summary>
        [EnumMember(Value = "cassatie_ingesteld")]
        Cassatieingesteld = 14,

        /// <summary>
        /// Enum Hogeraadgehandhaafd for value: hoge_raad_gehandhaafd
        /// </summary>
        [EnumMember(Value = "hoge_raad_gehandhaafd")]
        Hogeraadgehandhaafd = 15,

        /// <summary>
        /// Enum Hogeraadveranderd for value: hoge_raad_veranderd
        /// </summary>
        [EnumMember(Value = "hoge_raad_veranderd")]
        Hogeraadveranderd = 16,

        /// <summary>
        /// Enum Hogeraadgedingverwezen for value: hoge_raad_geding_verwezen
        /// </summary>
        [EnumMember(Value = "hoge_raad_geding_verwezen")]
        Hogeraadgedingverwezen = 17,

        /// <summary>
        /// Enum Voorlopigeaanslag for value: voorlopige_aanslag
        /// </summary>
        [EnumMember(Value = "voorlopige_aanslag")]
        Voorlopigeaanslag = 18

    }

}
