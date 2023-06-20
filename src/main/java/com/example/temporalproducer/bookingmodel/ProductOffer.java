package com.example.temporalproducer.bookingmodel;

import lombok.Builder;
import lombok.Getter;

import java.util.List;

/**
 * Maintains ProductOffer related information.
 */
@Builder
@Getter
public class ProductOffer {

  private String productOfferCode;
  private List<Product> products;
  private Agreement agreement;
  private List<Charge> charges;
}
