package com.example.temporalproducer.bookingmodel;

import lombok.Builder;

import java.util.List;

/**
 * Maintains GarmentOnHangerTier related information.
 */

@Builder
public class GarmentOnHangerTier {

  // Bar spot welding is not permitted and bars / beams must not be rusty
  private String remark;
  // The number of the tier, e.g. 1 or 2
  private Integer tier;
  // The safe working load of each bar installed, e.g. 450 KILOGRAM
  private Integer barSafeWorkingLoad;
  // Weight Unit Enum
  private WeightUnitEnum barSafeWorkingLoadWeightUnit;
  // The minimum diameter that the bars must have
  private Integer barDiameterMinimum;
  // The maximum diameter that the bars can have.
  private Integer barDiameterMaximum;
  // Dimension Unit Enum
  private DimensionUnitEnum barDiameterLengthUnit;
  // The minimum number of bars that should be installed
  private Integer barCountMinimum;
  // The maximum number of bars that should be installed
  private Integer barCountMaximum;
  // The distance from the bars to the roof of the container
  private Integer barDistanceToContainerRoof;
  // The distance from bars in this tier to bars in the tier below.
  private Integer barDistanceToLowerBarTier;
  // The distance from the bars to the floor of the container
  private Integer barDistanceToFloor;
  // The distance from the first bar in the tier to the tail of the container.
  private Integer barFirstDistanceFromContainerTail;
  // The distance between bars in the tier when maximum number of bars installed
  private Integer barDistanceWithMaximumBars;
  // The distance between bars in the tier when minimum number of bars installed
  private Integer barDistanceWithMinimumBars;
  // The distance from the last bar to the nose of the container
  private Integer barLastDistanceFromContainerNose;
  // Dimension Unit Enum
  private DimensionUnitEnum barDistanceUnit;
  // The minimum distance the garments must have to the floor of the container.
  private Integer garmentMinimumDistanceToContainerFloor;
  // Dimension Unit Enum
  private DimensionUnitEnum garmentMinimumDistanceToContainerFloorUnit;
  // One or more dessicant bag specification to chose from when fitting container
  private List<DesiccantBagSpecification> desiccantBagSpecifications;
  // Details about direct on bar, string or strap specifications

  private HangerSpecification hangerSpecification;
}
