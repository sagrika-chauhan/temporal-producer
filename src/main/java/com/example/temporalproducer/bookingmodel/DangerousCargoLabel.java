package com.example.temporalproducer.bookingmodel;

import lombok.Builder;

/**
 * Additionally to the HazMat Placard (see generalization class), some additional labels might be
 * required to be affixed together with the Placard.
 */
@Builder
public class DangerousCargoLabel {
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
  private HazMatClass hazMatClassification;
  // Hazard Zone enum
  private HazardZoneEnum hazardZone;
  // PackingGroup enum
  private PackingGroupEnum packingGroup;
  // A code for the hazardous property, e.g. T for Toxic
  private String classificationCode;
  // There are many different required label types, depending on commodity (UNDG Number), and
  // therefore a Label Type Code will be necessary to specify each label type.
  private DangerousCargoLabelType dangerousCargoLabelType;
}
