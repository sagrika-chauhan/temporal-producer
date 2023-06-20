package com.example.temporalproducer.bookingmodel;

import lombok.Builder;
import lombok.NonNull;

/**
 * All features pertaining to temperature control on an environment controlled asset, e.g. a reefer
 * container, a reefer truck, a cold storage warehouse, commodity etc.
 */
@Builder
public class TemperatureControl {

  // A set of features and information relating to control of environment settings, such as
  // temperature, ventilation, humidity or atmosphere.
  // Typically used for the proper conservation of goods and commodities which are otherwise
  // perishable or degradable, if not maintained under the specified environment conditions.
  // They can be applicable to either transport assets (containers, ULD's, trucks, aircrafts, etc.)
  // or storage assets (warehouses, etc.).
  @NonNull private EnvironmentControl environmentControl;
  @NonNull private TemperatureControlProperties temperatureControlProperties;
}
