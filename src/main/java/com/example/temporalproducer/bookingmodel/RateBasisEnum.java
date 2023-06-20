package com.example.temporalproducer.bookingmodel;

import lombok.AllArgsConstructor;

/**
 * Maintains RateBasis related constants.
 */
@AllArgsConstructor
public enum RateBasisEnum {
  CONTAINER("CONTAINER"),
  PERCENTAGE_OF_OTHER_RATE("PERCENTAGE_OF_OTHER_RATE"),
  VOLUME("VOLUME"),
  TRANSPORT_DOCUMENT("TRANSPORT_DOCUMENT"),
  CHASSIS("CHASSIS"),
  UNIT_LOAD_DEVICE("UNIT_LOAD_DEVICE"),
  CARGO_ITEM("CARGO_ITEM"),
  CARGO_PACKAGE("CARGO_PACKAGE"),
  WEIGHT("WEIGHT"),
  BEST_OF_WEIGHT_OR_VOLUME("BEST_OF_WEIGHT_OR_VOLUME"),
  TIME_PERIOD("TIME_PERIOD");
  private final String rateBasEnum;

  public String getRateBasisEnum() {
    return rateBasEnum;
  }
}
