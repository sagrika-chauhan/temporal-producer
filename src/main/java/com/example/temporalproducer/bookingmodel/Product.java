package com.example.temporalproducer.bookingmodel;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * Maintains Product related information.
 */
@Builder
@Getter
@Setter
public class Product {
  private String productCode;
  private String productEnum;
  private String productName;
  private List<ProductElements> productElements;
}
