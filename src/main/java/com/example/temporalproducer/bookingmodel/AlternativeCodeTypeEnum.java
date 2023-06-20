package com.example.temporalproducer.bookingmodel;

/**
 * Maintains AlternativeCodes related constants.
 */
public enum AlternativeCodeTypeEnum {
  SCV_ORGANISATION_NUMBER("SCV_ORGANISATION_NUMBER");
  private final String alternativeCodeTypeValue;

  AlternativeCodeTypeEnum(String value) {
    this.alternativeCodeTypeValue = value;
  }

  public String getAlternativeCodeTypeValue() {
    return alternativeCodeTypeValue;
  }
}
