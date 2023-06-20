package com.example.temporalproducer.bookingmodel;

import jakarta.validation.constraints.NotNull;
import lombok.Builder;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

/**
 * A schema for associating locations to data objects.
 *
 * <p>Example from Customer Order Line**
 *
 * <p>A Customer Order Line (COL) can specify a number of desired locations for the transport. These
 * typically are sent via EDI with the COL to Maersk.
 *
 * <p>Examples: - Free on Board Point - Destination - FCR Requested release location - FCR Actual
 * release location
 */
@Getter
@Builder
@RequiredArgsConstructor
public final class LocationAssociation {
  /** An enum value for the location function e.g. PORT_OF_DISCHARGE Pattern : ^[A-Z0-9_]+$ */
  @NotNull private final LocationFunctionEnum locationFunctionEnum;
  /** A relationship to a geographical location, e.g. site, city, facility or country */
  @NotNull private final Location location;
}
