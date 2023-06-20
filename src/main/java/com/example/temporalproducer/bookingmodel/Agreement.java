package com.example.temporalproducer.bookingmodel;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/** Defines agreementNumber and agreementLines. */
@Getter
@Builder
@Setter
public final class Agreement {
  private final String agreementNumber;
  private List<AgreementLines> agreementLines;
}
