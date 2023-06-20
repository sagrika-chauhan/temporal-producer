package com.example.temporalproducer.billingmodel;


import lombok.Builder;

import java.util.List;

@Builder
public record FinancialOrderLine(

     Charge charge,

     List<TransportEvent> transportEvents,

     List<Parties> parties,

     List<Locations> locations){
}
