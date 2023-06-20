package com.example.temporalproducer.bookingmodel;

/**
 * Maintains PackingGroup related constants.
 */
public enum PackingGroupEnum {
  PACKING_GROUP_I("PACKING_GROUP_I"),
  PACKING_GROUP_II("PACKING_GROUP_II"),
  PACKING_GROUP_III("PACKING_GROUP_III");
  /**
   * Whilst the HazMat Class (risk) of a hazardous commodity defines what is the type of danger it
   * presents, a second classification, called the PACKING GROUP (PG) defines just how dangerous the
   * commodity is.
   *
   * <p>There are 3 possible values for Packing Group (Code - Name - Meaning): - I - Packing Group I
   * - most dangerous - II - Packing Group II - moderate danger - III - Packing Group III - least
   * dangerous
   */
  private final String packing;

  PackingGroupEnum(String value) {
    this.packing = value;
  }

  public String getPackingGroup() {
    return packing;
  }
}
