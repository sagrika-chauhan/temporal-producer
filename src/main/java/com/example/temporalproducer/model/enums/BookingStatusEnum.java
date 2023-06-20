package com.example.temporalproducer.model.enums;

/**
 * "Refers to the different status a Booking may have: \n\n- Pending: basically just a booking
 * number without any details - other than Shipper and Consignee\n- Booked: all required information
 * is fulfilled\n- Confirmed: Maersk has confirmed the Booking created by the Shipper\n- Cancelled:
 * Booking is actually cancelled."
 */
public enum BookingStatusEnum {
  DRAFT("DRAFT"),
  PENDING("PENDING"),
  BOOKED("BOOKED"),
  CONFIRMED("CONFIRMED"),
  CANCELLED("CANCELLED"),
  COMPLETED("COMPLETED");
  private final String bookingStatusEnumValue;

  BookingStatusEnum(String value) {
    this.bookingStatusEnumValue = value;
  }

  public String getBookingStatusEnumValue() {
    return bookingStatusEnumValue;
  }
}
