package com.example.temporalproducer.bookingmodel;

/**
 * Maintains NameAliasType related constants.
 */
public enum NameAliasTypeEnum {
  COMPANY_NAME_ALIAS("COMPANY_NAME_ALIAS");

  private final String nameAliasTypeValue;

  NameAliasTypeEnum(String value) {
    this.nameAliasTypeValue = value;
  }

  public String getNameAliasTypeValue() {
    return nameAliasTypeValue;
  }
}
