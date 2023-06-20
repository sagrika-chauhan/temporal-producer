package com.example.temporalproducer.bookingmodel;

import lombok.Builder;

/**
 * A specific subtype of labels are the Dangerous Cargo Plates. Typically the plates are an orange
 * square or rectangle, divided in 2 smaller horizontal rectangles by a black line divider:
 *
 * <p>- The top rectangle is called the "Upper Part" of the Plate and typically carries a code that
 * is specific to the local convention (ADR, HAZCHEM, etc.) and has a specific meaning within such
 * convention.
 *
 * <p>- The bottom rectangle is called the "Lower Part" of the Plate and typically carries the UNDG
 * Number.
 */
@Builder
public class DangerousCargoPlates {
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
  // Code for the upper part
  private String upperPartCode;
  // Name of the upper part
  private String upperPartName;
  // There are many different required label types, depending on commodity (UNDG Number), and
  // therefore a Label Type Code will be necessary to specify each label type.
  private DangerousCargoLabelType dangerousCargoLabelType;
  // This schema specifies what "Dangerous Cargo Plate Conventions" exist, and as such what
  // conventions own which sets of "Dangerous Cargo Plate Upper Part" values.
  private DangerousCargoPlateConvention dangerousCargoPlateConvention;
  // DangerousCargoShipmentType enum
  private DangerousCargoShipmentTypeEnum dangerousCargoShipmentType;
}
