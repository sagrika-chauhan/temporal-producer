package com.example.temporalproducer.bookingmodel;

import lombok.Builder;
import lombok.Getter;

/**
 * "The summarized shipping window based on line level details.\n\nExamples: Latest ship date,
 * expected ship date,estimated delivery date, actual delivery date, expected client delivery date,
 * expected delivery date".
 */
@Getter
@Builder
public final class ShippingWindow {

  // Shipping window timestamp, e.g. 2019-12-12 with an event timing of Planned and event trigger
  // of Earliest Receipt of Cargo
  private final String timestamp;
  // A name for the timing
  private final EventTimingEnum eventTimingEnum;
  private final EventTriggerEnum eventTriggerEnum;
}
