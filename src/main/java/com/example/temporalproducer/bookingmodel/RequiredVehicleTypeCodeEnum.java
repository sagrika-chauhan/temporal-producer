package com.example.temporalproducer.bookingmodel;

/**
 * Maintains RequiredVehicleType related constants.
 */
public enum RequiredVehicleTypeCodeEnum {
  // Vehicle type enum, e.g. BARGE, TRUCK or RAIL
  TRAIN("TRAIN"),
  TRUCK("TRUCK"),
  BARGE("BARGE"),
  VESSEL("VESSEL"),
  TRAILER("TRAILER"),
  AIRCRAFT("AIRCRAFT");
  private final String requiredVehicleType;

  RequiredVehicleTypeCodeEnum(String value) {
    this.requiredVehicleType = value;
  }

  public String getTransportAssetRequirementType() {
    return requiredVehicleType;
  }
}
