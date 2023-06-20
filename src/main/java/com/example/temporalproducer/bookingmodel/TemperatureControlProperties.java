package com.example.temporalproducer.bookingmodel;

import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import lombok.Builder;
import lombok.Getter;

import java.util.List;

/**
 * All features pertaining to temperature control on an environment controlled asset, e.g. a reefer
 * container, a reefer truck, a cold storage warehouse, commodity etc.
 */
@Builder
@Getter
public class TemperatureControlProperties {
  // "Discrete temperature value that is used when not setting a minimum and maximum.
  @Min(-462)
  @Max(2000)
  private Integer degrees;
  // The minimum temperature for the cargo, equipment, storage etc. depending on context where the
  // control is used. Legal limit based on absolute zero in Fahrenheit which will mean that Celsius
  // will also validate correctly within bounds
  @Min(-462)
  @Max(2000)
  private Integer degreesMinimum;
  // The maximum temperature for the cargo, equipment, storage etc. depending on context where the
  // control is used. Legal limit based on absolute zero in Fahrenheit which will mean that Celsius
  // will also validate correctly within bounds
  @Min(-462)
  @Max(2000)
  private Integer degreesMaximum;
  // Temperature Unit Enum
  private TemperatureUnitEnum degreesUnit;
  // True if the equipment or storage must be pre-cooled before cargo is loaded, false if pre-cool
  // is not required.
  private Boolean isPreCoolRequired;
  // Setpoints are used to control temperature settings for time periods such that cargo can have
  // continous temperature change if it requires that.
  private List<TemperatureSetPoint> setPoints;
  // The subtype of environment control.
  private EnvironmentControlTypeEnum environmentControlType;
}
