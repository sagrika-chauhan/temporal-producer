package com.example.temporalproducer.bookingmodel;

import lombok.Builder;

/**
 * Maintains DesiccantBagType related information.
 */
@Builder
public class DesiccantBagType {
  // Unique code for the desiccant bag type, e.g. SIGL for Silica Gel, PRDR for Pro-Dry or WLDR for
  // Well-Dry
  private String desiccantBagTypeCode;
  // Human-readable name for the desiccant bag type, e.g. Silica Gel.
  private String desiccantBagTypeName;
}
