package com.example.temporalproducer.bookingmodel;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

/**
 * Maintains PostalAddress related information.
 */
@Data
@AllArgsConstructor
@Builder
public class PostalAddressInfra {

  private String uniqueIdentifier;
  private String uniqueIdentifierNonUuid;
  private String businessIdentifier;
  private String businessPartnerIdentifier;
  private String postalAddressLine1;
  private String postalAddressLine2;
  private String postalCode;
  private String postOfficeBox;
}
