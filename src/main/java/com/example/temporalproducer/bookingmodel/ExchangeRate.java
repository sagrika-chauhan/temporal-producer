package com.example.temporalproducer.bookingmodel;

import lombok.Builder;
import lombok.Getter;

/**
 * Maintains ExchangeRate related constants.
 */
@Builder
@Getter
public class ExchangeRate {
  private String unitCurrency;
  private Integer unitCurrencyRatio;
  private String quotationCurrency;
  private Integer quotationCurrencyRatio;
  private String quotationDateTime;
  private Integer exchangeRate;
  private String exchangeRateTypeCode;
}
