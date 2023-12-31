package com.example.temporalproducer.model.enums;

import lombok.AllArgsConstructor;

/** + The type of service plan leg, e.g. MAIN_LEG or ORIGIN_LEG */
@AllArgsConstructor
public enum ServicePlanLegTypeEnum {
  MAIN_LEG("MAIN_LEG"),
  ORIGIN_LEG("ORIGIN_LEG"),
  DESTINATION_LEG("DESTINATION_LEG");

  private final String servicePlanLegTypeEnumValue;

  public String getServicePlanLegTypeEnumValue() {
    return servicePlanLegTypeEnumValue;
  }
}
