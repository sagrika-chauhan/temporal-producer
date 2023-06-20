package com.example.temporalproducer.model;

/** Rate basis enum, e.g. CONTAINER or WEIGHT */

public enum RateBasisEnum {

  CONTAINER("CONTAINER"),
  LITRE("LITRE"),
  PER_ENTRY("PER ENTRY"),
  VOLUME("VOLUME"),
  NUMBER_OF_HOURS("NUMBER OF HOURS"),
  NUMBER_OF_DAYS("NUMBER OF DAYS"),
  PER_DOCUMENT("PER DOCUMENT"),
  TRUCK("TRUCK"),
  KILOGRAM("KILOGRAM"),
  UNIT("UNIT");

  private final String rateBasisEnumValue;

  RateBasisEnum(String rateBasisEnumValue) {
    this.rateBasisEnumValue = rateBasisEnumValue;
  }

  public String getRateBasisEnumValue() {
    return rateBasisEnumValue;
  }
}
