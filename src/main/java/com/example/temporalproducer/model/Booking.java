package com.example.temporalproducer.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.validation.constraints.Min;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * An allOf schema for Booking that should be used when $ref to the Booking. The reason is that
 * BookingBase.json is used in allOf by e.g. Shipper Booking and the Booking.json therefore cannot
 * be set to additionalProperties=false. Therefore this base schema will provide the disallowance of
 * additional properties so that validation can be done correctly where the entire Booking object is
 * needed.
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@JsonIgnoreProperties(ignoreUnknown = true)
public class Booking {
  // The number of the booking, e.g. 23423456
  private String bookingNumber;

  // When the document was issued
  private String issuedDatetime;
  // Unique number for the service plan
  private String servicePlanNumber;

  // Parties of relevance to the data object.\n\nE.g. used for seller, buyer and other filing
  // related parties
  @Min(1)
  private List<Party> parties;

  private List<Reference> references;
  // Refers to the different status a Booking may have

  private List<BookingEquipment> bookingEquipment;
  // List of instructions for the booking//

  private List<StandardReason> standardReasons;
  private String instructions;
}
