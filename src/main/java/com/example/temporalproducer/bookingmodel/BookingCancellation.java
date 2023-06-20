package com.example.temporalproducer.bookingmodel;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

/** If and when a booking is cancelled, this class holds information on why it was cancelled. */
@Getter
@Setter
@Builder
public final class BookingCancellation {
  // Any free text additional remarks on booking cancellation
  private final String remark;
  // A unique code for the booking cancellation reason, e.g. CNR for Cargo Not Ready
  private final String bookingCancellationReasonCode;
  // A human readable name for the booking cancellation reason.
  private final String bookingCancellationReasonName;
}
