package com.example.temporalproducer.bookingmodel;

import jakarta.validation.constraints.Size;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * Maintains ServicePlanLeg related information.
 */
@Builder
@Setter
@Getter
public class ServicePlanLeg {

  // The sequence in which the transportation should occur
  private Integer sequence;

  // A schema for associating locations to data objects
  private CargoServiceTypeEnum cargoServiceType;

  // The type of service plan leg, e.g. MAIN_LEG or ORIGIN_LEG
  private ServicePlanLegTypeEnum servicePlanLegType;

  // Transport mode enum value, e.g. MOTHER_VESSEL, AIR, TRUCK, BARGE or MULTI_MODAL
  private TransportModeEnum transportMode;

  // Placeholder sub-schema only including foreign key. Can be redefined in an extension schema to
  // refer to full schema
  private TransportOrder transportOrder;

  // All the transport asset requirements for this service leg
  @Size(min = 1)
  private List<TransportAssetRequirement> transportAssetRequirements;

  // List of service dates - these are expressed as events that can be planned, estimated, expected
  // etc.
  // Examples include: Required Pick-Up Date, Required Delivery Date, Required Time of Departure,
  // Required Time of Arrival.
  // Service execution dates can also be expressed in time framed windows.
  // Examples include:Required Pick-Up Window Start, Required Pick-Up Window End, Required Departure
  // Window Start,
  // Required Departure Window End.

  @Size(min = 1)
  private List<ServiceDate> serviceDates;

  // The standardized service that a customer can purchase as standalone and is replicable across
  // many customers. A Product is offered and sold to a customer as a whole, and cannot have its
  // components sold separately.
  private Product product;
  private Carriage carriage;
  private ProductOffer productOffer;
  private LocationAssociation startLocation;
  private LocationAssociation endLocation;
}
