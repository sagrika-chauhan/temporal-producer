package com.example.temporalproducer.controller;


import com.example.temporalproducer.billingmodel.FinancialOrderDomain;
import com.example.temporalproducer.mapper.BookingToBillingMapper;

import com.example.temporalproducer.mapper.ServicePlanRetrievalService;
import com.example.temporalproducer.serviceplan.ServicePlan;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

import net.apmoller.crb.telikos.activityplan.ActivityPlanEvent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
@Slf4j
@RequiredArgsConstructor
public class TestApi {
    @Autowired
    private ServicePlanRetrievalService service;

    @PostMapping("/mapToBooking")
    public Optional<ServicePlan> mapToBooking(
            @RequestBody ActivityPlanEvent activityPlanEvent) {
        return service.getServicePlan(activityPlanEvent);
    }
    @PostMapping("/mapToBilling")
    public FinancialOrderDomain mapToBilling(
            @RequestBody ActivityPlanEvent activityPlanEvent) {

        return BookingToBillingMapper.INSTANCE.convert(service.getServicePlan(activityPlanEvent).get());
    }
}
