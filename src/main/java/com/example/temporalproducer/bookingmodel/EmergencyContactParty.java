package com.example.temporalproducer.bookingmodel;

import lombok.Builder;

/**
 * Placeholder sub-schema only including foreign key. Can be redefined in an extension schema to
 * refer to full schema.
 */
@Builder
public class EmergencyContactParty {
  // Unique identification of a party, e.g. full BE code for a Carrier, Shipper or Consignee.
  private String partyCode;
}
