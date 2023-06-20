package com.example.temporalproducer.bookingmodel;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

/**
 * Maintains ProductConfigurationOptions related information.
 */
@Builder
@AllArgsConstructor
@Getter
@Setter
public class ProductConfigurationOptions {
  private String productConfigurationOptionCode;
  private String productConfigurationOptionDescription;
  private String productConfigurationOptionName;
}
