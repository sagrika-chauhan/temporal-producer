package com.example.temporalproducer.billingmodel;


import lombok.Builder;


@Builder
public record RateBasis(

     String rateBasisEnum,

     String rateBasisCode,

     String rateBasisName,

     UnitOfMeasurement unitOfMeasurement){
}
