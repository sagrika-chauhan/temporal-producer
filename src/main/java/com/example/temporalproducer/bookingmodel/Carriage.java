package com.example.temporalproducer.bookingmodel;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * Carriage holds relevant details on the actual transport.
 * i.e. schedules, vessel or other vehicle, voyage number, flight number, locations, etc.
 */
@AllArgsConstructor
@Data
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NAME,
    include = JsonTypeInfo.As.EXISTING_PROPERTY,
    property = "type")
@JsonSubTypes({
  @JsonSubTypes.Type(value = RailCarriage.class, name = "railCarriage"),
  @JsonSubTypes.Type(value = InlandWaterCarriage.class, name = "inlandWaterCarriage"),
  @JsonSubTypes.Type(value = RoadCarriage.class, name = "roadCarriage")
})
public abstract class Carriage {
  private final String carriageType;
}
