package com.example.temporalproducer.bookingmodel;

import lombok.Builder;

/**
 * Placeholder sub-schema only including foreign key. Can be redefined by inserting full or partial
 * schema.
 */
@Builder
public class ParentInstruction {
  // Surrogate unique identifier of the data object in the format of UUID.
  private String uniqueIdentifier;
}
