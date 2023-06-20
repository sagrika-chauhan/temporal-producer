package com.example.temporalproducer.billingmodel;


import lombok.Builder;


@Builder

public record ChargeType(

     String chargeTypeEnum,

     String chargeTypeCode,

     String chargeTypeName){
}
