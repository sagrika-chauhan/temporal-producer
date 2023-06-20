package com.example.temporalproducer.billingmodel;



import lombok.Builder;


@Builder
public record Locations (

     Location location,

     String locationFunction){

}
