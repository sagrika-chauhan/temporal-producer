package com.example.temporalproducer.model.enums;

import lombok.AllArgsConstructor;

/**
 * " A Charge can be classified as either a Tariff Rate, Contract Rate, Market Rate or Surcharge."
 */
@AllArgsConstructor
public enum ChargeClassificationEnum {
  MARKET_RATE("MARKET_RATE"),
  TARIFF_RATE("TARIFF_RATE"),
  SURCHARGE("SURCHARGE"),
  CONTRACT_RATE("CONTRACT_RATE");
  private String chargeClassificationEnumValue;

  public String chargeClassificationEnumValue() {
    return chargeClassificationEnumValue;
  }
}
