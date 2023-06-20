package com.example.temporalproducer.bookingmodel;

import lombok.Builder;

/**
 * Party Association properties - Placeholder sub-schema only including foreign key. Can be
 * redefined in an extension schema to refer to full schema.
 */
@Builder
public class PartyAssociation {
  // Enum value for a role of a Party, for example NOTIFY_PARTY, SHIPPER, CUSTOMER, CARRIER etc.
  private String partyFunction;

  private Party party;
}
