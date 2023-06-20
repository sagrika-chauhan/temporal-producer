package com.example.temporalproducer.bookingmodel;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * The Service Plan (SPL) defines the scope of the service that Maersk is providing for a specific
 * end-to-end shipment journey of a specific customer, such as:\n\n- where/when Maersk Ocean &
 * Logistics service starts/ends;\n- where/when are specific services to occur;\n- what products and
 * product add-ons are included;\n- what service features are included (MCC, Milk Run, etc.);\n-
 * what moments of the journey are included (i.e. consolidation, deconsolidation, distribution
 * centre, last mile, customs brokerage, etc.).",
 */
@Builder
@Getter
@Setter
public class ServicePlan {

  // Unique number for the service plan
  private String servicePlanNumber;

  // If true, then at least one instance of Service Plan Leg, where Service Plan Leg Type = 'Origin
  // Leg' and Is Empty Equipment Transport = 'true', must exist. For example an additional Origin
  // Leg is created, before all other Origin Legs.
  private boolean hasOriginEmptyPickup;

  // If true, then at least one instance of Service Plan Leg, where Service Plan Leg Type =
  // 'Destination Leg' and Is Empty Equipment Transport = 'True', must exist. For example an
  // additional Destination Leg is created, after all other Destination Legs
  private boolean hasDestinationEmptyPickup;

  private List<ServiceTypeMode> serviceTypeModes;
  private ProductOffer productOffer;

  private Product product;

  private Booking booking;

  private ServicePlanLocation servicePlanLocations;

  //    @NonNull
  //    @Size(min=1)
  private List<ServicePlanLeg> servicePlanLegs;

  private Agreement agreement;

  private DocumentPouch documentPouch;
}
