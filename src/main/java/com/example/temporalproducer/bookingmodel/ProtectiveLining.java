package com.example.temporalproducer.bookingmodel;

import lombok.Builder;

/**
 * Typically a plastic wrapping that lines the inside of the container before garments are hung on
 * bars,beams,strings or straps. Protective lining are placed inside containers and fixed using
 * webbing/ties. These liners can be used for transporting dry bulk materials such as agricultural
 * seeds, grains, petrochemicals, urea, fertilizers, and other materials like sand, soda ash, and
 * silica, etc.
 */
@Builder
public class ProtectiveLining {

  // ZILO for Zipper Loading
  private String protectiveLiningTypeCode;
  // E.g. Zipper Loading, Top Filler, Sand Liner, Bar Less Liner etc.
  private String protectiveLiningTypeName;
  // E.g. ZIPPER_LOADING for Zipper Loading
  private String protectiveLiningTypeEnum;
  // E.g. Polypropylene, Polyethylene, Cardboard, Craft Paper
  private String materialName;
  // E.g. 0.5 with unit in MILLIMETER
  private Integer thickness;
  // Dimension Unit Enum
  private DimensionUnitEnum thicknessUnit;
}
