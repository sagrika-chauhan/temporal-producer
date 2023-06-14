package com.example.temporalproducer.service;



import com.example.temporalproducer.models.ActivityPlanEventModel;

public interface EmailProducerService {
  public void produceEmail(ActivityPlanEventModel activityPlanEventModel);
}
