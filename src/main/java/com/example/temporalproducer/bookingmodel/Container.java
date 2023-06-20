package com.example.temporalproducer.bookingmodel;

import lombok.Builder;

/**
 * Placeholder sub-schema only including foreign key.
 * Can be redefined by inserting full or partial schema.
 */
@Builder
public class Container {
  // ISO6346 combined owner, category, serial number and check digit
  private String isoCombinedCode;
}
