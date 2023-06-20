package com.example.temporalproducer.bookingmodel;

import com.fasterxml.jackson.annotation.JsonTypeName;
import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;

/**
 * Maintains Facility related information.
 */
@Getter
@JsonTypeName("facility")
@EqualsAndHashCode
public class FacilityInfra extends LocationInfra {

  private final FacilityBaseInfra facilityBase;

  @Builder
  public FacilityInfra(
      FacilityBaseInfra facilityBase,
      String countryCode,
      String code,
      String name,
      PositionInfra position,
      SiteInfra site,
      PostalAddressInfra postalAddress) {
    super(countryCode, code, name, position, site, postalAddress);
    this.facilityBase = facilityBase;
  }
}
