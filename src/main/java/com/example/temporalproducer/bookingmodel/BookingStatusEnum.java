package com.example.temporalproducer.bookingmodel;

/**
 * Refers to the different status a Booking may have.
 * Pending: basically just a booking number without any details - other than Shipper and Consignee.
 * Booked: all required information is fulfilled
 * Confirmed: Maersk has confirmed the Booking created by the Shipper
 * Cancelled: Booking is actually cancelled
 */
public enum BookingStatusEnum {
  DRAFT("DRAFT"),
  PENDING("PENDING"),
  BOOKED("BOOKED"),
  CONFIRMED("CONFIRMED"),
  CANCELLED("CANCELLED"),
  COMPLETED("COMPLETED"),
  ALL("ALL");
  private final String bookingStatus;

  BookingStatusEnum(String value) {
    this.bookingStatus = value;
  }

  public String getBookingStatusEnum() {
    return bookingStatus;
  }
}
