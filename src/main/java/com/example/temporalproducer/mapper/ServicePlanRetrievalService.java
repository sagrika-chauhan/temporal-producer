package com.example.temporalproducer.mapper;

import com.example.temporalproducer.model.Booking;
import com.example.temporalproducer.serviceplan.ActivityPlanRequest;
import com.example.temporalproducer.serviceplan.ServicePlan;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import net.apmoller.crb.telikos.activityplan.ActivityPlanEvent;
import org.springframework.stereotype.Component;

import java.util.*;

/**
 * Class to extract service plan from activity plan event.
 */
@Slf4j
@Component
@RequiredArgsConstructor
public class ServicePlanRetrievalService {

  private final ObjectMapper objectMapper;

  /**
   * Get Service plan.
   *
   * @param activityPlanEvent activityPlanEvent
   * @return Service Plan
   */
  public Optional<ServicePlan> getServicePlan(ActivityPlanEvent activityPlanEvent) {
    Optional<ServicePlan> servicePlan = Optional.empty();

    try {
      Optional<String> domainData = Optional.ofNullable(activityPlanEvent.getDomainData());
      if (domainData.isPresent()) {
        ActivityPlanRequest activityPlanRequest =
            objectMapper.readValue(domainData.get(), ActivityPlanRequest.class);
        servicePlan = Optional.ofNullable(activityPlanRequest.getServicePlan());
      }
    } catch (JsonProcessingException ex) {
      log.error(
          "ServicePlanRetrievalService:: Issue in reading activityPlanEvent domain data value  "
              + "for order id {} with error{}",
          activityPlanEvent.getOrderId(),
          ex.getMessage());
    }
    return servicePlan;
  }

  /**
   * Get Booking.
   *
   * @param activityPlanEvent activityPlanEvent
   * @return booking
   */
  public Optional<Booking> getBooking(ActivityPlanEvent activityPlanEvent) {
    Optional<Booking> booking = Optional.empty();
    Optional<ServicePlan> servicePlanData = getServicePlan(activityPlanEvent);
    if (servicePlanData.isPresent()) {
      booking = Optional.ofNullable(servicePlanData.get().getBooking());
    }
    return booking;
  }

}
