package com.example.temporalproducer.model.enums;

import com.fasterxml.jackson.annotation.JsonRootName;
import lombok.AllArgsConstructor;

/** + Timing enum for the event, e.g. PLANNED or ACTUAL */
@AllArgsConstructor
@JsonRootName(value = "EventTiming")
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
  private final String eventTimingEnumValue;

  public String getEventTimingEnumValue() {
    return eventTimingEnumValue;
  }
}
