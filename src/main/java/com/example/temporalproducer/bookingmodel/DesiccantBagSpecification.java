package com.example.temporalproducer.bookingmodel;

import lombok.Builder;

/**
 * Maintains DesiccantBagSpecification related information.
 */
@Builder
public class DesiccantBagSpecification {

  // Moisture absorbent bags that are typically placed in containers with garments to avoid the
  // garments becoming moldy.
  private DesiccantBagType desiccantBagType;
  // Number of desiccant bags to be hung from each bar
  private Integer desiccantBagCountPerBar;
  // The weight of one desiccant bag
  private Integer desiccantBagWeight;
  // Weight Unit Enum
  private WeightUnitEnum desiccantBagWeightUnit;
  private String desiccantBagPlacement;
  private String remark;
  // Number of desiccant bags that must be in the container. This is used as a specifiction normally
  // given by the customer to tell operations how many bags should be there.
  private Integer desiccantBagCountPerContainer;
}
