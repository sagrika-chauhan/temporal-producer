package com.example.temporalproducer.bookingmodel;

import lombok.AllArgsConstructor;

/** An enum value for the location function e.g. PORT_OF_DISCHARGE Pattern : ^[A-Z0-9_]+$. */
@AllArgsConstructor
public enum LocationFunctionEnum {
  PORT_OF_DISCHARGE("PORT_OF_DISCHARGE");
  private final String locationFunction;

  public String getLocationFunctionEnum() {
    return locationFunction;
  }
}
