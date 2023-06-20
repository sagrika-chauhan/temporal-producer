package com.example.temporalproducer.bookingmodel;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

/**
 * Maintains ChargesType related information.
 */
@Builder
@Getter
@Setter
public class ChargeType {
  private ChargeTypeEnum chargeTypeEnum;
  private String chargeTypeCode;
  private String chargeTypeName;
}
