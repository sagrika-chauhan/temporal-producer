package com.example.temporalproducer.billingmodel;

import lombok.Builder;


@Builder
public record Facility(

     String facilityCode,

     String facilityCountryCode,

     String facilityName){
}
