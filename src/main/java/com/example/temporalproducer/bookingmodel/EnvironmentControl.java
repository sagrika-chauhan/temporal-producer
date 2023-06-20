package com.example.temporalproducer.bookingmodel;

import lombok.Builder;

/**
 * A set of features and information relating to control of environment settings, such as
 * temperature, ventilation, humidity or atmosphere.
 *
 * <p>Typically used for the proper conservation of goods and commodities which are otherwise
 * perishable or degradable, if not maintained under the specified environment conditions.
 *
 * <p>They can be applicable to either transport assets (containers, ULD's, trucks, aircrafts, etc.)
 * or storage assets (warehouses, etc.).
 */
@Builder
public class EnvironmentControl {

  // Count of probes for the environment control. Required or actually used.
  private Integer probeCount;
  // The subtype of environment control.
  private EnvironmentControlTypeEnum environmentControlType;
}
