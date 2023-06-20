package com.example.temporalproducer.model.enums;

/** "Charge type enum." */
public enum ChargeTypeEnum {
  BASIC_OCEAN_FREIGHT("BASIC_OCEAN_FREIGHT"),
  ADDITIONAL_TONNAGE_CHARGE("ADDITIONAL_TONNAGE_CHARGE"),
  CONTAINER_CLEANING_EXPORT("CONTAINER_CLEANING_EXPORT"),
  CUSTOMS_CLEARANCE_ORIGIN("CUSTOMS_CLEARANCE_ORIGIN"),
  CONTAINER_NOMINATION_SERVICE("CONTAINER_NOMINATION_SERVICE"),
  EQUIPMENT_MANAGEMENT_IMPORT("EQUIPMENT_MANAGEMENT_IMPORT"),
  PRICING_FOR_CUSTOMER("PRICING_FOR_CUSTOMER"),
  VALUE_ADDED_SERVICE("VALUE_ADDED_SERVICE");
  private final String chargeTypeEnumValue;

  ChargeTypeEnum(String chargeTypeEnum) {
    this.chargeTypeEnumValue = chargeTypeEnum;
  }

  public String getChargeTypeEnumValue() {
    return chargeTypeEnumValue;
  }
}
