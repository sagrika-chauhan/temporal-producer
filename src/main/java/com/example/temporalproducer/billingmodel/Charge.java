package com.example.temporalproducer.billingmodel;




import lombok.Builder;

import java.util.List;


@Builder
public record Charge(

     String unitPrice,

     String unitPriceCurrency,

     String amount,

     String amountCurrency,

     RateBasis rateBasis,

     ChargeType chargeType,

     String chargeClassification,

     String isPaid,

     String isToBeChargedBack,

     String taxRate,

     String priceCalculationDate,

     List<Parties> parties,

     Product product,

     Reference references){
}
