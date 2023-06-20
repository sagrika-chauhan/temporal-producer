package com.example.temporalproducer.bookingmodel;

import lombok.Builder;

/**
 * Maintains GarmentOnHangerStringSpecification related information.
 */
@Builder
public class GarmentOnHangerStringSpecification implements HangerSpecification {

  // E.g. The string should always be in a straight line as possible. We should not see a curve.
  private final String remark;
  // The material that the string must be made of.
  private final String stringMaterial;
  // The color the string must have, e.g. White
  private final String stringMaterialColour;
  // The amount of knots that must be present on each string in whcih a hanger can be placed
  private final Integer knotCount;
  // Used to indicate how many string should be on each bar when using a string configuration.
  private final Integer stringCountPerBar;
  // The distance from the the bar to the first know on the string when using string configuration
  // for GOH.
  private final Integer stringDistanceFromBarToFirstKnot;
  // The maximum allowable distance between each string on each bar.
  private final Integer stringDistanceMaximum;
  // The minimum allowable distance between each string on each bar.
  private final Integer stringDistanceMinimum;
  // Dimension Unit Enum
  private final DimensionUnitEnum stringDistanceUnit;
  // Maximum weight that can be hung on the string
  private final Integer stringMaximumWeightLoad;
  // Weight Unit Enum
  private final WeightUnitEnum stringMaximumWeightLoadUnit;
  // Thickness of string, e.g. 0.3 CENTIMETER
  private final Integer stringThickness;
  // Dimension Unit Enum
  private final DimensionUnitEnum stringThicknessUnit;
  // The minimum allowed length of the string.
  private final Integer stringLengthMinimum;
  // The maximum allowed length of the string.
  private final Integer stringLengthMaximum;
  // Dimension Unit Enum
  private final DimensionUnitEnum stringLengthUnit;
}
