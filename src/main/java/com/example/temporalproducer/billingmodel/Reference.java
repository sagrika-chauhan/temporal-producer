package com.example.temporalproducer.billingmodel;

import lombok.Builder;


@Builder
public record Reference(

     String reference,

     String referenceTypeCode,

     String referenceTypeName,

     String referenceTypeEnum){
}
