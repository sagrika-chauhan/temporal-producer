package com.example.temporalproducer.bookingmodel;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * Note*: We deliberately allow additional properties on this schema.
 * Because it is used in allOf compositions elsewhere and JSON schema
 * only able to look at immidiate sibling and as Facility is
 * allOf Persitable any schemas using allOf Facility will not be able to
 * set additionalProperties to false to enforce that rule.
 */
@Builder
@Getter
@Setter
public class BookingLineBase {
  /**
   * A cargo characteristic that is relevant to transport order execution. \n\nEach characteristic
   * is also categorised as either 'Standard' or 'Special'. Examples of Cargo Types and
   * Standard/Special categorisations are:\n\n- Dry - (Standard)\n- Live Reefer - (Special)\n-
   * Dangerous (often also referred to as Hazardous) - (Special)\n- Out Of Gauge (OOG) -
   * (Special)\n- Break Bulk - (Special)\n\nAdditional examples of Cargo Types, used by Logistics
   * and Services:\n\n- N - Normal\n\n Used in case we don’t have any special requirement for the
   * account.\n- F - Flat pack\n- D - Dangerous cargo\n- M - Mixed/other\n- G - Garment on hangers
   * \n- H - Hanger on Flatpack\n\n Stored in a big carton, in which cargo is hanging inside\n- R -
   */
  private CargoType cargoType;
  /**
   * A cargo characteristic that is relevant to transport order execution. \n\nEach characteristic
   * is also categorised as either 'Standard' or 'Special'. Examples of Cargo Types and
   * Standard/Special categorisations are:\n\n- Dry - (Standard)\n- Live Reefer - (Special)\n-
   * Dangerous (often also referred to as Hazardous) - (Special)\n- Out Of Gauge (OOG) -
   * (Special)\n- Break Bulk - (Special)\n\nAdditional examples of Cargo Types, used by Logistics
   * and Services:\n\n- N - Normal\n\n Used in case we don’t have any special requirement for the
   * account.\n- F - Flat pack\n- D - Dangerous cargo\n- M - Mixed/other\n- G - Garment on hangers
   * \n- H - Hanger on Flatpack\n\n Stored in a big carton, in which cargo is hanging inside\n- R -
   */
  private List<CommodityCodes> commodityCodes;
  /**
   * Subclass for Dangerous Cargo Information that will be associated with either a Customer
   * Product, a Customer Order Line, a Shipper Booking Line, or a Shipping Instruction Line. "*
   */
  private ProductDangerousCargoInformation productDangerousCargoInformation;
}
