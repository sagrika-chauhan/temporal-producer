package com.example.temporalproducer.bookingmodel;

/**
 * Maintains VolumeUnit related constants.
 */
public enum VolumeUnitEnum {
  // Volume Unit Enum
  BARREL("BARREL"),
  CENTILITER("CENTILITER"),
  CUBIC_CENTIMETER("CUBIC_CENTIMETER"),
  CUBIC_FOOT("CUBIC_FOOT"),
  CUBIC_INCH("CUBIC_INCH"),
  CUBIC_METER("CUBIC_METER"),
  CUBIC_MILLIMETER("CUBIC_MILLIMETER"),
  FLUID_OUNCE_UK("FLUID_OUNCE_UK"),
  GALLON("GALLON"),
  GALLON_UK("GALLON_UK"),
  LITER("LITER"),
  DECILITER("DECILITER"),
  MILLILITER("MILLILITER"),
  PINT_UK("PINT_UK"),
  QUART_UK("QUART_UK"),
  QUART_US("QUART_US"),
  CUBIC_DECIMETER("CUBIC_DECIMETER");

  private final String volume;

  VolumeUnitEnum(String value) {
    this.volume = value;
  }

  public String getVolumeUnit() {
    return volume;
  }
}
