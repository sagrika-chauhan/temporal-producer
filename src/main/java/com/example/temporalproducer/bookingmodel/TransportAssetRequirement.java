package com.example.temporalproducer.bookingmodel;

import lombok.Builder;
import lombok.Getter;

import java.util.List;

/**
 * Defines what are the required transport assets (i.e. vehicles and/or equipment, such as
 * containers) for a given Service Plan, Service Plan Leg, Transport Order, or Carrier Booking.
 */
@Builder
@Getter
public final class TransportAssetRequirement {

  // Volume Unit Enum
  private final VolumeUnitEnum minimumVolumeCapacityUnit;
  // The type of asset requirement, e.g. Equipment or Vehicle.
  private TransportAssetRequirementTypeEnum transportAssetRequirementTypeEnum;
  //  Maersk combined size type code, e.g. 20REEF
  private String requiredEquipmentSizeTypeCode;
  // Vehicle type enum, e.g. BARGE, TRUCK or RAIL
  private RequiredVehicleTypeCodeEnum requiredVehicleTypeCode;
  // How many assets are required in terms of e.g. containers or vehicles that fulfill the
  // requirements stated"
  private Integer transportAssetQuantity;
  // the minimum required weight capacity that the transport asset must provide for related cargo
  private Integer minimumWeightCapacity;
  // Weight Unit Enum
  private WeightUnitEnum minimumWeightCapacitytUnit;
  // The minimum required volume capacity that the transport asset must provide for related cargo.
  private Integer minimumVolumeCapacity;
  // tells whether the requirement is for a refrigirated transport asset, e.g. reefer container or
  // refrigirated truck
  private Boolean isRefrigiratedAsset;
  // Whether the requirement has to be a refrigirated unit which is not actively refrigirated
  private Boolean isNonOperatingRefrigiratedAsset;
  // Tells whether the asset should have a genset mounted
  private Boolean isGensetRequired;
  // Indicates whether the transport asset requirement includes cold treatment or not. Set true if
  // there is cold treatment required, false otherwise. Details of cold treament can be given in
  // child structure for same
  private Boolean hasColdTreatmentRequirement;
  // Arrange cold treatment according to agreed SOP
  private String remark;
  // Number of ethylene filters that must be installed
  private Integer ethyleneFilterRequiredCount;
  // Indicates whether the drain holes in the asset must be openened.
  private Boolean isDrainHolesRequiredToBeOpen;
  // Indicates whether it is required to have CO2 treatment.
  private Boolean iscooTreatmentRequired;
  // Indicates whether it is required to have O2 treatment.
  private Boolean isooTreatmentRequired;
  // Indicates whether it is required to have N2 treatment.
  private Boolean isnnTreatmentRequired;
  // Indicates whether it is required to have data loggers installed in the asset.
  private Boolean isDataLoggerRequired;
  // Indicates whether it is required to have a security escort with the transport asset.
  private Boolean isSecurityEscortRequired;
  // The date and time that the interior fitting of the container is expected to be ready.
  private String containerInteriorFittingExpectedReady;
  // Indicates whether the container interior fitting must be handled by carrier. If this is set to
  // false and there is a container interior fitting associated it is expected that the interior
  // fitting is handled internally by Maersk.
  private Boolean isContainerInteriorFittingCarrierInstalled;
  // Fitting that go inside the container for e.g. garment on hangers or to partition cargo inside
  // the container.
  // Typically used for Garment on Hangers configurations that are sent to warehouse or carrier in
  // preparation for container loading.
  private ContainerInteriorFitting containerInteriorFitting;
  // Customer specified priorities for the equipment that they want for their shipments.
  private TransportAssetPriority transportAssetPriority;
  // All features pertaining to temperature control on an environment controlled asset,
  // e.g. a reefer container, a reefer truck, a cold storage warehouse, commodity etc.
  private TemperatureControl temperature;
  // All features pertaining to humidity control on an environment controlled asset, e.g. a reefer
  // container, a reefer truck, a cold storage warehouse, commodity etc.
  private HumidityControl humidity;
  // All features pertaining to ventilation control on an environment controlled asset, e.g. a
  // reefer container, a reefer truck, a cold storage warehouse, commodity etc.
  private VentilationControl ventilation;
  // All features pertaining to atmosphere control on an environment controlled asset, e.g. a reefer
  // container, a reefer truck, a cold storage warehouse, commodity etc.
  private AtmosphereControl atmosphere;
  // Any requirements regarding slot displacement, i.e. when cargoes and/or equipments exceed the
  // space within an equipment and/or vehicle. This includes:
  private SlotDisplacement outOfGauge;
  // Fumigation is a method of pest control, or the removal of harmful micro-organisms, by
  // completely filling an area with gaseous pesticides, or fumigants, to suffocate or poison the
  // pests within.
  private Fumigation fumigation;
  // Subclass for Dangerous Cargo Information that will be associated with a Transport Leg. See
  // super-class for more details.
  private TransportDangerousCargoInformation transportDangerousCargoInformation;
  // If true, then haulage is part of a larger convoy transport
  private Boolean isConvoyTransport;
  // Defines how cargo is to be loaded/unloaded. Typically used for inland transport modes (Road,
  // Rail, Inland Water).
  //
  // When used at Origin, it defines the Pickup Service. When used at Destination, it defines the
  // Delivery Service.
  //
  // The possible values are:
  // - Live Load/Unload: the vehicle, and/or container, is retained at loading/unloading premises
  // (i.e. factory, warehouse, transport hub, etc.), until it has been fully loaded/unloaded.
  // - Drop and Swap: the vehicle is not retained at loading/unloading premises (i.e. factory,
  // warehouse, transport hub, etc.) for the purpose of loading/unloading activities. Instead it
  // picks/drops a container, and only the container is retained for loading/unloading activities.
  // The same vehicle can, however, drop a container a pick another one, i.e. the so-called "swap".
  private PickupDeliveryServiceTypeEnum requiredPickUpService;
  // Defines how cargo is to be loaded/unloaded. Typically used for inland transport modes (Road,
  // Rail, Inland Water).
  //
  // When used at Origin, it defines the Pickup Service. When used at Destination, it defines the
  // Delivery Service.
  //
  // The possible values are:
  // - Live Load/Unload: the vehicle, and/or container, is retained at loading/unloading premises
  // (i.e. factory, warehouse, transport hub, etc.), until it has been fully loaded/unloaded.
  // - Drop and Swap: the vehicle is not retained at loading/unloading premises (i.e. factory,
  // warehouse, transport hub, etc.) for the purpose of loading/unloading activities. Instead it
  // picks/drops a container, and only the container is retained for loading/unloading activities.
  // The same vehicle can, however, drop a container a pick another one, i.e. the so-called "swap".
  private PickupDeliveryServiceTypeEnum requiredDeliveryService;
  // A Maersk internal grading of the quality and cleanliness of a shipping container. The grading
  // is given in accordance with Maersk Container Inspection Criteria (MCIC). A grade can be given
  // to for example indicate that the container is is acceptable for food shipment.
  //
  // There are 5 different grades currently in MERC+ to ensure Maersk customers have been provided
  // with the best suited equipment for their cargo needs.
  //
  // Grades:
  // S - Flexi-bags shipments and Premium Food grade
  // M - Food grade type shipments
  // K - General cargo - Clean container/Premium shipments
  // E - General cargo shipments
  // Q - Scrap cargo shipments
  private ContainerGrade containerGrade;
  // Covers inland business scenario, where customer already indicates, at time of booking/service
  // plan, what container numbers we are supposed to use
  private List<Container> containers;
}
