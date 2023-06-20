package com.example.temporalproducer.bookingmodel;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

/**
 * Maintains Site related information.
 */
@Data
@AllArgsConstructor
@Builder
public final class SiteInfra {
  /**
   * The Maersk code for a site, e.g. CNYATTRM, concatenated from country-, city- and function code
   * and (can be one-to-one with facility code!)
   */
  private final String siteCode;
  /** The name of the site, e.g. Yantian Terminal */
  private final String siteName;
}
