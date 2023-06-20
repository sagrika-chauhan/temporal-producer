package com.example.temporalproducer.bookingmodel;

import jakarta.validation.constraints.Min;
import lombok.Builder;

import java.util.List;

/**
 * Maintains TransportDangerousCargo related information.
 */
@Builder
public class TransportDangerousCargoInfo {
  // Because "Dangerous Cargo Information" has subtypes. This classes defines the subtype to be
  // used, via code
  private DangerousCargoInformationTypeEnum dangerousCargoInformationType;
  // All dangerous cargo placards
  @Min(1)
  private List<DangerousCargoPlacard> dangerousCargoPlacards;
  // All dangerous cargo labels
  private List<DangerousCargoLabel> dangerousCargoLabels;
  // All dangerous cargo plates
  private List<DangerousCargoPlates> dangerousCargoPlates;
}
