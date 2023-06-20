package com.example.temporalproducer.bookingmodel;

import com.fasterxml.jackson.annotation.JsonTypeName;
import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;

/**
 * Maintains RailCarriage related information.
 */
@Getter
@JsonTypeName("railCarriage")
@EqualsAndHashCode
public class RailCarriage extends Carriage {

  private final String railScheduleLocationStart;
  private final String railScheduleLocationEnd;

  @Builder
  public RailCarriage(
      String carriageType, String railScheduleLocationStart, String railScheduleLocationEnd) {
    super(carriageType);
    this.railScheduleLocationStart = railScheduleLocationStart;
    this.railScheduleLocationEnd = railScheduleLocationEnd;
  }
}
