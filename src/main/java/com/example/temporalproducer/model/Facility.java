package com.example.temporalproducer.model;

import com.example.temporalproducer.model.enums.FacilityTypeEnum;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.util.List;


/**
 * An allOf schema for Facility that should be used when $ref to the Facility. The reason is that
 * FacilityBase.json is used in allOf by e.g. Airport and ContainerFreightStation and the
 * FacilityBase.json therefore cannot be set to additionalProperties=false. This schema provides the
 * disallowance of additional properties, so that validation can be done correctly, where the entire
 * Facility object is needed
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@JsonIgnoreProperties(ignoreUnknown = true)
public class Facility {
  private String facilityCode;
  private String facilityCountryCode;
  private String facilityCityCode;
  private String facilityName;
  private FacilityTypeEnum facilityType;
  private PostalAddress postalAddress;
  /*"All postal addressed associated with the party",*/
  private List<String> emailAddresses;
  private List<TelecommunicationNumber> telecommunicationNumbers;
  private Person person;

}
