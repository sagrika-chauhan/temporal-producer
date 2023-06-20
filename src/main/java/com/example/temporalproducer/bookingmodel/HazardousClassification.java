package com.example.temporalproducer.bookingmodel;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

/**
 * "When a commodity is considered \"dangerous cargo\", then, under the United Nations Dangerous
 * Cargo (UNDG) standard, it must be classified with a UNDG number, assigned by the United Nations
 * Committee of Experts on the Transport of Dangerous Goods. \n\nThe entire \"Hazardous
 * Classification\" (all classes and attributes) can be ultimately derived from the UNDG number, as
 * the UNDG number is univocal for the entire \"Hazardous Classification\" data.
 */
@Builder
@Getter
@Setter
public class HazardousClassification {
  // United Nations (UN) classification of types of Dangerous Goods (DG). A numeric code indicating
  // type of dangerous cargo/commodity, from a closed list of standard codes. UNDG numbers are
  // assigned to dangerous goods within the range of UN 0004 to UN 3534. Example UN0081 - EXPLOSIVE,
  // BLASTING, TYPE A
  private String unDangerousGoodNumber;
  // The Hazardous Material Classification (also known as HazMat) classifies Dangerous Cargo
  // commodities in specific groups, according to the specific hazard or danger that they pose. This
  // classification is used then to generate proper Dangerous Cargo Placards (also known as
  // \"Diamonds\") that are used to label cargo, containers/equipment or vehicles, and derive the
  // proper Dangerous Cargo handling and regulations. This classification is also the base used by
  // the different classifications used around the world, and/or maintained by specific transport
  // mode regulating authorities, such as IMDG (IMO) for Ocean, or IATA for Air.
  private HazMatClass riskClassification;

  private RequiredDangerousCommodityPackageType requiredDangerousCommodityPackageType;
}
