package com.example.temporalproducer.bookingmodel;

import jakarta.validation.constraints.Min;
import lombok.Builder;

/**
 * Maintains HumidityControlProperties related information.
 */
@Builder
public class HumidityControlProperties {

  // Discrete humidity value that is used when not setting a minimum and maximum.
  @Min(0)
  @Min(100)
  private Integer percentage;
  // The minimum humidity in percentage.
  @Min(0)
  @Min(100)
  private Integer percentageMinimum;
  // The maximum humidty in percentage.
  @Min(0)
  @Min(100)
  private Integer percentageMaximum;

  private EnvironmentControlTypeEnum environmentControlType;
}
