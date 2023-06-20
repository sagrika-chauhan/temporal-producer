package com.example.temporalproducer.billingmodel;

import lombok.Builder;

@Builder
public record  Party (

     String partyCode,

     String partyName,

     String partyMasterRole){
}
