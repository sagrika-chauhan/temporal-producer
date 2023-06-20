package com.example.temporalproducer.bookingmodel;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NonNull;

/** A date-time with timing set to "EXPECTED" and "REQUIRED_PICK_UP. */
@Builder
@Getter
@AllArgsConstructor
public final class ServiceDate {

  // The timestamp of the service date event
  @NonNull private final String timeStamp;
  @NonNull private final EventTimingEnum eventTiming;
  @NonNull private final EventTriggerEnum eventTrigger;
}
