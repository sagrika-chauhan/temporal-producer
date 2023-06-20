package com.example.temporalproducer.bookingmodel;

import lombok.Builder;

/**
 * Customer specified priorities for the equipment that they want for their shipments.
 *
 * <p>Example: - Customer may send us 2 TAR for the same Shipment/Booking/etc. - One TAR being for 3
 * dry 40" containers - Another TAR being for 4 dry 20" containers - Then first TAR has priority
 * name "high" and group "black friday" - Second TAR has priority name "low" and group "regular
 * season" - This then means, for carrier, that he should prioritise ensuring the 3 dry 40" over the
 * 4 dry 20" containers.
 */
@Builder
public class TransportAssetPriority {

  // Group of the priority, e.g. BLACK FRIDAY
  private String transportAssetPriorityGroupName;
  // Name of the priority, e.g. HIGH, DELIVERY IN ONE DAY
  private String transportAssetPriorityName;
}
