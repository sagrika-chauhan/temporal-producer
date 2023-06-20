package com.example.temporalproducer.bookingmodel;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

/**
 * Maintains SalesAccounts related information.
 */
@Builder
@Getter
@Setter
public class SalesAccounts {
  private String salesAccountCode;

  private String salesAccountName;
}
