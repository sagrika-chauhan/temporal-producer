package com.example.temporalproducer.bookingmodel;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

/**
 * Maintains ISO Language related information.
 */
@Builder
@Getter
@Setter
public class Language {
  private String isoLanguageCode;
}
