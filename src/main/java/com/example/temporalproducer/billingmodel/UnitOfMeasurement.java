package com.example.temporalproducer.billingmodel;


import lombok.Builder;


@Builder
public record UnitOfMeasurement(

     String unitOfMeasurementCode,

     String unitOfMeasurementName,

     String unitOfMeasurementSymbol){
}
