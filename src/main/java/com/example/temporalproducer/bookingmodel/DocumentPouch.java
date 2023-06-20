package com.example.temporalproducer.bookingmodel;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * Maintains DocumentPouch related information.
 */
@Builder
@Getter
@Setter
public class DocumentPouch {

  private String documentPouchNumber;
  private List<Reference> references;
  private List<Document> documents;
}
