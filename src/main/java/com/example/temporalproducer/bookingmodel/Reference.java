package com.example.temporalproducer.bookingmodel;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

/**
 * Maintains Reference related information.
 */
@Builder
@AllArgsConstructor
@Getter
public class Reference {
  private String reference;
}
