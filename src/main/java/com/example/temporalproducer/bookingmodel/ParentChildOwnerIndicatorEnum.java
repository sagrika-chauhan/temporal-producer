package com.example.temporalproducer.bookingmodel;

/**
 * Maintains ParentChildOwnerIndicator related constants.
 */
public enum ParentChildOwnerIndicatorEnum {
  PARENT("PARENT"),
  CHILD("CHILD");
  private final String parentChildOwnerIndicatorValue;

  ParentChildOwnerIndicatorEnum(String value) {
    this.parentChildOwnerIndicatorValue = value;
  }

  public String getParentChildOwnerIndicatorValue() {
    return parentChildOwnerIndicatorValue;
  }
}
