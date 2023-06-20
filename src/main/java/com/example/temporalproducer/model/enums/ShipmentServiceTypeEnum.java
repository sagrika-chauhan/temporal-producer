package com.example.temporalproducer.model.enums;

import lombok.AllArgsConstructor;

/** "shipment service type. " */
@AllArgsConstructor
public enum ShipmentServiceTypeEnum {
  DOOR("DOOR"),
  PORT("PORT");

  private String shipmentServiceTypeEnumValue;

  public String getShipmentServiceTypeEnumValue() {
    return shipmentServiceTypeEnumValue;
  }
}
