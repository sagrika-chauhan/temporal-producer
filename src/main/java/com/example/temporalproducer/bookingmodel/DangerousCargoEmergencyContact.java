package com.example.temporalproducer.bookingmodel;

import lombok.Builder;

/**
 * It's always mandatory for Dangerous Cargo to have at least 1 occurrence of a contact information
 * for emergency cases.
 *
 * <p>- Unstructured Format: i.e. free text, and then all information is stored in field "Emergency
 * Contact Information".
 *
 * <p>- Structured Format: whereby these fields will be used:
 */
@Builder
public class DangerousCargoEmergencyContact {
  // Person Name (mandatory if giving specific fields)
  private String emergencyContactPerson;
  // Phone (mandatory if giving specific fields)
  private String emergencyContactPhone;
  // Fax (optional)
  private String emergencyContactFax;
  // Mobile (optional)
  private String emergencyContactMobile;
  // Email (optional)
  private String emergencyContactEmail;
  // Contact Information (optional -- can still be used for any additional free text)
  private String emergencyContactInformation;
  // Placeholder sub-schema only including foreign key. Can be redefined in an extension schema to
  // refer to full schema.
  private EmergencyContactParty emergencyContactParty;
}
