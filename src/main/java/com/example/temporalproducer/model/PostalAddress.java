package com.example.temporalproducer.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/** "A physical mailing address. " */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@JsonIgnoreProperties(ignoreUnknown = true)
public class PostalAddress {
  private String postalAddressLine1;
  private String postalAddressLine2;
  private String postalAddressLine3;
  private String houseNumber;
  private String postalCode;
  private String cityName;
  private String cityCode;
  private String countryName;
}
