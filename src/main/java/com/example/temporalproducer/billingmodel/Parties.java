package com.example.temporalproducer.billingmodel;



import lombok.Builder;


@Builder
public record Parties(

     String partyFunction,

     Party party){

}
