package com.example.temporalproducer.model;

import com.example.temporalproducer.model.enums.StandardReasonEnum;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Pre-defined standard reasons that can be applied when e.g.
 * raising an issue during Maersk process activities
 * (these could e.g. be Delay Reasons, Activity Handover Reason etc.)
 * or used as standard reason why status change on a business object etc.
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@JsonIgnoreProperties(ignoreUnknown = true)
public class StandardReason {
  private String standardReasonName;
  private StandardReasonEnum standardReasonEnum;
}
