package com.example.temporalproducer.bookingmodel;

import lombok.Builder;
import lombok.Getter;

/**
 * Maintains PostalAddress related information.
 */
@Getter
@Builder
public class PostalAddress {

  private String uniqueIdentifier;
  private String uniqueIdentifierNonUuid;
  private String businessIdentifier;
  private String businessPartnerIdentifier;
  private String postalAddressLine1;
  private String postalAddressLine2;
  private String postalCode;
  private String postOfficeBox;
}
