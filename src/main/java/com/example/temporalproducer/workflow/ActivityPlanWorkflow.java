package com.example.temporalproducer.workflow;

import com.example.temporalproducer.models.ActivityPlanEventModel;
import io.temporal.workflow.WorkflowInterface;
import io.temporal.workflow.WorkflowMethod;


@WorkflowInterface
public interface ActivityPlanWorkflow {

  @WorkflowMethod
  void startWorkflow(ActivityPlanEventModel activityPlan);
}
