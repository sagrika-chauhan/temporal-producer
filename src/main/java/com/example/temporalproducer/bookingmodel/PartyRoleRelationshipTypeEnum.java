package com.example.temporalproducer.bookingmodel;

/**
 * Maintains PartyRoleRelationshipType related constants.
 */
public enum PartyRoleRelationshipTypeEnum {
  DEFAULT("DEFAULT"),
  PART_OF_ORGANIZATION("PART_OF_ORGANIZATION"),
  CUSTOMER_TO_CARRIER("CUSTOMER_TO_CARRIER"),
  CONSIGNEE_TO_SHIPPER("CONSIGNEE_TO_SHIPPER");

  private final String partyRoleRelationshipTypeValue;

  PartyRoleRelationshipTypeEnum(String value) {
    this.partyRoleRelationshipTypeValue = value;
  }

  public String getPartyRoleRelationshipTypeValue() {
    return partyRoleRelationshipTypeValue;
  }
}
