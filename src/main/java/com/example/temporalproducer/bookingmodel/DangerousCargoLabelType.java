package com.example.temporalproducer.bookingmodel;

import lombok.Builder;

/**
 * There are many different required label types, depending on commodity (UNDG Number), and
 * therefore a Label Type Code will be necessary to specify each label type.
 */
@Builder
public class DangerousCargoLabelType {
  // Code for the dangerous cargo label type
  private String dangerousCargoLabelTypeCode;
  // Code for the dangerous cargo label name
  private String dangerousCargoLabelTypeName;
}
