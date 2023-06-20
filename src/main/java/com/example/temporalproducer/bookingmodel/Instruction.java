package com.example.temporalproducer.bookingmodel;

import lombok.Builder;

import java.util.List;

/**
 * Maintains Instruction related information.
 */
@Builder
public class Instruction {

  // Surrogate unique identifier of the data object in the format of UUID.
  private String uniqueIdentifier;
  // Placeholder sub-schema only including foreign key. Can be redefined by inserting full or
  // partial schema.
  private ParentInstruction parentInstruction;
  // A chronological sequence number for the instruction text.
  private Integer sequence;
  // A textual descriptive instruction.
  private String text;
  // Typifies the Instructions. Possible types can include (but not exclusively):
  private InstructionType instructionType;
  // Parties of relevance and that has created the instruction. Use for example PARTY_OF_RELEVANCE
  // and INSTRUCTING_PARTY as party functions.
  private List<PartyAssociation> parties;
}
