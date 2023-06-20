package com.example.temporalproducer.bookingmodel;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * Maintains ServicePlanLocation related information.
 */
@Builder
@Getter
@Setter
public class ServicePlanLocation {
  Location location;
  private LocationFunctionEnum locationFunction;
  private List<Product> products;
  private List<ProductOffer> productOffers;
  private List<ServiceDate> serviceDates;
  private RequiredTransportProvider requiredTransportProvider;
}
