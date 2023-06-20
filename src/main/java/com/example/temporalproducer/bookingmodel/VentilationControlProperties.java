package com.example.temporalproducer.bookingmodel;

import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import lombok.Builder;

/**
 * Maintains VentilationControlProperties related information.
 */
@Builder
public class VentilationControlProperties {
  // Discrete volume per hour value that is used when not setting a minimum and maximum.
  private Integer volumePerHour;
  // Minimum volume of air ventilated through asset or storage.
  private Integer volumePerHourMinimum;
  // Maximum volume of air ventilated through asset or storage.
  private Integer volumePerHourMaximum;
  // Volume Unit Enum
  private VolumeUnitEnum volumeUnit;
  // Indicates the percentage that the vents must be opened as not all assets have volume per hour
  // capabilities.
  @Min(0)
  @Max(100)
  private Integer ventsOpeningPercentage;

  private EnvironmentControlTypeEnum environmentControlType;
}
