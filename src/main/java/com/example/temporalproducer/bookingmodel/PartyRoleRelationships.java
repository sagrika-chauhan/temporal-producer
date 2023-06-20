package com.example.temporalproducer.bookingmodel;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * Maintains PartyRoleRelationships related information.
 */
@Builder
@Getter
@Setter
public class PartyRoleRelationships {

  private PartyRoleRelationshipTypeEnum partyRoleRelationshipType;
  private String partyCodeParent;

  private PartyRoleEnum partyRoleParent;

  private String partyCodeChild;
  private PartyRoleEnum partyRoleChild;

  private String partyRoleChildNameAlias;

  private List<Segments> segments;
}
