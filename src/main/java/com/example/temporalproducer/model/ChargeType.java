package com.example.temporalproducer.model;

import com.example.temporalproducer.model.enums.ChargeTypeEnum;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Basic Ocean Freight-Additional Tonnage Charge-Container Cleaning Export - Customs Clearance
 * Origin - Container Nomination Service - Equipment Management Import - Value Added Service -
 * Optional charges are called Value Added Services.
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@JsonIgnoreProperties(ignoreUnknown = true)
public class ChargeType {
  private ChargeTypeEnum chargeTypeEnum;
  private String chargeTypeCode;
  private String chargeTypeName;
}
