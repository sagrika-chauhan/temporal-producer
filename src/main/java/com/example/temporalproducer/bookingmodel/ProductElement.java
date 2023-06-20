package com.example.temporalproducer.bookingmodel;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * Maintains ProductElement related information.
 */
@Builder
@AllArgsConstructor
@Getter
@Setter
public class ProductElement {

  private String productCode;
  private List<ProductConfigurations> productConfigurations;
}
