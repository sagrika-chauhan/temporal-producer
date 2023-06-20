package com.example.temporalproducer.bookingmodel;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

/**
 * Maintains Payer related information.
 */
@Builder
@Getter
@Setter
public class Payer {
  private String partyCode;
}
