package com.example.temporalproducer.model.enums;

import com.fasterxml.jackson.annotation.JsonRootName;

/** "ExpectedNetWeightUnit enum." */
@JsonRootName(value = "ExpectedNetWeightUnit")

public enum ExpectedNetWeightUnitEnum {
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
  private final String expectedNetWeightUnitEnumValue;

  ExpectedNetWeightUnitEnum(String expectedNetWeightUnitEnumValue) {
    this.expectedNetWeightUnitEnumValue = expectedNetWeightUnitEnumValue;
  }

  public String getExpectedNetWeightUnitEnumValue() {
    return expectedNetWeightUnitEnumValue;
  }
}
