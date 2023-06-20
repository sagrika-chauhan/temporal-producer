package com.example.temporalproducer.billingmodel;


import lombok.Builder;


@Builder

public record CommodityCode(

     String commodityCode,

     String commodityName){
}
