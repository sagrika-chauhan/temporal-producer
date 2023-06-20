package com.example.temporalproducer.bookingmodel;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

/**
 * Maintains Document related information.
 */
@Builder
@AllArgsConstructor
@Getter
@Setter
public class Document {
  private String documentNumber;
  private String documentName;
  private String documentType;
}
