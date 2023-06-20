package com.example.temporalproducer.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Defines what are the required transport assets (i.e. vehicles and/or equipment, such as
 * containers for a given Service Plan, Service Plan Leg, Transport Order, or Carrier Booking
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@JsonIgnoreProperties(ignoreUnknown = true)
public class TransportAssetRequirement {
  private String requiredEquipmentSizeTypeCode;
  private RequiredEquipmentProfile requiredEquipmentProfile;
}
