package com.example.temporalproducer.bookingmodel;

import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import lombok.Builder;

/**
 * A single setting for a temperature with minimum and maximum degrees allowed. Can be given a
 * duration to indicate how long the temperature should be appliacble for.
 */
@Builder
public class TemperatureSetPoint {

  // In case of multiple setpoints the sequence is used
  private Integer sequence;
  // The minimum temperature that the cargo can accept. Legal limit based on absolute zero in
  // Fahrenheit which will mean that Celsius will also validate correctly within bounds
  @Min(-462)
  @Max(1000)
  private Integer degreesMinimum;
  // The maximum temperature that the cargo can accept. Legal limit based on absolute zero in
  // Fahrenheit which will mean that Celsius will also validate correctly within bounds
  @Min(-462)
  @Max(1000)
  private Integer degreesMaximum;
  // Temperature Unit Enum
  private TemperatureUnitEnum degreesUnit;
  // The duration that the temperature setting must be maintained
  private Integer duration;
  // Code for a unit of measurement, e.g. KGM or M
  private String durationUnit;
  // The start date and time of the temperature setting
  private String startDatetime;
  // The end date and time of the temperature setting
  private String endDatetime;
  // Unique code identifying the temperature profile, e.g. CTFV for Cold Treament (Fruits and
  // Vegatable)
  private String temperatureProfileCode;
}
