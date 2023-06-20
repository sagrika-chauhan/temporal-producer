package com.example.temporalproducer.bookingmodel;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

/**
 * Maintains NameAliasOwner related information.
 */
@Builder
@Getter
@Setter
public class NameAliasOwner {
  private String partyCode;
  private PartyRoleEnum partyRole;
  private String businessEntityCountryCode;
  private String businessEntityCode;
  private String businessEntityFunction;
}
