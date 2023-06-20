package com.example.temporalproducer.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * A generic association to support both master and transactional data associations to Commodity
 * Classifications. Holds any related commodity classifications on the transactional classes it
 * relates to.
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@JsonIgnoreProperties(ignoreUnknown = true)
public class CommodityCodes {
  private String commodityCode;
  private String commodityName;
}
