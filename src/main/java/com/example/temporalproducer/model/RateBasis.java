package com.example.temporalproducer.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Builder;
import lombok.Data;
import lombok.extern.jackson.Jacksonized;

/**
 * Rate Basis is used for charge calculations and price setting. They are defined as a base of
 * something relevant to the shipment, e.g.: Container, Transport Document, Weight, Time Period etc.
 * A unit of measurement can be set to define specific rate bases such as: Weight rate basis for
 * Kilogram, Container rate basis for Twenty Foot Equivalent or Time Period rate basis for Weeks
 */
@Data
@Jacksonized
@Builder
@JsonIgnoreProperties(ignoreUnknown = true)
public final class RateBasis {
  private RateBasisEnum rateBasisEnum;
  private final String rateBasisCode;
  private final String rateBasisName;
  private final String rateBasisDescription;
}
