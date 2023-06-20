package com.example.temporalproducer.bookingmodel;

import lombok.Builder;

/**
 * Any requirements regarding slot displacement, i.e. when cargoes and/or equipments exceed the
 * space within an equipment and/or vehicle. This includes:
 *
 * <p>- Excess height over the roof of equipment/vehicle. - Excess length at the front of
 * equipment/vehicle. - Excess length at the rear of equipment/vehicle. - Excess width laterally to
 * starboard. - Excess width laterally to port. - Displaced Slots Count, i.e. number of slots on the
 * vessel that cannot be used ('killed slots') as a result of loading cargo and/or equipment
 * (includes the slot that would have in any case been used had the cargo or equipment have not
 * caused displacement).
 */
@Builder
public class SlotDisplacement {

  // Number of slots on the vessel that cannot be used ('killed slots') as a result of loading this
  // OOG Container (includes the slot that would have in any case been used had the Container not
  // been OOG).
  private Integer displacedSlotCount;
  // Equipment Unit Measure enum
  private EquipmentUnitMeasureEnum displacedSlotUnit;
  // Excess height on top of the container roof level, loaded with the OOG cargo.
  private Integer overHeight;
  // Dimension Unit Enum
  private DimensionUnitEnum overHeightUnit;
  // Excess length of the container laterally to port side (i.e., left-side of the ship), loaded
  // with the OOG cargo.
  private Integer overLengthFront;
  // Dimension Unit Enum
  private DimensionUnitEnum overLengthFrontUnit;
  // Excess length of the container longitudinally to rear, loaded with the OOG cargo.
  private Integer overLengthRear;
  // Dimension Unit Enum
  private DimensionUnitEnum overLengthRearUnit;
  // Excess length of the container laterally to starboard side (i.e., right-side of the ship),
  // loaded with the OOG cargo.
  private Integer overWidthStarboard;
  // Dimension Unit Enum
  private DimensionUnitEnum overWidthStarboardUnit;
  // Excess length of the container longitudinally to front, loaded with the OOG cargo.
  private Integer overWidthPort;
  // Dimension Unit Enum
  private DimensionUnitEnum overWidthPortUnit;
}
