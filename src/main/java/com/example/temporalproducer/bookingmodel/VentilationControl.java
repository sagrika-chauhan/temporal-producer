package com.example.temporalproducer.bookingmodel;

import lombok.Builder;
import lombok.NonNull;

/**
 * Maintains VentilationControl related information.
 */
@Builder
public class VentilationControl {

  // A set of features and information relating to control of environment settings, such as
  // temperature, ventilation, humidity or atmosphere.
  // Typically used for the proper conservation of goods and commodities which are otherwise
  // perishable or degradable, if not maintained under the specified environment conditions.
  // They can be applicable to either transport assets (containers, ULD's, trucks, aircrafts, etc.)
  // or storage assets (warehouses, etc.).
  @NonNull private EnvironmentControl environmentControl;
  @NonNull private VentilationControlProperties ventilationControlProperties;
}
