package com.example.temporalproducer.bookingmodel;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

/**
 * Maintains TransportOrder related information.
 */
@Builder
@Getter
@Setter
public class TransportOrder {
  private String transportOrderNumber;
}
