package com.example.temporalproducer.bookingmodel;

/**
 * Maintains DangerousCargoInformationType related constants.
 */
public enum DangerousCargoInformationTypeEnum {
  PRODUCT_DANGEROUS_CARGO_INFORMATION("PRODUCT_DANGEROUS_CARGO_INFORMATION"),
  TRANSPORT_DANGEROUS_CARGO_INFORMATION("TRANSPORT_DANGEROUS_CARGO_INFORMATION");
  private final String dangerousCargoInformation;

  DangerousCargoInformationTypeEnum(String value) {
    this.dangerousCargoInformation = value;
  }

  public String getDangerousCargoInformationType() {
    return dangerousCargoInformation;
  }
}
