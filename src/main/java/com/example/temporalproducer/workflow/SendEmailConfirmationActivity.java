package com.example.temporalproducer.workflow;


import com.example.temporalproducer.models.ActivityPlanEventModel;
import io.temporal.activity.ActivityInterface;
import io.temporal.activity.ActivityMethod;

@ActivityInterface
public interface SendEmailConfirmationActivity {
  @ActivityMethod(name = "sendEmail")
  ActivityPlanEventModel emailSend(ActivityPlanEventModel activityPlan);
}
