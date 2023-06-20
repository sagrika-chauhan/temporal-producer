package com.example.temporalproducer.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

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
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@JsonIgnoreProperties(ignoreUnknown = true)
public class LocationAssociation {
  /** An enum value for the location function e.g. PORT_OF_DISCHARGE Pattern : ^[A-Z0-9_]+$ */
  private String locationFunction;
  /** A relationship to a geographical location, e.g. site, city, facility or country */
  private Location location;
}
