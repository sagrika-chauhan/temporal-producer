package com.example.temporalproducer.bookingmodel;

import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

/** Represents a position in longitude, latitude and altitude . */
@Getter
@Builder
@AllArgsConstructor
public final class Position {
  /**
   * Longitude is a geographic coordinate  .
   * That specifies the east–west position of a point on the Earth's surface
   */
  @Min(value = -180)
  @Max(value = 180)
  private final Integer longitude;

  /**
   * Latitude is a geographic coordinate .
   * That specifies the north–south position of a point on the Earth's surface
   */
  @Min(value = -90)
  @Max(value = 90)
  private final Integer latitude;
}
