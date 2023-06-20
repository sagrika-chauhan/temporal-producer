package com.example.temporalproducer.bookingmodel;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

/**
 * Maintains ProductElementScope related information.
 */
@Builder
@AllArgsConstructor
@Getter
public class ProductElementScope {

  private boolean isOptional;
  private boolean isOptionalChargeable;
}
