package com.example.temporalproducer.model.enums;

/** Standard Reason enum, e.g. AMEND_REASON */
public enum StandardReasonEnum {
  AMEND_REASON("AMEND_REASON"),
  AMEND_CANCEL_REASON("AMEND_CANCEL_REASON"),
  CANCEL_REASON("CANCEL_REASON");
  private final String standardReasonEnumValue;

  StandardReasonEnum(String standardReasonEnumValue) {
    this.standardReasonEnumValue = standardReasonEnumValue;
  }

  public String getStandardReasonEnumValue() {
    return standardReasonEnumValue;
  }
}
