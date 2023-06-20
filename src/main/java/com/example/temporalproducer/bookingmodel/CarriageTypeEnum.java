package com.example.temporalproducer.bookingmodel;

import lombok.AllArgsConstructor;

/**
 * Maintains CarriageType related constants.
 */
@AllArgsConstructor
public enum CarriageTypeEnum {
  INLAND_WATER("INLAND_WATER"),
  RAIL("RAIL"),
  ROAD("ROAD");
  private final String carriageType;

  public String getCarriageTypeEnum() {
    return carriageType;
  }
}
