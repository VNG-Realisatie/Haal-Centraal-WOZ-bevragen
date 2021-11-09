/*
 * Waardering onroerende zaken
 *
 * Deze API levert actuele gegevens over WOZ-objecten 
 *
 * The version of the OpenAPI document: 1.0.0
 * Generated by: https://github.com/openapitools/openapi-generator.git
 */


using System;
using System.Collections;
using System.Collections.Generic;
using System.Collections.ObjectModel;
using System.Linq;
using System.IO;
using System.Runtime.Serialization;
using System.Text;
using System.Text.RegularExpressions;
using Newtonsoft.Json;
using Newtonsoft.Json.Converters;
using Newtonsoft.Json.Linq;
using System.ComponentModel.DataAnnotations;
using OpenAPIDateConverter = Org.OpenAPITools.Client.OpenAPIDateConverter;

namespace Org.OpenAPITools.Model
{
    /// <summary>
    /// WozObjectBasisLinks
    /// </summary>
    [DataContract(Name = "WozObjectBasisLinks")]
    public partial class WozObjectBasisLinks : IEquatable<WozObjectBasisLinks>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="WozObjectBasisLinks" /> class.
        /// </summary>
        /// <param name="self">self.</param>
        /// <param name="adres">adres.</param>
        /// <param name="adresseerbareObjecten">adresseerbareObjecten.</param>
        /// <param name="belanghebbendeEigenaar">belanghebbendeEigenaar.</param>
        /// <param name="belanghebbendeGebruiker">belanghebbendeGebruiker.</param>
        /// <param name="panden">panden.</param>
        /// <param name="kadastraalOnroerendeZaken">kadastraalOnroerendeZaken.</param>
        public WozObjectBasisLinks(HalLink self = default(HalLink), HalLink adres = default(HalLink), List<HalLink> adresseerbareObjecten = default(List<HalLink>), HalLink belanghebbendeEigenaar = default(HalLink), HalLink belanghebbendeGebruiker = default(HalLink), List<HalLink> panden = default(List<HalLink>), List<HalLink> kadastraalOnroerendeZaken = default(List<HalLink>))
        {
            this.Self = self;
            this.Adres = adres;
            this.AdresseerbareObjecten = adresseerbareObjecten;
            this.BelanghebbendeEigenaar = belanghebbendeEigenaar;
            this.BelanghebbendeGebruiker = belanghebbendeGebruiker;
            this.Panden = panden;
            this.KadastraalOnroerendeZaken = kadastraalOnroerendeZaken;
        }

        /// <summary>
        /// Gets or Sets Self
        /// </summary>
        [DataMember(Name = "self", EmitDefaultValue = false)]
        public HalLink Self { get; set; }

        /// <summary>
        /// Gets or Sets Adres
        /// </summary>
        [DataMember(Name = "adres", EmitDefaultValue = false)]
        public HalLink Adres { get; set; }

        /// <summary>
        /// Gets or Sets AdresseerbareObjecten
        /// </summary>
        [DataMember(Name = "adresseerbareObjecten", EmitDefaultValue = false)]
        public List<HalLink> AdresseerbareObjecten { get; set; }

        /// <summary>
        /// Gets or Sets BelanghebbendeEigenaar
        /// </summary>
        [DataMember(Name = "belanghebbendeEigenaar", EmitDefaultValue = false)]
        public HalLink BelanghebbendeEigenaar { get; set; }

        /// <summary>
        /// Gets or Sets BelanghebbendeGebruiker
        /// </summary>
        [DataMember(Name = "belanghebbendeGebruiker", EmitDefaultValue = false)]
        public HalLink BelanghebbendeGebruiker { get; set; }

        /// <summary>
        /// Gets or Sets Panden
        /// </summary>
        [DataMember(Name = "panden", EmitDefaultValue = false)]
        public List<HalLink> Panden { get; set; }

        /// <summary>
        /// Gets or Sets KadastraalOnroerendeZaken
        /// </summary>
        [DataMember(Name = "kadastraalOnroerendeZaken", EmitDefaultValue = false)]
        public List<HalLink> KadastraalOnroerendeZaken { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class WozObjectBasisLinks {\n");
            sb.Append("  Self: ").Append(Self).Append("\n");
            sb.Append("  Adres: ").Append(Adres).Append("\n");
            sb.Append("  AdresseerbareObjecten: ").Append(AdresseerbareObjecten).Append("\n");
            sb.Append("  BelanghebbendeEigenaar: ").Append(BelanghebbendeEigenaar).Append("\n");
            sb.Append("  BelanghebbendeGebruiker: ").Append(BelanghebbendeGebruiker).Append("\n");
            sb.Append("  Panden: ").Append(Panden).Append("\n");
            sb.Append("  KadastraalOnroerendeZaken: ").Append(KadastraalOnroerendeZaken).Append("\n");
            sb.Append("}\n");
            return sb.ToString();
        }

        /// <summary>
        /// Returns the JSON string presentation of the object
        /// </summary>
        /// <returns>JSON string presentation of the object</returns>
        public virtual string ToJson()
        {
            return Newtonsoft.Json.JsonConvert.SerializeObject(this, Newtonsoft.Json.Formatting.Indented);
        }

        /// <summary>
        /// Returns true if objects are equal
        /// </summary>
        /// <param name="input">Object to be compared</param>
        /// <returns>Boolean</returns>
        public override bool Equals(object input)
        {
            return this.Equals(input as WozObjectBasisLinks);
        }

        /// <summary>
        /// Returns true if WozObjectBasisLinks instances are equal
        /// </summary>
        /// <param name="input">Instance of WozObjectBasisLinks to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(WozObjectBasisLinks input)
        {
            if (input == null)
                return false;

            return 
                (
                    this.Self == input.Self ||
                    (this.Self != null &&
                    this.Self.Equals(input.Self))
                ) && 
                (
                    this.Adres == input.Adres ||
                    (this.Adres != null &&
                    this.Adres.Equals(input.Adres))
                ) && 
                (
                    this.AdresseerbareObjecten == input.AdresseerbareObjecten ||
                    this.AdresseerbareObjecten != null &&
                    input.AdresseerbareObjecten != null &&
                    this.AdresseerbareObjecten.SequenceEqual(input.AdresseerbareObjecten)
                ) && 
                (
                    this.BelanghebbendeEigenaar == input.BelanghebbendeEigenaar ||
                    (this.BelanghebbendeEigenaar != null &&
                    this.BelanghebbendeEigenaar.Equals(input.BelanghebbendeEigenaar))
                ) && 
                (
                    this.BelanghebbendeGebruiker == input.BelanghebbendeGebruiker ||
                    (this.BelanghebbendeGebruiker != null &&
                    this.BelanghebbendeGebruiker.Equals(input.BelanghebbendeGebruiker))
                ) && 
                (
                    this.Panden == input.Panden ||
                    this.Panden != null &&
                    input.Panden != null &&
                    this.Panden.SequenceEqual(input.Panden)
                ) && 
                (
                    this.KadastraalOnroerendeZaken == input.KadastraalOnroerendeZaken ||
                    this.KadastraalOnroerendeZaken != null &&
                    input.KadastraalOnroerendeZaken != null &&
                    this.KadastraalOnroerendeZaken.SequenceEqual(input.KadastraalOnroerendeZaken)
                );
        }

        /// <summary>
        /// Gets the hash code
        /// </summary>
        /// <returns>Hash code</returns>
        public override int GetHashCode()
        {
            unchecked // Overflow is fine, just wrap
            {
                int hashCode = 41;
                if (this.Self != null)
                    hashCode = hashCode * 59 + this.Self.GetHashCode();
                if (this.Adres != null)
                    hashCode = hashCode * 59 + this.Adres.GetHashCode();
                if (this.AdresseerbareObjecten != null)
                    hashCode = hashCode * 59 + this.AdresseerbareObjecten.GetHashCode();
                if (this.BelanghebbendeEigenaar != null)
                    hashCode = hashCode * 59 + this.BelanghebbendeEigenaar.GetHashCode();
                if (this.BelanghebbendeGebruiker != null)
                    hashCode = hashCode * 59 + this.BelanghebbendeGebruiker.GetHashCode();
                if (this.Panden != null)
                    hashCode = hashCode * 59 + this.Panden.GetHashCode();
                if (this.KadastraalOnroerendeZaken != null)
                    hashCode = hashCode * 59 + this.KadastraalOnroerendeZaken.GetHashCode();
                return hashCode;
            }
        }

        /// <summary>
        /// To validate all properties of the instance
        /// </summary>
        /// <param name="validationContext">Validation context</param>
        /// <returns>Validation Result</returns>
        public IEnumerable<System.ComponentModel.DataAnnotations.ValidationResult> Validate(ValidationContext validationContext)
        {
            yield break;
        }
    }

}
