package com.example.temporalproducer.bookingmodel;

import lombok.AllArgsConstructor;

/** Timing enum for the event, e.g. PLANNED or ACTUAL. */
@AllArgsConstructor
public enum EventTimingEnum {
  EXPECTED("EXPECTED"),
  ESTIMATED("ESTIMATED"),
  EARLIEST("EARLIEST"),
  LATEST("LATEST"),
  PLANNED("PLANNED"),
  UNPLANNED("UNPLANNED"),
  ACTUAL("ACTUAL"),
  PREDICTED("PREDICTED"),
  DUE("DUE");

  private final String eventTiming;

  public String getEventTimingEnum() {
    return eventTiming;
  }
}
