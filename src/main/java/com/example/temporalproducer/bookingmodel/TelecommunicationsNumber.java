package com.example.temporalproducer.bookingmodel;

import lombok.Builder;
import lombok.Getter;

/** These entries like 'FAX +65 9233 0891' or 'Cell +91 0 9625 0242'. */
@Builder
@Getter
public final class TelecommunicationsNumber {
  // The number to dial, e.g. +65 9233 0891
  private final String telecommunicationNumber;
  // The type of telephone number, e.g. FAX or CELL
  private final String telecommunicationNumberTypes;
}
