package com.example.temporalproducer.billingmodel;

import lombok.Builder;


@Builder
public record PaymentTerm(

     String paymentTermCode,

     String paymentTermName,

     String paymentTermEnum){
}
