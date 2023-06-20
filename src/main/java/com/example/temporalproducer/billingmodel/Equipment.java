package com.example.temporalproducer.billingmodel;




import lombok.Builder;

import java.util.List;

@Builder
public record Equipment(

     List<CommodityCode> commodityCodes,

     TransportAssetRequirement transportAssetRequirement){
}
