package com.example.temporalproducer.bookingmodel;

import com.fasterxml.jackson.annotation.JsonTypeName;
import lombok.Builder;
import lombok.Getter;

/**
 * Maintains City related information.
 */
@Getter
@JsonTypeName("city")
public class CityInfra extends LocationInfra {

  @Builder
  public CityInfra(
      String countryCode,
      String code,
      String name,
      PositionInfra position,
      SiteInfra site,
      PostalAddressInfra postalAddress) {
    super(countryCode, code, name, position, site, postalAddress);
  }
}
