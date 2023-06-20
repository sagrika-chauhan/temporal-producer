package com.example.temporalproducer.billingmodel;

import lombok.Builder;

import java.util.List;

@Builder
public record FinancialOrderDomain  (

        String orderNumber,

        String externalReferenceNumber,

        String bookingNumber,

        String soStatus,

        String soId,

        Integer invoiceId,

        Integer issuedDatetime,

        String financialOrderBusinessType,

        PaymentCondition paymentCondition,

        String agreementNumber,

        List<Equipment> equipment,

        List<Parties> parties,

        List<Locations> locations,

        Brand brand,

        DocumentPouch documentPouch,

        List<FinancialOrderLine> financialOrderLine ){
}
