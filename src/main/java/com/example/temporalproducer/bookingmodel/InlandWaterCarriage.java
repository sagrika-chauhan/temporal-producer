package com.example.temporalproducer.bookingmodel;

import com.fasterxml.jackson.annotation.JsonTypeName;
import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;

/**
 * Maintains InlandWaterCarriage implementation of Carriage class.
 */
@Getter
@JsonTypeName("inlandWaterCarriage")
@EqualsAndHashCode
public class InlandWaterCarriage extends Carriage {

  private final String vesselMaerskCode;

  @Builder
  public InlandWaterCarriage(String carriageType, String vesselMaerskCode) {
    super(carriageType);
    this.vesselMaerskCode = vesselMaerskCode;
  }
}
