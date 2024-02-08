---
layout: page-with-side-nav
title: Getting Started
---
# Getting Started

De 'WOZ Bevragen' API is gespecificeerd met behulp van de OpenAPI Specifications (OAS3).

Om aan te sluiten kun je de volgende stappen doorlopen:
1. [Aanmelden](#aanmelden) bij het kadaster om toegang te krijgen
2. Bekijk de [functionaliteit en specificaties](#functionaliteit-en-specificaties)
3. [Implementeer de API Client](#implementeer-de-api-client)
4. [Probeer en test de API](#probeer-en-test-de-api)<!-- 5. [Sluit aan op productie](#aansluiten-op-productie) -->
5. Gebruik de [WOZ.BevragenProxy](#wozbevragenproxy) om voor een WOZ-object alleen de relevante actuele waarde per waardepeildatum op te vragen

## Aanmelden
Meld je aan bij het kadaster om [aan te sluiten en voor toegang](https://www.kadaster.nl/zakelijk/producten/adressen-en-gebouwen/woz-api-huidige-bevragingen). Aansluiten mag alleen als jouw gebruiksdoel belastingheffing is. Je ontvangt dan o.a. een API-key die nodig is voor toegang tot de testomgeving. 

## Functionaliteit en specificaties
Je kunt een visuele representatie van de specificatie bekijken met [Swagger UI]({{ site.baseurl }}/swagger-ui) of [Redoc]({{ site.baseurl }}/redoc).

Je kunt de [functionele documentatie](./features) vinden in de [features](./features).

### Resource WOZ-object 
Je kunt op de volgende manieren WOZ objecten (met WOZ waardes) zoeken en raadplegen:

- Opvragen van een WOZ-object met een identificatie.
- Zoeken van een WOZ-object met de identificatie van het adres.
- Zoeken van 1 of meer WOZ-objecten met een postcode en een huisnummer, eventueel aangevuld met huisletter en/of huisnummertoevoeging.
- Zoeken van 1 of meer WOZ-objecten met een niet-natuurlijk persoon (rsin) of een maatschappelijke activiteit (kvknr).
- Zoeken van 1 of meer WOZ-objecten met de identificatie van een adresseerbaar object (verblijfsobject, ligplaats, standplaats).

### Algemeen
Verder zijn er nog een paar algemene functies die gelden voor alle bovenstaande aanvragen:
- Gebruik van de fields parameter om de response te filteren. (Voor werking, zie feature [fields](https://github.com/VNG-Realisatie/Haal-Centraal-common/blob/v1.2.0/features/fields.feature))
- Velden die altijd worden geleverd.

|Resource                           |Velden                         |
|-----                              |------                         |
|wozobjecten                        |identificatie, _links.self     |

- [HAL links](https://tools.ietf.org/html/draft-kelly-json-hal-08), die soms [templated](https://github.com/VNG-Realisatie/Haal-Centraal-common/blob/v1.2.0/features/uri-templating.feature) worden geleverd.

## Implementeer de API client
Client code kun je genereren met de "[genereervariant](https://github.com/VNG-Realisatie/Haal-Centraal-WOZ-bevragen/blob/master/specificatie/genereervariant/openapi.yaml){:target="_blank" rel="noopener"}" van de API-specificaties en een code generator. Een overzicht met codegeneratoren kun je vinden op [OpenAPI.Tools](https://openapi.tools/#sdk){:target="_blank" rel="noopener"}.

Deze repo bevat scripts waarmee je met [OpenAPI Generator](https://openapi-generator.tech/){:target="_blank" rel="noopener"} client code kunt genereren in JAVA, .NET (Full Framework & Core) en Python. De makkelijkste manier om de code generatie scripts te gebruiken, is door deze repo te clonen. Na het clonen kun je met `npm install` de benodigde packages installeren en kun je met npm run <script naam> één van de volgende scripts uitvoeren:
- oas:generate-java-client (voor JAVA client code)
- oas:generate-netcore-client (voor .NET Core client code)
- oas:generate-net-client (voor .NET Full Framework client code)
- oas:generate-python-client (voor Python client code)

Een lijst met andere ondersteunde generator opties kun je vinden in de [Generators List](https://openapi-generator.tech/docs/generators){:target="_blank" rel="noopener"} van OpenAPI Generator.

Note. De prerequisite van OpenAPI Generator is JAVA. Je moet een JAVA runtime installeren voordat je OpenAPI Generator kunt gebruiken
  
## Probeer en test de API
De werking van de API is het makkelijkst te testen met behulp van [Postman](https://www.getpostman.com/).
We hebben al een project voor je gemaakt die je kan gebruiken: [WOZ-Bevragen-postman-collection.json](https://github.com/VNG-Realisatie/Haal-Centraal-WOZ-bevragen/blob/master/test/WOZ-Bevragen-postman-collection.json). Deze kun je importeren in Postman waarna je alleen de endpoints en authenticatie (API-key) nog moet invullen.

### Configureer de url en api key

1. Klik bij "Waardering onroerende zaken" op de drie bolletjes.
2. Klik vervolgens op Edit
3. Selecteer tabblad "Authorization"
4. Kies TYPE "API Key"
5. Vul in Key: "x-api-key", Value: de API key die je van het Kadaster hebt ontvangen, Add to: "Header"
6. Selecteer tabblad "Variables"
7. Vul bij baseUrl INITIAL VALUE en bij CURRENT VALUE de url
8. Klik op de knop Update

De testomgeving van de API is te benaderen via de volgende url:
- _Beveiligde verbinding met alleen API-key: https://api.kadaster.nl/lvwoz-eto/huidigebevragingen_
    - Voor deze connectie met de testomgeving van deze API is vereist:
        - Een geldige API-key. Deze wordt bij de request opgenomen in request header "X-Api-Key". Wanneer je je aanmeldt voor het gebruiken van de API ontvang je de API-key.

## wozbevragen-proxy

Een WOZ-object opgevraagd via de WOZ Bevragen API bevat alle vastgestelde waarden per waardepeildatum voor het WOZ-object. Om voor een WOZ-object alleen de relevante actuele waarde per waardepeildatum op te vragen, kan gebruik worden gemaakt van de wozbevragen-proxy.
De wozbevragen-proxy routeert een WOZ-object bevraging naar de WOZ Bevragen API en filtert de niet-relevante waarden uit de response voordat deze wordt geretourneerd naar de bevrager. De wijze waarop dit wordt gedaan is beschreven in het [waarden.feature](https://github.com/VNG-Realisatie/Haal-Centraal-WOZ-bevragen/tree/master/features/waarden.feature) bestand.

In de volgende paragrafen is beschreven hoe de wozbevragen-proxy t.b.v. test doeleinden op een lokale machine kan worden geïnstalleerd en geconfigureerd.

### Prerequisites

- [Docker Desktop](https://www.docker.com/products/docker-desktop){:target="_blank" rel="noopener"} om de wozbevragen-proxy container image lokaal op een Windows of Mac PC te draaien
- API-key voor het aanroepen van de WOZ Bevragen API op de test omgeving 
- Een docker compose bestand om de wozbevragen-proxy container image te configureren en op te starten. Het [docker compose bestand](https://raw.githubusercontent.com/VNG-Realisatie/Haal-Centraal-WOZ-bevragen/master/docker-compose.yml){:target="_blank" rel="noopener"} op de Haal-Centraal-WOZ-bevragen GitHub repository kan als referentie worden gebruikt
- een ocelot.json bestand om de routering van de wozbevragen-proxy te configureren. Als referentie kan het [ocelot.json bestand](https://raw.githubusercontent.com/VNG-Realisatie/Haal-Centraal-WOZ-bevragen/master/src/config/Woz.BevragenProxy/ocelot.json){:target="_blank" rel="noopener"} worden gebruikt. Vervang de **woz-api-key** placeholder met je API-key

### Opstarten van de Woz.BevragenProxy Container

- Start de wozbevragen-proxy container image met de volgende statement
  ```sh
  docker-compose up -d
  ```
- Roep de WOZ Bevragen API aan met als base url: *http://localhost:5000*. Een aanroep met curl ziet er als volgt uit:
  ```sh
  curl --location --request GET 'http://localhost:5000/wozobjecten/800000003118'
  ```
 
