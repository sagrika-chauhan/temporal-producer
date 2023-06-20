package com.example.temporalproducer.controller;


import com.example.temporalproducer.bookingmodel.Booking;
import com.example.temporalproducer.models.ActivityPlanEventModel;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
@RequiredArgsConstructor
public class TestApi {
    @PostMapping("/map")
    public Booking publishMsg(@RequestBody ActivityPlanEventModel activityPlanEvent) throws JsonProcessingException {
        ObjectMapper objectMapper = new ObjectMapper();
        return objectMapper.readValue(activityPlanEvent.getDomainData(), Booking.class);
    }
}
