package com.example.temporalproducer.bookingmodel;

/**
 * For internal (Maersk) use only. Classifies Shipments according to the nature of the dangerous
 * cargo that is included in a given shipment:
 *
 * <p>- Class 1 - When 1 or more cargo packages are classified as IMO Class 1 - the most dangerous
 * cargo type - ANCH - When at least one cargo package is classified in the dangerous shipment type
 * class as ANCH (Ammonium nitrate/Calcium hypochlorite) and none is classified as Class 1. - SROP -
 * When at least one cargo package is classified in the dangerous shipment type class as SROP
 * (Self-reactive organic peroxides) and none is classified as Class 1 nor as ANCH (Ammonium
 * nitrate/Calcium hypochlorite) - Coload - When 2 or more cargo packages are classified with an
 * IMO/UN Number not being any of the above types - Simple - When only one cargo package is being
 * classified with an IMO/UN Number not being any of the above types
 */
public enum DangerousCargoShipmentTypeEnum {
  CLASS_1("CLASS_1"),
  ANCH("ANCH"),
  SROP("SROP"),
  CO_LOAD("CO_LOAD"),
  SIMPLE("SIMPLE");

  private final String dangerousCargoShipment;

  DangerousCargoShipmentTypeEnum(String value) {
    this.dangerousCargoShipment = value;
  }

  public String getDangerousCargoShipmentType() {
    return dangerousCargoShipment;
  }
}
