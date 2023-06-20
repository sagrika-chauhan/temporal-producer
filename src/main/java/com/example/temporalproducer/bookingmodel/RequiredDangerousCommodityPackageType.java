package com.example.temporalproducer.bookingmodel;

import lombok.Builder;
import lombok.Getter;

/**
 * Maintains RequiredDangerousCommodityPackageType related information.
 */
@Getter
@Builder
public final class RequiredDangerousCommodityPackageType {
  // Package unit, e.g. CARTON or PALLET
  private final String cargoPackageType;
}
