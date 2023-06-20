package com.example.temporalproducer.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * An allOf schema for Booking Line that should be used when $ref to the Booking Line. The reason is
 * that BookingLine.json is used in allOf by e.g. Shipper Booking Line and the BookingLine.json
 * therefore cannot be set to additionalProperties=false. Therefore this base schema will provide
 * the disallowance of additional properties so that validation can be done correctly where the
 * entire Event object is needed."
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@JsonIgnoreProperties(ignoreUnknown = true)
public class BookingLine {
  private String cargoType;
}
