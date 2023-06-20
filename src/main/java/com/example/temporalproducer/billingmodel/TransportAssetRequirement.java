package com.example.temporalproducer.billingmodel;


import lombok.Builder;


@Builder
public record TransportAssetRequirement(

     String equipmentSizeTypeCode,

     String equipmentHeightCode,

     String isoSizeTypeCode){
}
