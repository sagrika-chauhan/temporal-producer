package com.example.temporalproducer.bookingmodel;

import lombok.Builder;

/**
 * This schema specifies what "Dangerous Cargo Plate Conventions" exist, and as such what
 * conventions own which sets of "Dangerous Cargo Plate Upper Part" values.
 */
@Builder
public class DangerousCargoPlateConvention {

  // A code for the convention
  private String dangerousCargoPlateConventionCode;
  // A name for the convention
  private String dangerousCargoPlateConventionName;
  // ISO 2 country code, e.g. US
  private String iso2CountryCode;
}
