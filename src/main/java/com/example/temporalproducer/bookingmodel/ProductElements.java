package com.example.temporalproducer.bookingmodel;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

/**
 * Maintains ProductElements related information.
 */
@Builder
@AllArgsConstructor
@Getter
@Setter
public class ProductElements {

  private ProductElement productElement;
  private ProductElementScope productElementScope;
}
