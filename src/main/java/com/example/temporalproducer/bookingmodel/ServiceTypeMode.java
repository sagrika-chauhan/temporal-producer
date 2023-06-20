package com.example.temporalproducer.bookingmodel;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

/**
 * Maintains ServiceTypeMode related information.
 */
@Builder
@Getter
@Setter
public class ServiceTypeMode {

  private boolean isMainTransportProviderMode;
  private String originService;
  private String destinationService;

  private String loadService;

  private String dischargeService;
}
