package com.example.temporalproducer.bookingmodel;

import lombok.AllArgsConstructor;

/** Trigger enum for the event, e.g. GATE_IN, LOADED_ON_VESSEL etc. */
@AllArgsConstructor
public enum EventTriggerEnum {
  GATE_IN("GATE_IN"),
  LOADED_ON_VESSEL("LOADED_ON_VESSEL");

  private final String eventTrigger;

  public String getEventTriggerEnum() {
    return eventTrigger;
  }
}
