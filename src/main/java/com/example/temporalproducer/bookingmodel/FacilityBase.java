package com.example.temporalproducer.bookingmodel;

import jakarta.validation.constraints.NotNull;
import lombok.Builder;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

/**
 * A facility is a building, construction or installation designed to serve a specific function.
 * Facility can be linked to subsidiary Facilities within its hierarchy to enable high-level
 * multi-function Facilities (such as Terminals) to be made up of subsidiaries such as Container
 * Terminals, Container Yards, Warehouses, Customs Buildings, Railheads, and Docks. **Note:** To
 * allow for backwards compatability some Facilities will be one-to-one with Sites. In these cases
 * the unique code of the Facility should be the same as the Site. For example for Vessel Schedules
 * it is necessary to have the Maritime Container Terminals like UNYCTRM which is also a Site due
 * Maersk legacy master data. The Site can still have multiple other Facilities associated without
 * the same code. **Note**: We deliberately allow additional properties on this schema because it is
 * used in allOf compositions elsewhere and JSON schema only able to look at immidiate sibling and
 * as Facility is allOf Persitable any schemas using allOf Facility will not be able to set
 * additionalProperties to false to enforce that rule
 */
@Getter
@RequiredArgsConstructor
@Builder
public class FacilityBase {
  /**
   * Maersk unique code for a Facility, e.g. USNYCTRM, concatenated of country-, city- and function
   * code.
   */
  @NotNull private final String facilityCode;

  /**
   * Types of Facilities, e.g. OPERATIONAL Note that there can be many types which are not depicted
   * as specific subtypes of Facility. If they carry no specific attributes there is little reason
   * to subtype.
   */
  @NotNull private final FacilityTypeEnum facilityType;
}
