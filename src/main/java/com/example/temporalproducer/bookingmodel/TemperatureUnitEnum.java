package com.example.temporalproducer.bookingmodel;

/**
 * Maintains TemperatureUnit related constants.
 */
public enum TemperatureUnitEnum {
  CELCIUS("CELCIUS"),
  FAHRENHEIT("FAHRENHEIT"),
  KELVIN("KELVIN");

  private final String temperatureUnit;

  TemperatureUnitEnum(String value) {
    this.temperatureUnit = value;
  }

  public String getTemperatureUnit() {
    return temperatureUnit;
  }
}
