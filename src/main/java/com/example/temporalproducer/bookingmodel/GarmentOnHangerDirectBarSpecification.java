package com.example.temporalproducer.bookingmodel;

import lombok.Builder;

/**
 * Maintains GarmentOnHangerDirectBarSpecification related information.
 */
@Builder
public class GarmentOnHangerDirectBarSpecification implements HangerSpecification {

  // The type of hanger security (to ensure the hangers do not fall off the bars) that must be used,
  // e.g. C-shaped Plastic Cover
  private final String hangerSecurityType;
  // The type of fastening that must be used to secure the hangers, e.g. Cable Ties
  private final String hangerSecurityFastening;
  // The distacne that must be used between the fastening, e.g. cable ties
  private final Integer hangerSecurityFasteningDistance;
  // Dimension Unit Enum
  private final DimensionUnitEnum hangerSecurityFasteningDistanceUnit;
}
