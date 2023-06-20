package com.example.temporalproducer.bookingmodel;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

/**
 * Maintains RequiredTransportProvider related information.
 */
@Builder
@Getter
@Setter
public class RequiredTransportProvider {

  private Integer sequence;
  private String partyFunction;
  private String businessPartnerSuppliedName;
  private String businessPartnerSuppliedCode;
  private boolean isPartyEditAllowed;

  private Party party;
}
