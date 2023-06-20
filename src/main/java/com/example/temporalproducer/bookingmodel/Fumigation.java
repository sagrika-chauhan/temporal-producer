package com.example.temporalproducer.bookingmodel;

import lombok.Builder;

import java.util.List;

/**
 * Fumigation is a method of pest control, or the removal of harmful micro-organisms, by completely
 * filling an area with gaseous pesticides, or fumigants, to suffocate or poison the pests within.
 *
 * <p>It is used to control pests in buildings, soil, produce, and most importantly during
 * processing of goods to be imported or exported, to prevent transfer of exotic organisms. This
 * method also affects the structure itself, affecting pests that inhabit the physical structure,
 * such as woodborers and drywood termites.
 *
 * <p>Fumigation can be applied to Cargo Packages, Vehicles, Containers and other Equipments,
 * Warehouses, etc.
 *
 * <p>This class will specify Fumigation requirements and details.
 */
@Builder
public class Fumigation {
  // The latest date that the fumigation should be performed
  private String requiredLatestFumigationDatetime;
  // The date and time that fumigation was completed
  private String actualFumigationDatetime;
  // Whether fumigation has been completed
  private Boolean isFumigationCompleted;
  // Contains possible values for substances that may be used in the fumigation process.
  private FumigationSubstance fumigationSubstance;
  // Responsible parties for the fumigation.Use for example RESPONSIBLE_PARTY as party function.
  private List<PartyAssociation> parties;

  private List<Instruction> instructions;
}
