package com.example.temporalproducer.bookingmodel;

import com.fasterxml.jackson.annotation.JsonTypeName;
import lombok.Builder;
import lombok.Getter;

/**
 * Provides City implementation of Location data.
 */
@Getter
@JsonTypeName("city")
public class City extends Location {

  @Builder
  public City(
      String countryCode,
      String code,
      String name,
      Position position,
      Site site,
      PostalAddress postalAddress) {
    super(countryCode, code, name, position, site, postalAddress);
  }
}
