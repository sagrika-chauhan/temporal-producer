package com.example.temporalproducer.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.extern.jackson.Jacksonized;

/** If and when a booking is cancelled, this class holds information on why it was cancelled. */
@Getter
@Builder
@Jacksonized
@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class BookingCancellation {
  private final String remark;
  private final String bookingCancellationReasonCode;
  private final String bookingCancellationReasonName;
}
