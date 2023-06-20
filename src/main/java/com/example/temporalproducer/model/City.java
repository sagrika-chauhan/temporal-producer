package com.example.temporalproducer.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * City in a country and/or in a subdivision, e.g. Charlotte in North Carolina in the United States
 * of America.\n\n**MIM Note**\n\nAttributes from Defined Area that are relevant for JSON schema has
 * been pulled down directly to City schema.
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@JsonIgnoreProperties(ignoreUnknown = true)
public class City {
  private String iso2CountryCode;
  private String cityCode;
  private String cityName;
  private PostalAddress postalAddress;
}
