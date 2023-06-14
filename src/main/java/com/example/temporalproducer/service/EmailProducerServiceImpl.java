package com.example.temporalproducer.service;

import com.example.temporalproducer.models.ActivityPlanEventModel;
import com.example.temporalproducer.worker.TemporalWorker;
import com.example.temporalproducer.workflow.ActivityPlanWorkflow;
import io.temporal.client.WorkflowClient;
import io.temporal.client.WorkflowOptions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmailProducerServiceImpl implements EmailProducerService{

  @Autowired
  private TemporalWorker worker;
  @Override
  public void produceEmail(ActivityPlanEventModel activityPlanEvent) {
    ActivityPlanWorkflow activityPlanWorkflow = worker.getClient().newWorkflowStub(
      ActivityPlanWorkflow.class,
      WorkflowOptions.newBuilder()
        .setTaskQueue("emailProducer").setWorkflowId(activityPlanEvent.getBookingId()).build());
    WorkflowClient.start(activityPlanWorkflow::startWorkflow,activityPlanEvent);
  }
}
