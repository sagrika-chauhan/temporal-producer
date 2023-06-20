package com.example.temporalproducer.bookingmodel;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

/**
 * Maintains Charge related information.
 */
@Builder
@Getter
@AllArgsConstructor
public class Charge {
  private Amount amount;
  // An exchange rate is given for conversion from a unit currency to a quotation currency
  private ExchangeRate exchangeRate;
  // Rate Basis is used for charge calculations and price setting. They are defined as a base of
  // something relevant to the shipment, e.g.: Container, Transport Document, Weight, Time Period
  // etc.
  // A unit of measurement can be set to define specific rate bases such as: Weight rate basis for
  // Kilogram, Container rate basis for Twenty Foot Equivalent or Time Period rate basis for Weeks
  private RateBasis rateBasis;
  // Basic Ocean Freight- Additional Tonnage Charge- Container Cleaning Export - Customs Clearance
  // Origin - Container Nomination Service - Equipment Management Import - Value Added Service -
  // Optional charges are called Value Added Services.
  private ChargeType chargeType;
  // A Charge can be classified as either a Tariff Rate, Contract Rate, Market Rate or Surcharge.
  // Particularly when Charge is used for quotations and contracts.
  // Market Rate: a fair market price for a service from one area to another,it is generally the
  // same as ocean freight rate but can be set to include other. The fair market price for our
  // service of moving cargo from one port to another port for from inland locations.  This is based
  // upon Commodity, Container Size,  Container Type, Place of Receipt of Cargo,  Place of delivery
  // of Cargo and Customer and timeframe.\n- Tariff Rate: an Ocean Freight price element The price
  // of the basic ocean freight, i.e. from one base port to another base port.  Sometimes known as
  // the Base Rate tariff. The highest rate from one point to another point for a specific
  // commodity. This is utilized on Maersk Line dot Com and for publishing to govermnetal agencies
  // where required.\n- Surcharge: additional charges added to the price of shipping goods from one
  // place to another,  these typicall are for extra - services,  or to cover variable costs of the
  // shipping line like e.g. the additional price the customer would like pay so he can arrive later
  // at the gate of the Terminal instead of the normal deadline
  private ChargeClassificationEnum chargeClassification;
  // Unique identification of a party, e.g. full BE code for a Carrier, Shipper or Consignee.
  private Payer payer;
  // Defines where the charge is happening, in terms of the moment of the shipment, i.e. if the
  // charge happens at origin, destination, or during freight (main transport).
  // It should *not* be confused with where the charge is paid or who pays it, as that should be
  // defined in the Freight Term (i.e. if it's Collect or Prepaid).So, for instance,
  // a charge for customs clearance at origin (Charge Applicaltion = Origin) can actually be paid at
  // destination (Freight Term = Collect)
  private ChargeEnum chargeApplication;
}
