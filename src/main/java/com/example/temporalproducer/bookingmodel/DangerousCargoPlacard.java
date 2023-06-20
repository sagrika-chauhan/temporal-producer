package com.example.temporalproducer.bookingmodel;

import lombok.Builder;

/**
 * The HazMat Placard (also known as "diamond" in the industry) is a diamond shaped pictogram
 * placard that must be affixed on either a Cargo Package, Equipment or Vehicle, in order to
 * identify visually the specific dangers that the cargo being transported poses, and/or the correct
 * ways to handle it and correct regulation that applies.
 */
@Builder
public class DangerousCargoPlacard {
  // Code for the transport mode, e.g. MARI
  private String transportModeCode;
  // ISO 2 country code, e.g. US
  private String iso2CountryCode;
  // The Hazardous Material Classification (also known as HazMat) classifies Dangerous Cargo
  // commodities in specific groups, according to the specific hazard or danger that they pose. This
  // classification is used then to generate proper Dangerous Cargo Placards (also known as
  // "Diamonds") that are used to label cargo, containers/equipment or vehicles, and derive the
  // proper Dangerous Cargo handling and regulations. This classification is also the base used by
  // the different classifications used around the world, and/or maintained by specific transport
  // mode regulating authorities, such as IMDG (IMO) for Ocean, or IATA for Air.
  private HazMatClass hazMatClass;
  // Hazard Zone enum
  private HazardZoneEnum hazardZone;
  // PackingGroup enum
  private PackingGroupEnum packingGroup;
  // A code for the hazardous property, e.g. T for Toxic
  private String classificationCode;
}
