package com.example.temporalproducer.bookingmodel;

/** This indicates the PartyRole, e.g. NOTIFY_PARTY. */
public enum PartyRoleEnum {
  NOTIFY_PARTY("NOTIFY_PARTY"),
  SHIPPER("SHIPPER"),
  CUSTOMER("CUSTOMER"),
  CARRIER("CARRIER"),
  OCEAN_CARRIER("OCEAN_CARRIER");

  private final String partyRoleValue;

  PartyRoleEnum(String value) {
    this.partyRoleValue = value;
  }

  public String getPartyRoleValue() {
    return partyRoleValue;
  }
}
