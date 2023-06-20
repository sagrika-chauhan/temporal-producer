package com.example.temporalproducer.model.enums;

import com.fasterxml.jackson.annotation.JsonRootName;
import lombok.AllArgsConstructor;
/** "EquipmentHeightCode enum." */

@AllArgsConstructor
@JsonRootName(value = "EquipmentHeightCode")

public enum EquipmentHeightCodeEnum {
  FOUR_THREE("43"),
  EIGHT_SIX("86"),
  NINE_SIX("96"),
  ZERO_ONE("01"),
  ZERO_FOUR("04");
  private final String equipmentHeightCodeEnumValue;

  public String getEquipmentHeightCodeEnumValue() {
    return equipmentHeightCodeEnumValue;
  }
}
