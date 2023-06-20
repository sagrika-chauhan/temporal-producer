package com.example.temporalproducer.model;

import com.example.temporalproducer.model.enums.EventTimingEnum;
import com.example.temporalproducer.model.enums.EventTriggerEnum;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


/**
 * "A date-time with timing set to "EXPECTED" and "REQUIRED_PICK_UP."
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@JsonIgnoreProperties(ignoreUnknown = true)
public class ServiceDate {

  private String timeStamp;
  private EventTimingEnum eventTiming;
  private EventTriggerEnum eventTrigger;

}
