package com.example.temporalproducer.bookingmodel;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

/**
 * Maintains NameAliases related information.
 */
@Builder
@Getter
@Setter
public class NameAliases {

  private String nameAlias;
  private NameAliasTypeEnum nameAliasType;
  private String languageCode;
  private boolean isActive;
  private boolean isInboundDataTransformed;
  private boolean isOutboundDataTransformed;
  private NameAliasOwner nameAliasOwner;
}
