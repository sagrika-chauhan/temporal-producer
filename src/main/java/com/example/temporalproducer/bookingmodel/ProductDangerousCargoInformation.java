package com.example.temporalproducer.bookingmodel;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

/**
 * Subclass for Dangerous Cargo Information that will be associated with either a Customer Product,
 * a Customer Order Line, a Shipper Booking Line, or a Shipping Instruction Line.
 */
@Builder
@Getter
@Setter
public class ProductDangerousCargoInformation {
  // Descriminator for the data object PRODUCT_DANGEROUS_CARGO_INFORMATION
  private HazardousClassification hazardousClassification;
  // Number of pacakges containing dangerous cargo.
  private Integer dangerousPackageQuantity;
  // Package unit, e.g. CARTON or PALLET"
  private ItemUnitEnum dangerousPackageQuantityUnit;
  // Emergencycontacts
  private String emergencyContacts;

  // A specific value for a measurement, e.g. a flash point of 150 degrees celcius of a chemical
  private Integer flashPoint;
}
