package com.example.temporalproducer.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * An allOf schema for Party that should be used when $ref to the Party.
 * The reason is that Party.json is used in allOf by e.g.
 * AirCarrier and the Party.json therefore cannot be set to additionalProperties=false.
 * This schema provides the disallowance of
 * additional properties so that validation can be done correctly where the entire
 * Party object is needed
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@JsonIgnoreProperties(ignoreUnknown = true)
public class Party {
  private String partyCode;
  private String partyName;
  private String partyMasterRole;
  private List<PostalAddress> postalAddresses;
  private List<String> emailAddresses;
}
