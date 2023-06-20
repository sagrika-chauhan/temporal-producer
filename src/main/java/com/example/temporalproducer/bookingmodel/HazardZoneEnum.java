package com.example.temporalproducer.bookingmodel;

/**
 * Determined via the UNDG number.
 *
 * <p>NOTE: this class covers the old MODS fields "PIH Zone 1-5"
 *
 * <p>The "Hazard Zone" is a subsidiary classification to "Packing Group", used specifically for
 * commodities within HazMat Class and Division 6.1 "Toxic Substances" (hence why relationship is
 * 0..1), that refers to the type of danger that a 6.1 dangerous commodity poses to human life.
 */
public enum HazardZoneEnum {
  HAZARD_ZONE_1("HAZARD_ZONE_1"),
  HAZARD_ZONE_2("HAZARD_ZONE_2"),
  HAZARD_ZONE_3("HAZARD_ZONE_3"),
  HAZARD_ZONE_4("HAZARD_ZONE_4");
  private final String hazard;

  HazardZoneEnum(String value) {
    this.hazard = value;
  }

  public String getVolumeUnit() {
    return hazard;
  }
}
