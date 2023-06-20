package com.example.temporalproducer.bookingmodel;

import lombok.RequiredArgsConstructor;

/**
 * Units used for item quantities. Note that quantities are a decimal unit.
 * Examples of quantities include: meter(""), centimeter(""), kilogram(""),
 * carton(""), package etc."
 */
@RequiredArgsConstructor
public enum ItemUnitEnum {
  CARTON("CARTON"),
  SACK("SACK"),
  EACH("EACH"),
  BAG("BAG"),
  CASE("CASE"),
  BOX("BOX"),
  PIECE("PIECE"),
  PALLET("PALLET"),
  SET("SET"),
  PACKAGE("PACKAGE"),
  CRATE("CRATE"),
  ROLL("ROLL"),
  BUNDLE("BUNDLE"),
  PAIR("PAIR"),
  DRUM("DRUM"),
  UNIT("UNIT"),
  DOZEN("DOZEN"),
  CENTIMETER("CENTIMETER"),
  METER("METER"),
  KILOGRAM("KILOGRAM");
  private final String itemUnit;

  public String getItemUnitEnum() {
    return itemUnit;
  }
}
