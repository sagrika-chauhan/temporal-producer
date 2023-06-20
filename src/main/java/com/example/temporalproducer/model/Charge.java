package com.example.temporalproducer.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * A monetary amount due for payment of a specific good or service. A charge can be attached to an
 * invoice, transport document, agreement line, etc., which means it can represent an actual due
 * payment, or a description of an agreed one. For this reason of multiple business uses of Charge,
 * many of the relationships carry a cardinality where 0 is possible.
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@JsonIgnoreProperties(ignoreUnknown = true)
public class Charge {

  private UnitPrice unitPrice;

  private Amount amount;

  // Basic Ocean Freight- Additional Tonnage Charge- Container Cleaning Export - Customs Clearance
  // Origin - Container Nomination Service - Equipment Management Import - Value Added Service -
  // Optional charges are called Value Added Services.
  private ChargeType chargeType;
  // Rate Basis is used for charge calculations and price setting. They are defined as a base of
  // something relevant to the shipment, e.g.: Container, Transport Document, Weight, Time Period
  // etc.
  // A unit of measurement can be set to define specific rate bases such as: Weight rate basis for
  // Kilogram, Container rate basis for Twenty Foot Equivalent or Time Period rate basis for Weeks
  private RateBasis rateBasis;
  // Unique identification of a party, e.g. full BE code for a Carrier, Shipper or Consignee.
  private List<PartyAssociation> partyAssociation;
  private List<Reference> references;

}
