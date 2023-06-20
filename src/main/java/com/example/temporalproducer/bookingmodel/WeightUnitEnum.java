package com.example.temporalproducer.bookingmodel;

/**
 * Maintains WeightUnit related constants.
 */
public enum WeightUnitEnum {
  KILOGRAM("KILOGRAM"),
  GRAM("GRAM"),
  MILLIGRAM("MILLIGRAM"),
  POUND("POUND"),
  OUNCE("OUNCE"),
  TON_US("TON_US"),
  TON_UK("TON_UK"),
  TON_METRIC("TON_METRIC"),
  STONE("STONE"),
  TROY_OUNCE("TROY_OUNCE");

  private final String weight;

  WeightUnitEnum(String value) {
    this.weight = value;
  }

  public String getWeightUnit() {
    return weight;
  }
}
