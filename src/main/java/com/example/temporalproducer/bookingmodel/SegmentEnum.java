package com.example.temporalproducer.bookingmodel;

/**
 * Maintains Segment related constants.
 */
public enum SegmentEnum {
  INDUSTRY("INDUSTRY");

  private final String segmentValue;

  SegmentEnum(String value) {
    this.segmentValue = value;
  }

  public String getSegmentValue() {
    return segmentValue;
  }
}
