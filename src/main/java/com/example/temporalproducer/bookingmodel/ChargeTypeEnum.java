package com.example.temporalproducer.bookingmodel;

import lombok.AllArgsConstructor;

/**
 * Maintains ChargesType related constants.
 */
@AllArgsConstructor
public enum ChargeTypeEnum {
  BASIS_OCEAN_FRIEGHT("BASIC_OCEAN_FREIGHT"),
  ADDITIONAL_TONNAGE_CHARGE("ADDITIONAL_TONNAGE_CHARGE"),
  CONTAINER_CLEANING_EXPORT("CONTAINER_CLEANING_EXPORT"),
  CUSTOMES_CLEARANCE_ORIGIN("CUSTOMS_CLEARANCE_ORIGIN"),
  CONTAINER_NOMINATION_SERVICE("CONTAINER_NOMINATION_SERVICE"),
  EQUIPMENT_MANAGEMENT_IMPORT("EQUIPMENT_MANAGEMENT_IMPORT"),
  VALUE_ADDED_SERVICE("VALUE_ADDED_SERVICE");
  private final String chargeEnum;

  public String getChargeTypeEnum() {
    return chargeEnum;
  }
}
