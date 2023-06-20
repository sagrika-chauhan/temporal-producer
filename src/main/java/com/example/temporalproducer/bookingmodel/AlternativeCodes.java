package com.example.temporalproducer.bookingmodel;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

/**
 * Maintains AlternativeCodes information.
 */
@Builder
@Getter
@Setter
public class AlternativeCodes {

  private String alternativeCode;

  private String alternativeCodeName;

  private AlternativeCodeTypeEnum alternativeCodeType;

  private boolean isActive;

  private boolean isInboundDataTransformed;

  private boolean isOutboundDataTransformed;

  private AlternativeCodeOwner alternativeCodeOwner;
}
