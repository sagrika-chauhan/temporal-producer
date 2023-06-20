package com.example.temporalproducer.model;

import com.example.temporalproducer.model.enums.ExpectedNetWeightUnitEnum;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;



/**
 * Class for Booking Equipment.
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@JsonIgnoreProperties(ignoreUnknown = true)
public class BookingEquipment {
  private Integer sequence;
  private List<CommodityCodes> commodityCodes;
  private TransportAssetRequirement transportAssetRequirement;
  private List<Reference> references;
  private Double expectedNetWeight;
  private ExpectedNetWeightUnitEnum expectedNetWeightUnit;
  private Boolean isShipperOwned;
  private Boolean isEmptyEquipment;
}
