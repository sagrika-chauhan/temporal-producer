package com.example.temporalproducer.billingmodel;




import lombok.*;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class FinancialOrderDomain  {
    String orderNumber;

    String externalReferenceNumber;

    String bookingNumber;

    String soStatus;

    String soI;

    Integer invoiceId;

    Integer issuedDatetime;

    String financialOrderBusinessTyp;

    PaymentCondition paymentConditio;

    String agreementNumbe;

    List<Equipment> equipment;

    List<Parties> parties;

    List<Locations> locations;

    Brand brand;

    DocumentPouch documentPouch;

    List<FinancialOrderLine> financialOrderLine;

}


