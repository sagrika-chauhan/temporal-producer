package com.example.temporalproducer.bookingmodel;

import lombok.Builder;

/** A floor that is installed in a container, e.g. made of bamboo or wood. */
@Builder
public class ContainerFloor {
  // Number of bull rings installed in the container
  private Integer bullRingsCount;
  // Maximum load of each bull ring
  private Integer bullRingsMaximumLoad;
  // Weight Unit Enum
  private WeightUnitEnum bullRingsMaximumLoadUnit;
  // Height of the container floor
  private Integer containerFloorHeight;
  // Dimension Unit Enum
  private DimensionUnitEnum containerFloorHeightUnit;
  // Width of the container floor
  private Integer containerFloorWidth;
  // Dimension Unit Enum
  private DimensionUnitEnum containerFloorWidthUnit;
  // Indicates whether the floor has/must have hanger tracks installed.
  private Boolean hasHangerTracks;
  // Maximum weight allowed per square unit
  private Integer maximumWeightPerSquareUnit;
  // Weight Unit Enum
  private WeightUnitEnum maximumWeightPerSquareUnitWeightUnit;
  // Dimension Unit Enum
  private DimensionUnitEnum maximumWeightPerSquareUnitSquareUnit;
}
