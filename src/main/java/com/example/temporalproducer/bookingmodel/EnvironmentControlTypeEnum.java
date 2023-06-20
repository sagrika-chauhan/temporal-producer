package com.example.temporalproducer.bookingmodel;

/**
 * Maintains EnvironmentControlType related constants.
 */
public enum EnvironmentControlTypeEnum {
  TEMPERATURE("TEMPERATURE"),
  HUMIDITY("HUMIDITY"),
  VENTILATION("VENTILATION"),
  ATMOSPHERE("ATMOSPHERE");
  private final String environmentControl;

  EnvironmentControlTypeEnum(String value) {
    this.environmentControl = value;
  }

  public String getEnvironmentControlType() {
    return environmentControl;
  }
}
