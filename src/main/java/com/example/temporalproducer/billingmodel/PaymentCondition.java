package com.example.temporalproducer.billingmodel;



import lombok.Builder;

@Builder
public record PaymentCondition(

     PaymentTerm paymentTerm,

     CreditTerm creditTerm,

     String paymentMode){
}
