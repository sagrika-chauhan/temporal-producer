package com.example.temporalproducer.bookingmodel;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonSubTypes.Type;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import lombok.Data;
import lombok.RequiredArgsConstructor;

/** A relationship to a geographical location, e.g. site, city or country. */
@RequiredArgsConstructor
@Data
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NAME,
    include = JsonTypeInfo.As.EXISTING_PROPERTY,
    property = "type")
@JsonSubTypes({
  @Type(value = CityInfra.class, name = "city"),
  @Type(value = FacilityInfra.class, name = "facility")
})
public abstract class LocationInfra {
  /** ISO 2 country code, e.g. US pattern : [A-Z]{2} . */
  private final String countryCode;
  /** Maersk code for the city / facility, e.g. CNC for Charlotte . */
  private final String code;
  /** The name of the city/facility, e.g. Singapore . */
  private final String name;
  /** Represents a position in longitude, latitude and altitude . */
  private final PositionInfra position;
  /** Represents a site which has site name and site code . */
  private final SiteInfra site;

  private final PostalAddressInfra postalAddress;
}
