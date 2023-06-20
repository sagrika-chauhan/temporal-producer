package com.example.temporalproducer.bookingmodel;

import lombok.Builder;
import lombok.Getter;

/**
 * Mode of communication between parties.
 * Examples:- EDI,Web,Email,Post,API,Telephone,Fax,Telex
 */
@Builder
@Getter
public final class CommunicationMediaType {
  // Unique code for the communication media type, e.g. EDI",
  private final String communicationMediaTypeCode;
  // Name of the communication media type, e.g. Electronic Data Interchange
  private final String communicationMediaTypeName;
}
