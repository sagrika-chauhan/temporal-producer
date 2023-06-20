package com.example.temporalproducer.model;

import com.example.temporalproducer.model.enums.ProductEnum;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * The standardized service that a customer can purchase as standalone and is replicable across many
 * customers. A Product is offered and sold to a customer as a whole, and cannot have its components
 * sold separately.
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@JsonIgnoreProperties(ignoreUnknown = true)
public class Product {
  private String productCode;
  private ProductEnum productEnum;
  private String productName;
}
