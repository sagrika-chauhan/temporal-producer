package com.example.temporalproducer.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * The Service Plan (SPL) defines the scope of the service that
 * Maersk is providing for a specific end-to-end shipment journey of
 * a specific customer, such as:\n\n- where/when Maersk Ocean & Logistics
 * service starts/ends;\n- where/when are specific services
 * to occur;\n- what products and product add-ons are included;\n-
 * what service features are included (MCC, Milk Run, etc.);\n-
 * what moments of the journey are included (i.e. consolidation,
 * deconsolidation, distribution centre, last mile, customs
 * brokerage, etc.).",
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@JsonIgnoreProperties(ignoreUnknown = true)
public class ServicePlan {
  private String servicePlanNumber;
  private Boolean hasOriginEmptyPickup;
  private ProductOffer productOffer;
  private Booking booking;
  private List<ServicePlanLeg> servicePlanLegs;
  private DocumentPouch documentPouch;
  private Boolean hasDestinationEmptyReturn;
}
