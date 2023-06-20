package com.example.temporalproducer.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * "All references relevant to the pouch, e.g. booking numbers, bill of lading numbers, packing list
 * numbers etc."
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@JsonIgnoreProperties(ignoreUnknown = true)
public class Reference {

  private String reference;
  private String referenceTypeCode;
  private String referenceTypeName;
  private String referenceTypeEnum;
}
