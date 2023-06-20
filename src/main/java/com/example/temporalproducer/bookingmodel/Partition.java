package com.example.temporalproducer.bookingmodel;

import lombok.Builder;

/** A divider installed in the container to split e.g. carton boxes and bulk load. */
@Builder
public class Partition {

  // This is Distance From Container Tail
  private Integer distanceFromContainerTail;
}
