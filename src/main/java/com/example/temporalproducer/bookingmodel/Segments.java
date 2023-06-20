package com.example.temporalproducer.bookingmodel;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

/**
 * Maintains Segments related information.
 */
@Builder
@Getter
@Setter
public class Segments {

  private SegmentEnum segmentEnum;
  private ParentChildOwnerIndicatorEnum parentChildOwnerIndicator;
}
