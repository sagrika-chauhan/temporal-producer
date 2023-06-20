package com.example.temporalproducer.bookingmodel;

import lombok.Builder;
import lombok.Getter;

/**
 * Maintains Cargo related information.
 */
@Getter
@Builder
public final class CargoType {
  // Cargo type code, e.g. N for Normal or G for Garment on Hangers
  private final String cargoTypeCode;
  // "Cargo type Enum, e.g. Reefer"
  private final CargoTypeEnum cargoTypeEnum;
}
