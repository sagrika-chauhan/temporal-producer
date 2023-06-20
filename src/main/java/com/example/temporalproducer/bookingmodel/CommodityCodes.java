package com.example.temporalproducer.bookingmodel;

import lombok.Builder;
import lombok.Getter;

/**
 * A generic association to support both master and transactional data.
 * Associations to Commodity & Classifications.
 * Holds any related commodity classifications on the transactional classes it relates to.
 */
@Getter
@Builder
public final class CommodityCodes {
  // The commodity code supplied at the time of the booking
  private final String commodityCode;
  // The commodity number supplied at the time of the booking
  private final String commodityName;
}
