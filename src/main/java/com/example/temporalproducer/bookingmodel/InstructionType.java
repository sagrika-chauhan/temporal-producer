package com.example.temporalproducer.bookingmodel;

import lombok.Builder;

/**
 * Typifies the Instructions. Possible types can include (but not exclusively):
 *
 * <p>- Inland/ haulage instructions - DC handling - Cargo handling - Dangerous Cargo handling -
 * instructions for drivers - etc.
 *
 * <p>Instruction types can also have subtypes.
 *
 * <p>Instruction types can also correspond to standard UN instruction types, typically used in
 * EDIFACT.
 */
@Builder
public class InstructionType {
  // A unique, short code for the instruction type, e.g. CAHA for Cargo Handling
  private String instructionTypeCode;
  // Placeholder sub-schema only including foreign key. Can be redefined by inserting full or
  // partial schema.
  private ParentInstructionType parentInstructionType;
  // A spelled out human-readable name for the instruction type, e.g. Cargo Handling
  private String instructionTypeName;
  // A longer descriptive text about the instruction type.
  private String instructionTypeDescription;
  // Placeholder sub-schema only including foreign key. Can be redefined by inserting full or
  // partial schema.
  private UnTextQualifier unTextQualifier;
}
