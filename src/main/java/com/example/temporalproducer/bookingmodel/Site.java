package com.example.temporalproducer.bookingmodel;

import lombok.Builder;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

/**
 * Maintains Site related information.
 */
@RequiredArgsConstructor
@Getter
@Builder
public final class Site {
  /**
   * The Maersk code for a site, e.g. CNYATTRM, concatenated from country-, city- and function code
   * and (can be one-to-one with facility code!)
   */
  private final String siteCode;
  /** The name of the site, e.g. Yantian Terminal */
  private final String siteName;
}
