package com.example.temporalproducer.model;

import com.example.temporalproducer.model.enums.TransportModeEnum;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/** "List of service plan legs." */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@JsonIgnoreProperties(ignoreUnknown = true)
public class ServicePlanLeg {
  private Integer sequence;
  private LocationAssociation startLocation;
  private LocationAssociation endLocation;
  private TransportModeEnum transportMode;
  private TransportOrder transportOrder;
  private List<TransportAssetRequirement> transportAssetRequirements;
  private List<ServiceDate> serviceDates;
  private Boolean isEmptyEquipmentTransport;
  private List<Reference> references;
}
