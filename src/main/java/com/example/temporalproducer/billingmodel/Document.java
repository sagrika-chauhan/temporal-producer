package com.example.temporalproducer.billingmodel;



import lombok.Builder;


@Builder
public record Document(

     String documentNumber,

     String documentName,

     String documentStatus,

     String documentType){
}
