package com.example.temporalproducer.controller;


import com.example.temporalproducer.billingmodel.FinancialOrderDomain;
import com.example.temporalproducer.mapper.BookingToBillingMapper;
import com.example.temporalproducer.model.Booking;

import com.example.temporalproducer.models.ActivityPlanEventModel;
import com.example.temporalproducer.service.ServicePlanRetrievalService;
import com.example.temporalproducer.serviceplan.ServicePlan;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
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
