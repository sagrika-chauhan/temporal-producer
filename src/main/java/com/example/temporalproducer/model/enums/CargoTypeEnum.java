package com.example.temporalproducer.model.enums;

/** "Cargo type enum. " */
public enum CargoTypeEnum {
  DRY("DRY"),
  LIVE_REEFER("LIVE_REEFER"),
  DANGEROUS("DANGEROUS"),
  OUT_OF_GAUGE("OUT_OF_GAUGE"),
  BREAK_BULK("BREAK_BULK"),
  NORMAL("NORMAL"),
  FLAT_PACK("FLAT_PACK"),
  MIXED("MIXED"),
  GARMENT_ON_HANGERS("GARMENT_ON_HANGERS"),
  HANGER_ON_FLATPACK("HANGER_ON_FLATPACK"),
  REEFER("REEFER"),
  STANDARD("STANDARD"),
  SPECIAL("SPECIAL");
  private final String cargoTypeEnumValue;

  CargoTypeEnum(String value) {
    this.cargoTypeEnumValue = value;
  }

  public String getCargoTypeEnumValue() {
    return cargoTypeEnumValue;
  }
}
