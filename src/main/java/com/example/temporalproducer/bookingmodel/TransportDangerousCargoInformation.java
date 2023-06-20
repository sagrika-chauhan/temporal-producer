package com.example.temporalproducer.bookingmodel;

import lombok.Builder;
import lombok.NonNull;

/**
 * Maintains TransportDangerousCargo related information.
 */
@Builder
public class TransportDangerousCargoInformation {
  // Represents the ACTUAL set of dangerous cargo information that must go together
  @NonNull private DangerousCargoInformation dangerousCargoInformation;
  // Dangerous cargo information
  @NonNull private TransportDangerousCargoInfo transportDangerousCargoInformation;
}
