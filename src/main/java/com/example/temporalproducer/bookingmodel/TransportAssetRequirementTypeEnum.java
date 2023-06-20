package com.example.temporalproducer.bookingmodel;

/** Refers to the different type of asset requirement, e.g. Equipment or Vehicle. */
public enum TransportAssetRequirementTypeEnum {
  // The type of asset requirement, e.g. Equipment or Vehicle.
  EQUIPMENT_REQUIREMENT("EQUIPMENT_REQUIREMENT"),
  VEHICLE_REQUIREMENT("VEHICLE_REQUIREMENT");
  private final String transportAssetRequirementType;

  TransportAssetRequirementTypeEnum(String value) {
    this.transportAssetRequirementType = value;
  }

  public String getTransportAssetRequirementType() {
    return transportAssetRequirementType;
  }
}
