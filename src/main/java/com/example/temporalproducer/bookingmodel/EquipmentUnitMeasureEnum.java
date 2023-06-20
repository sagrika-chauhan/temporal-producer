package com.example.temporalproducer.bookingmodel;

/**
 * Maintains EquipmentUnitMeasure related constants.
 */
public enum EquipmentUnitMeasureEnum {
  TWENTY_FOOT_EQUIVALENT_UNIT("TWENTY_FOOT_EQUIVALENT_UNIT"),
  FORTY_FOOT_EQUIVALENT_UNIT("FORTY_FOOT_EQUIVALENT_UNIT");

  private final String equipmentUnit;

  EquipmentUnitMeasureEnum(String value) {
    this.equipmentUnit = value;
  }

  public String getVolumeUnit() {
    return equipmentUnit;
  }
}
