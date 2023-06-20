package com.example.temporalproducer.billingmodel;


import lombok.Builder;


@Builder
public record TransportEvent(

     String timestamp,

     String eventTiming,

     String eventTrigger){
}
