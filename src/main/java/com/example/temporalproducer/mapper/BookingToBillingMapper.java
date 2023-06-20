package com.example.temporalproducer.mapper;


import com.example.temporalproducer.billingmodel.FinancialOrderDomain;

import com.example.temporalproducer.serviceplan.ServicePlan;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper
public interface BookingToBillingMapper {
    BookingToBillingMapper INSTANCE = Mappers.getMapper(BookingToBillingMapper.class);
    @Mapping(target = "bookingNumber" , source = "booking.bookingNumber")
    @Mapping(target = "parties" , source = "booking.parties")
    FinancialOrderDomain convert(ServicePlan bookingPayload);
}

