package com.example.temporalproducer.serviceplan;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * For a specific Service Plan, it defines where/when scope of Maersk O&L service starts/ends, i.e.
 * what is included, in terms of parts of the end-to-end journey, and consolidation/
 * deconsolidation. It effectively defines what must be the Service Plan Legs (and their
 * corresponding Service Plan Locations).",
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@JsonIgnoreProperties(ignoreUnknown = true)
public class ServiceTypeMode {
  private ShipmentServiceTypeEnum originService;
  private ShipmentServiceTypeEnum destinationService;
}
