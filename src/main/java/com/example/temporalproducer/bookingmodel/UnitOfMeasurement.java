package com.example.temporalproducer.bookingmodel;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * Maintains UnitOfMeasurement related information.
 */
@Builder
@Getter
@Setter
public class UnitOfMeasurement {
  private String unitOfMeasurementCode;
  private String unitOfMeasurementName;
  private String unitOfMeasurementDescription;
  private String unitOfMeasurementSymbol;
  private String measurementSystemCode;
  private List<AlternativeCodes> alternativeCodes;
}
