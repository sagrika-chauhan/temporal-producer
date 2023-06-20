package com.example.temporalproducer.bookingmodel;

import lombok.AllArgsConstructor;

/**
 * Top level types:** * - OPS - Operational Facility * - COM - Commercial Facility * -
 * Administrative, service and sales activities and functions only for Maersk- or Maersk affiliate
 * facilities. * - CUS - Customer Facility.
 */
@AllArgsConstructor
public enum FacilityTypeEnum {
  OPERATIONAL("OPERATIONAL"),
  COMMERCIAL("OPERATIONAL"),
  MARINE_CONTAINER_TERMINAL("MARINE_CONTAINER_TERMINAL"),
  WAREHOUSE("WAREHOUSE"),
  CONTAINER_YARD("CONTAINER_YARD"),
  CONTAINER_FREIGHT_STATION("CONTAINER_FREIGHT_STATION"),
  OFFICE("OFFICE"),
  PORT("PORT"),
  GATE("GATE"),
  MAINTENANCE_REPAIR_STATION("MAINTENANCE_REPAIR_STATION"),
  BERTH("BERTH"),
  INTERMODAL_CONTAINER_TRANSFER_FACILITY("INTERMODAL_CONTAINER_TRANSFER_FACILITY"),
  SHOP("SHOP"),
  THIRD_PARTY_AGENT("THIRD_PARTY_AGENT"),
  THIRD_PARTY_COUNTER_AGENT("THIRD_PARTY_COUNTER_AGENT"),
  BRAND_OFFICE("BRAND_OFFICE"),
  VESSEL_AGENT("VESSEL_AGENT"),
  AIRPORT("AIRPORT"),
  CUSTOMS_OFFICE("CUSTOMS_OFFICE");

  private final String facilityType;

  public String getFacilityTypeEnum() {
    return facilityType;
  }
}
