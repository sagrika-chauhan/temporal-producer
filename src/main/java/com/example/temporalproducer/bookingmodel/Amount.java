package com.example.temporalproducer.bookingmodel;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

/**
 * Maintains Amount related information.
 */
@Builder
@Getter
@AllArgsConstructor
public class Amount {
  private String unit;
  private String value;
}
