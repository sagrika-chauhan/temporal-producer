package com.example.temporalproducer.bookingmodel;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.validation.constraints.Min;
import lombok.*;

import java.util.List;

/**
 * Maintains Booking related information.
 */
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@JsonIgnoreProperties(ignoreUnknown = true)
public class Booking {
  // The number of the booking, e.g. 23423456
  private String bookingNumber;

  // List of booking lines.
  private List<BookingLine> bookingLines;
  // Unique identification of a party, e.g. full BE code for a Carrier
  private String owningOfficePartyCode;
  // When the document was issued
  private String issuedDatetime;
  // Unique number for the service plan
  private String servicePlanNumber;
  // A document, e.g. copies, can be part of multiple document pouches.
  private List<DocumentPouch> documentPouches;
  // All internal and external reference numbers relevant for the booking.
  private List<Reference> references;
  // Any free text additional info on booking cancellation
  private BookingCancellation bookingCancellation;

  // Parties of relevance to the data object.\n\nE.g. used for seller, buyer and other filing
  // related parties
  private List<Party> parties;
  // mode of communication between parties
  private CommunicationMediaType submitChannel;
  // Mode of communication between parties
  private CommunicationMediaType receiveChannel;
  // Refers to the different status a Booking may have
  private BookingStatusEnum bookingStatus;

  /*Total number of packages, derived from lines*/
  @Min(0)
  private Integer totalBookedPackageQuantity;
  // Item weight unit
  private ItemUnitEnum totalBookedPackageQuantityUnit;
  private ItemUnitEnum totalBookedItemQuantityUnit;

  /*Total number of items (aka. products or commodities), derived from lines.*/
  @Min(0)
  private Integer totalBookedItemQuantity;
  /*Booked total net net weight of all cargo, derived from lines.*/
  @Min(0)
  private Integer totalBookedNetNetWeight;
  // Item weight unit
  private ItemUnitEnum totalBookedNetNetWeightUnit;
  private ItemUnitEnum totalBookedVolumeUnit;
  //Total number of all cargo, derived from lines
  @Min(0)
  private Integer totalBookedVolume;

  // The summarized shipping window based on line level details.\n\nExamples: Latest ship date,
  // expected ship date,
  // estimated delivery date, actual delivery date, expected client delivery date, expected delivery
  // date
  private List<ShippingWindow> shippingWindowList;

  // List of instructions for the booking//
  private String instructions;
}
