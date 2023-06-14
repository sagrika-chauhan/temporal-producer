package com.example.temporalproducer.controller;


import com.example.temporalproducer.models.ActivityPlanEventModel;
import com.example.temporalproducer.service.EmailProducerService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * Contains headers and authorization to publish message.
 */
@RestController
@Slf4j
@RequiredArgsConstructor
public class Controller {

  @Autowired
  private EmailProducerService emailProducerService;

  @PostMapping("/publish")
  public void publishMsg(
      @RequestBody ActivityPlanEventModel activityPlanEvent) {
    emailProducerService.produceEmail(activityPlanEvent);
  }

}
