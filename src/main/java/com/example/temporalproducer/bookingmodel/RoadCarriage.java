package com.example.temporalproducer.bookingmodel;

import com.fasterxml.jackson.annotation.JsonTypeName;
import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;

/**
 * Maintains RoadCarriage related information.
 */
@Getter
@JsonTypeName("roadCarriage")
@EqualsAndHashCode
public class RoadCarriage extends Carriage {

  private final String truckIdentifier;
  private final String truckLicensePlate;

  @Builder
  public RoadCarriage(String carriageType, String truckIdentifier, String truckLicensePlate) {
    super(carriageType);
    this.truckIdentifier = truckIdentifier;
    this.truckLicensePlate = truckLicensePlate;
  }
}
