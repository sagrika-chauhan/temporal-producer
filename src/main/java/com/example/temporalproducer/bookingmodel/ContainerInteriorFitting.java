package com.example.temporalproducer.bookingmodel;

import lombok.Builder;
import lombok.Getter;

import java.util.List;

/**
 * Fitting that go inside the container.
 * for e.g. garment on hangers or to partition cargo inside the container.
 * Typically used for Garment on Hangers configurations that are sent to
 * warehouse or carrier in preparation for container loading.
 */
@Builder
@Getter
public class ContainerInteriorFitting {

  private String containerInteriorFittingName;
  private Integer totalDunnageWeight;
  private String specifiedByPartyCode;
  private String equipmentSizeTypeCode;
  private ProtectiveLining protectiveLining;
  private List<GarmentOnHangerTier> garmentOnHangerTiers;
  // List of partitions to insert in the container
  private List<Partition> partitions;
  private ContainerFloor containerFloor;
}
