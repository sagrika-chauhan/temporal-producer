package com.example.temporalproducer.bookingmodel;

import jakarta.validation.constraints.Min;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * An allOf schema for Party that should be used when $ref to the Party.
 * The reason is that Party.json is used in allOf by e.g. AirCarrier and the Party.json
 * Therefore cannot be set to additionalProperties=false.
 * This schema provides the disallowance of additional properties so
 * that validation can be done correctly where the entire Party object is needed.
 */
@Builder
@Getter
@Setter
public class Party {

  /*"Unique identification of a party, e.g. full BE code for a Carrier, Shipper or Consignee."*/
  private String partyCode;
  /*"Name of the party. Examples: Nike Inc., Primark or Walmart",*/
  private String partyName;

  /* All the party roles that the party is acting in.
  E.g. a Party can be a Supplier, Broker, Agent and Carrier.*/
  private PartyRoleEnum partyRoles;
  /*"All postal addressed associated with the party",*/
  @Min(1)
  private List<TelecommunicationsNumber> telecommunicationsNumbers;

  @Min(1)
  private List<String> emailAddresses;

  private List<String> webPageAddresses;

  private List<PartyRoleRelationships> partyRoleRelationships;

  private List<AlternativeCodes> alternativeCodes;
  private List<NameAliases> nameAliases;

  private String partyAbbreviatedName;

  private String businessEntityCountryCode;

  private String businessEntityCode;

  private String businessEntityFunction;

  private PartyRoleEnum partyMasterRole;
  private Language language;
  private String status;
  private List<SalesAccounts> salesAccounts;
}
