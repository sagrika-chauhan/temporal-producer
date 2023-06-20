package com.example.temporalproducer.model.enums;

import com.fasterxml.jackson.annotation.JsonRootName;
import lombok.AllArgsConstructor;

/** + Trigger enum for the event, e.g. PORT_GATE_IN, LOADED_ON_VESSEL etc. */
@AllArgsConstructor
@JsonRootName(value = "EventTrigger")

public enum EventTriggerEnum {
  EMPTY_DISPATCH("EMPTY_DISPATCH"),
  CARGO_LOAD_START("CARGO_LOAD_START"),
  CARGO_LOAD_END("CARGO_LOAD_END"),
  CARGO_LOAD("CARGO_LOAD"),
  PORT_GATE_IN("PORT_GATE_IN"),
  PORT_GATE_OUT("PORT_GATE_OUT"),
  CARGO_UNLOAD_START("CARGO_UNLOAD_START"),
  CARGO_UNLOAD_END("CARGO_UNLOAD_END"),
  CARGO_UNLOAD("CARGO_UNLOAD"),
  EMPTY_RETURN("EMPTY_RETURN");

  private final String eventTriggerEnumValue;

  public String getEventTriggerEnumValue() {
    return eventTriggerEnumValue;
  }
}
