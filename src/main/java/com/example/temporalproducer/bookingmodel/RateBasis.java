package com.example.temporalproducer.bookingmodel;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

/**
 * Maintains RateBasis related information.
 */
@Builder
@Getter
@Setter
public class RateBasis {
  private RateBasisEnum rateBasisEnum;
  private String rateBasisCode;
  private String rateBasisName;
  private UnitOfMeasurement unitOfMeasurement;
}
