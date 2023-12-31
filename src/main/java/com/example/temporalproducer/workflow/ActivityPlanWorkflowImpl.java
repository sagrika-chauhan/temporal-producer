package com.example.temporalproducer.workflow;

import com.example.temporalproducer.models.ActivityPlanEventModel;
import io.temporal.activity.ActivityOptions;
import io.temporal.common.RetryOptions;
import io.temporal.workflow.ActivityStub;
import io.temporal.workflow.ChildWorkflowOptions;
import io.temporal.workflow.Workflow;
import lombok.extern.slf4j.Slf4j;

import java.time.Duration;

@Slf4j
public class ActivityPlanWorkflowImpl implements ActivityPlanWorkflow{
  @Override
  public void startWorkflow(ActivityPlanEventModel activityPlan) {
    ActivityOptions activityOptions=ActivityOptions.newBuilder()
      .setTaskQueue("sendEmail")
      .setStartToCloseTimeout(Duration.ofMinutes(30))
      .setRetryOptions(
        RetryOptions.newBuilder()
          .setInitialInterval(Duration.ofSeconds(20))
          .build()
      )
      .build();

    ActivityStub activityStub=io.temporal.workflow.Workflow.newUntypedActivityStub(activityOptions);
    log.info("activityPlan sent from temporal for bookingId " + activityPlan.getBookingId());
    var activityPlanEvent=activityStub
      .executeAsync("sendEmail",ActivityPlanEventModel.class,activityPlan).get();
    //activity name , return type of the activity ,data
    log.info("email response:{}",activityPlanEvent.getEventName());

    //triggering childWorkFlow from parent workflow
    ChildWorkFlow child = Workflow.newChildWorkflowStub(ChildWorkFlow.class,
            ChildWorkflowOptions.newBuilder()
                    .setWorkflowId("ChildWorkFlow" + activityPlan.getBookingId())
                    .setTaskQueue("emailProducer")
                    .build());
    // This is a blocking call that returns only after child has completed.
    child.composeGreeting("Greeting BookingId", activityPlan.getBookingId() );

  }

}
