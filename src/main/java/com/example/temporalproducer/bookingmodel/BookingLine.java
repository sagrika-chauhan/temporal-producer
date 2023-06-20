package com.example.temporalproducer.bookingmodel;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

/**
 * An allOf schema for Booking Line that should be used when $ref to the Booking Line. The reason is
 * that BookingLine.json is used in allOf by e.g. Shipper Booking Line and the BookingLine.json
 * therefore cannot be set to additionalProperties=false. Therefore this base schema will provide
 * the disallowance of additional properties so that validation can be done correctly where the
 * entire Event object is needed."
 */
@Builder
@Getter
@Setter
public class BookingLine {
  // unique identifier
  private Integer sequence;
  // Booking Line Base
  private BookingLineBase bookingLineBase;
}
