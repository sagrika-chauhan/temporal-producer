package com.example.temporalproducer.bookingmodel;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

/** Maintains Business Function data. */
@Builder
@Getter
@Setter
public class AlternativeCodeOwner {

  private String partyCode;

  private String businessEntityCountryCode;

  private String businessEntityCode;

  private String businessEntityFunction;
}
