package com.example.temporalproducer.bookingmodel;

import com.fasterxml.jackson.annotation.JsonTypeName;
import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;

/**
 * Provides Facility implementation of Location class.
 */
@Getter
@JsonTypeName("facility")
@EqualsAndHashCode
public class Facility extends Location {
  private final FacilityBase facilityBase;

  @Builder
  public Facility(
      FacilityBase facilityBase,
      String countryCode,
      String cityCode,
      String name,
      Position position,
      Site site,
      PostalAddress postalAddress) {
    super(countryCode, cityCode, name, position, site, postalAddress);
    this.facilityBase = facilityBase;
  }
}
