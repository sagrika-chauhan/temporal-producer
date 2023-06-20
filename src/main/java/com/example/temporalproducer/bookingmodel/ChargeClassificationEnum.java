package com.example.temporalproducer.bookingmodel;

import lombok.AllArgsConstructor;

/**
 * Maintains ChargeClassification related constants.
 */
@AllArgsConstructor
public enum ChargeClassificationEnum {
  MARKET_RATE("MARKET_RATE"),
  TARIFF_RATE("TARIFF_RATE"),
  SURCHARGE("SURCHARGE"),
  CONTRACT_RATE("CONTRACT_RATE");
  private String chargeEnum;

  public String getChargeClassificationEnum() {
    return chargeEnum;
  }
}
