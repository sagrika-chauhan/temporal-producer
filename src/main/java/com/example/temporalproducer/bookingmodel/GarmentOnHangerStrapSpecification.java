package com.example.temporalproducer.bookingmodel;

import lombok.Builder;

/**
 * Maintains GarmentOnHangerStrapSpecification related information.
 */
@Builder
public class GarmentOnHangerStrapSpecification implements HangerSpecification {
  // E.g. The strap should always be in a straight line as possible. We should not see a curve.
  private final String remark;
  // The material that the strap must be made out of, e.g. Polypropolene Webbing
  private final String strapMaterial;
  // The color of the material that the strap must have
  private final String strapMaterialColour;
  // When the loops are sewn this is the color of the thread that must be used.
  private final String colourOfThreadToSewLoops;
  // Used to indicate how many straps should be on each bar when using a strap configuration.
  //
  // E.g.: From the Marks and Spencer SOP on GOH configurations "Number of straps per bar / beam: to
  // be specified at the time of booking with freight forwarder."
  private final Integer strapCountPerBar;
  // The width of the strap, e.g. 2.5 cm
  private final Integer strapWidth;
  // Dimension Unit Enum
  private final DimensionUnitEnum strapWidthUnit;
  // The maximum weight load that the strap ust support.
  private final Integer strapMaximumWeightLoad;
  // Weight Unit Enum
  private final WeightUnitEnum strapMaximumWeightLoadUnit;
  // The minimum allowed length of the strap.
  private final Integer strapLengthMinimum;
  // The maximum allowed length of the strap.
  private final Integer strapLengthMaximum;
  // Dimension Unit Enum
  private final DimensionUnitEnum strapLengthUnit;

  // The minimum allowable distance between each strap on each bar.
  private final Integer strapDistanceMinimum;
  // The maximum allowable distance between each strap on each bar.
  private final Integer strapDistanceMaximum;
  // Dimension Unit Enum
  private final DimensionUnitEnum strapDistanceUnit;
  // The count of loops that must be on the strap
  private final Integer loopCount;
  // The length of the first loop on the strap
  private final Integer loopZeroLength;
  // The length of the loops after the first loop on the strap.
  private final Integer loopOneOnwardsLength;
  // The minimum allowed loop radius on the strap.
  private final Integer loopRadiusMinimum;
  // The maximum allowed loop radius on the strap.
  private final Integer loopRadiusMaximum;
  // A tolerance given for the loop distance, e.g. 0.5 CENTIMETER
  private final Integer loopDistanceTolerance;
  // Dimension Unit Enum
  private final DimensionUnitEnum loopLengthUnit;
}
