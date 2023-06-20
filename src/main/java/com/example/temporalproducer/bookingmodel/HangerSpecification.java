package com.example.temporalproducer.bookingmodel;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

/**
 * Provides skeleton for HangerSpecification related information.
 */
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NAME,
    include = JsonTypeInfo.As.EXISTING_PROPERTY,
    property = "type")
@JsonSubTypes({
  @JsonSubTypes.Type(
      value = GarmentOnHangerStrapSpecification.class,
      name = "garmentOnHangerStrapSpecification"),
  @JsonSubTypes.Type(
      value = GarmentOnHangerStringSpecification.class,
      name = "garmentOnHangerStringSpecification"),
  @JsonSubTypes.Type(
      value = GarmentOnHangerDirectBarSpecification.class,
      name = "garmentOnHangerDirectBarSpecification")
})
public interface HangerSpecification {}
