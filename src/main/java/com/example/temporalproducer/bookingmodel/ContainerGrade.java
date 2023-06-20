package com.example.temporalproducer.bookingmodel;

import lombok.Builder;

/**
 * A Maersk internal grading of the quality and cleanliness of a shipping container. The grading is
 * given in accordance with Maersk Container Inspection Criteria (MCIC). A grade can be given to for
 * example indicate that the container is is acceptable for food shipment.
 *
 * <p>There are 5 different grades currently in MERC+ to ensure Maersk customers have been provided
 * with the best suited equipment for their cargo needs.
 *
 * <p>Grades: S - Flexi-bags shipments and Premium Food grade M - Food grade type shipments K -
 * General cargo - Clean container/Premium shipments E - General cargo shipments Q - Scrap cargo
 * shipments
 */
@Builder
public class ContainerGrade {

  // This is Container Grade Code
  private String containerGradeCode;
  // This is Container Grade Name
  private String containerGradeName;
}
