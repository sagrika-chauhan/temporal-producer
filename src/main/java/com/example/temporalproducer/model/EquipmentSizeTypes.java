package com.example.temporalproducer.model;

import com.example.temporalproducer.model.enums.EquipmentHeightCodeEnum;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/** Defines EquipmentSizeType related info. */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@JsonIgnoreProperties(ignoreUnknown = true)
public class EquipmentSizeTypes {
  private EquipmentHeightCodeEnum equipmentHeightCode;
  private String isoSizeTypeCode;
}
