package com.example.temporalproducer.bookingmodel;

import lombok.Builder;

/**
 * Placeholder sub-schema only including foreign key. Can be redefined by inserting full or partial
 * schema.
 */
@Builder
public class ParentInstructionType {
  // A unique, short code for the instruction type, e.g. CAHA for Cargo Handling
  private String instructionTypeCode;
}
