package com.example.temporalproducer.bookingmodel;

/**
 * Maintains DimensionUnit related constants.
 */
public enum DimensionUnitEnum {
  // Dimension Unit Enum
  CENTIMETER("CENTIMETER"),
  DECIMETER("DECIMETER"),
  FOOT("FOOT"),
  INCH("INCH"),
  METER("METER"),
  MILLIMETER("MILLIMETER"),
  YARD("YARD"),
  KILOMETER("KILOMETER");
  private final String dimension;

  DimensionUnitEnum(String value) {
    this.dimension = value;
  }

  public String getDimensionUnit() {
    return dimension;
  }
}
