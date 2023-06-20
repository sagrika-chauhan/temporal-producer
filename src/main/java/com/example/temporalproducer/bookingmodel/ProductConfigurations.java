package com.example.temporalproducer.bookingmodel;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

import java.util.List;

/**
 * Maintains ProductConfigurations related information.
 */
@Builder
@AllArgsConstructor
@Getter
public class ProductConfigurations {
  private String value;
  private String productConfigurationType;
  private List<ProductConfigurationOptions> productConfigurationOptions;
}
