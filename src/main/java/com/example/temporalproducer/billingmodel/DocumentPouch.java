package com.example.temporalproducer.billingmodel;


import lombok.Builder;

import java.util.List;

@Builder
public record DocumentPouch(

     String documentPouchNumber,

     List<Reference> references,

     List<Document> documents){
}
