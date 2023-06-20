package com.example.temporalproducer.model.enums;

import lombok.AllArgsConstructor;

/**
 * Defines what is the range of the service covered by a transport/ logistics provider, from an
 * end-to-end journey perspective, both at origin and destination. E.g. LCL, FCL, LTL etc.",
 */
@AllArgsConstructor
public enum CargoServiceTypeEnum {
  FCL("FCL"),
  LCL("LCL"),
  FTL("FTL"),
  LTL("LTL"),
  CC("CC"),
  BB("BB");
  private final String cargoServiceTypeEnumValue;

  public String getCargoServiceTypeEnumValue() {
    return cargoServiceTypeEnumValue;
  }
}
