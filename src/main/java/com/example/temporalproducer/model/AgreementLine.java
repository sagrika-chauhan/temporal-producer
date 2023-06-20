package com.example.temporalproducer.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * An allOf schema for Agreement Line that should be used when $ref to the Agreement Line. The
 * reason is that AgreementLineBase.json is used in allOf by e.g. Demurrage and Detention Agreement
 * Line and the AgreementLineBase.json therefore cannot be set to additionalProperties=false. This
 * schema provides the disallowance of additional properties, so that validation can be done
 * correctly, where the entire Agreement Line object is needed.
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@JsonIgnoreProperties(ignoreUnknown = true)
public class AgreementLine {
  List<Charge> charges;
}
