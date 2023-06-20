package com.example.temporalproducer.bookingmodel;

import lombok.Builder;
import lombok.Getter;

/**
 * The Hazardous Material Classification (also known as HazMat) classifies Dangerous Cargo
 * commodities in specific groups, according to the specific hazard or danger that they pose. This
 * classification is used then to generate proper Dangerous Cargo Placards (also known as
 * \"Diamonds\") that are used to label cargo, containers/equipment or vehicles, and derive the
 * proper Dangerous Cargo handling and regulations. This classification is also the base used by the
 * different classifications used around the world, and/or maintained by specific transport mode
 * regulating authorities, such as IMDG (IMO) for Ocean, or IATA for Air.
 */
@Builder
@Getter
public final class HazMatClass {
  // DEPRECATED - Replaced by HazMatClassCode
  private final String hazMatCode;
  // The HazMat code value, e.g. 1.1
  private final String hazMatClassCode;
  // Official Class Text that corresponds to HazMat Class Code. Text relates only to first digit
  // code (before dot)
  private final String hazMatClassName;
  // 1.1 Explosives with a mass explosion hazard
  private final String hazMatDivisionName;
}
