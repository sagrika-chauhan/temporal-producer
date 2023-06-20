package com.example.temporalproducer.bookingmodel;

import lombok.AllArgsConstructor;

/**
 * Maintains Charges related constants.
 */
@AllArgsConstructor
public enum ChargeEnum {
  ORIGIN("ORIGIN"),
  FREIGHT("FREIGHT"),
  DESTINATION("DESTINATION");
  private String chargeApplicationEnum;

  public String getChargeApplicationEnum() {
    return chargeApplicationEnum;
  }
}
