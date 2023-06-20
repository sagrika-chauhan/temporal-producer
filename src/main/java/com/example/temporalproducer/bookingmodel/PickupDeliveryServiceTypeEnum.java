package com.example.temporalproducer.bookingmodel;

/**
 * Defines how cargo is to be loaded/unloaded. Typically used for inland transport modes (Road,
 * Rail, Inland Water).
 *
 * <p>When used at Origin, it defines the Pickup Service. When used at Destination, it defines the
 * Delivery Service.
 *
 * <p>The possible values are: - Live Load/Unload: the vehicle, and/or container, is retained at
 * loading/unloading premises (i.e. factory, warehouse, transport hub, etc.), until it has been
 * fully loaded/unloaded. - Drop and Swap: the vehicle is not retained at loading/unloading premises
 * (i.e. factory, warehouse, transport hub, etc.) for the purpose of loading/unloading activities.
 * Instead it picks/drops a container, and only the container is retained for loading/unloading
 * activities. The same vehicle can, however, drop a container a pick another one, i.e. the
 * so-called "swap".
 */
public enum PickupDeliveryServiceTypeEnum {
  DROP_AND_SWAP("DROP_AND_SWAP"),
  LIVE_LOAD_UNLOAD("LIVE_LOAD_UNLOAD");
  private final String pickupDeliveryService;

  PickupDeliveryServiceTypeEnum(String value) {
    this.pickupDeliveryService = value;
  }

  public String getPickupDeliveryServiceType() {
    return pickupDeliveryService;
  }
}
