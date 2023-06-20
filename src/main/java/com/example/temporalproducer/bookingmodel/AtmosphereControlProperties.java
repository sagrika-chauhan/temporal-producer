package com.example.temporalproducer.bookingmodel;

import jakarta.validation.constraints.Min;
import lombok.Builder;

/**
 * Maintains AtmosphereControl related information.
 */
@Builder
public class AtmosphereControlProperties {
  // Discrete CO2 percentage that is used when not setting a minimum and maximum.
  @Min(0)
  @Min(100)
  private Integer cooPercentage;
  // Minimum percentage of CO2 (Carbondioxide)
  @Min(0)
  @Min(100)
  private Integer cooPercentageMinimum;
  // Maximum percentage of CO2 (Carbondioxide)
  @Min(0)
  @Min(100)
  private Integer cooPercentageMaximum;
  // Discrete O2 percentage that is used when not setting a minimum and maximum.
  @Min(0)
  @Min(100)
  private Integer ooPercentage;
  // Minimum percentage of O2 (Oxygen)
  @Min(0)
  @Min(100)
  private Integer ooPercentageMinimum;
  // Maximum percentage of O2 (Oxygen)
  @Min(0)
  @Min(100)
  private Integer ooPercentageMaximum;
  // Discrete N2 percentage that is used when not setting a minimum and maximum.
  @Min(0)
  @Min(100)
  private Integer nnPercentage;
  // Minimum percentage of N2 (Nitrogen)
  @Min(0)
  @Min(100)
  private Integer nnPercentageMinimum;
  // Maximum percentage of N2 (Nitrogen)
  @Min(0)
  @Min(100)
  private Integer nnPercentageMaximum;

  private EnvironmentControlTypeEnum environmentControlType;
}
