package com.example.temporalproducer.bookingmodel;

import lombok.Builder;
import lombok.NonNull;

import java.util.List;

/**
 * Represents the ACTUAL set of dangerous cargo information that must go together with either a: -
 * Customer Product - Transport Leg
 *
 * <p>Note: additionalProperties allowed in this schema in order for sub-schemas to use allOf.
 */
@Builder
public class DangerousCargoInformation {

  // Because "Dangerous Cargo Information" has subtypes. This classes defines the subtype to be
  // used, via code
  @NonNull private DangerousCargoInformationTypeEnum dangerousCargoInformationType;
  // Holds text instructions (sent by Customer, Shipper or Consignee) on how to handle the cargo.
  @NonNull private List<Instruction> instructions;
  // It's always mandatory for Dangerous Cargo to have at least 1 occurrence of a contact
  // information for emergency cases.
  @NonNull private DangerousCargoEmergencyContact emergencyContacts;
  // Any additional parties needed for the dangerous cargo information
  @NonNull private List<EmergencyContactParty> additionalParties;
  // The Hazardous Material Classification (also known as HazMat) classifies Dangerous Cargo
  // commodities in specific groups, according to the specific hazard or danger that they pose. This
  // classification is used then to generate proper Dangerous Cargo Placards (also known as
  // "Diamonds") that are used to label cargo, containers/equipment or vehicles, and derive the
  // proper Dangerous Cargo handling and regulations. This classification is also the base used by
  // the different classifications used around the world, and/or maintained by specific transport
  // mode regulating authorities, such as IMDG (IMO) for Ocean, or IATA for Air.
  @NonNull private HazMatClass hazMatClass;
}
