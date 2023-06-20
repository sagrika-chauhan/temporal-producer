package com.example.temporalproducer.bookingmodel;

import lombok.Builder;

/** Contains possible values for substances that may be used in the fumigation process. */
@Builder
public class FumigationSubstance {
  // This is a code that identifies what substance is to be used in fumigating the container.
  private String fumigationSubstanceCode;
  // The name of an entry in 'Fumigation Substance'. This holds the substance name that is
  // associated with the Fumigation Substance Code value.
  private String fumigationSubstanceName;
}
