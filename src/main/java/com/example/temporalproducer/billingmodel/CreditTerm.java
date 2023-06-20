package com.example.temporalproducer.billingmodel;



import lombok.Builder;

@Builder
public record CreditTerm(

     String creditTermCode,

     String creditTermName,

     String creditTermEnum){
}
