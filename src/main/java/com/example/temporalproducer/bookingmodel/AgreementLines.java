package com.example.temporalproducer.bookingmodel;

import lombok.Builder;
import lombok.Getter;
import lombok.NonNull;
import lombok.Setter;

import java.util.List;

/** AgreementLines model class in domain layer to get charges. */
@Builder
@Getter
@Setter
public class AgreementLines {
  @NonNull private List<Charge> charges;
}
