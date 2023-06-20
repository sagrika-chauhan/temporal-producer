package com.example.temporalproducer.workflow;

import com.example.temporalproducer.models.ActivityPlanEventModel;
import io.temporal.activity.ActivityOptions;
import io.temporal.common.RetryOptions;
import io.temporal.workflow.ActivityStub;
import io.temporal.workflow.Workflow;
import lombok.extern.slf4j.Slf4j;

import java.time.Duration;

@Slf4j
public class ChildWorkFlowImpl implements ChildWorkFlow{
    private final RetryOptions retryoptions = RetryOptions.newBuilder().setInitialInterval(Duration.ofSeconds(1))
            .setMaximumInterval(Duration.ofSeconds(100)).setBackoffCoefficient(2).setMaximumAttempts(50000).build();
    private final ActivityOptions options = ActivityOptions.newBuilder().setStartToCloseTimeout(Duration.ofSeconds(30))
            .setRetryOptions(retryoptions).build();

    private final ChildActivity activity = Workflow.newActivityStub(ChildActivity.class, options);
    public boolean isGreetingSent = false;
    @Override
    public void composeGreeting(String greeting, String name) {
        log.info("Executing child workFlow with name " + name);
        greetingSent(greeting,name);
        Workflow.await(()->isGreetingSent);
        log.info("ChildWorkFlowCompleted " );

    }

    @Override
    public void greetingSent(String greeting, String name) {
        ActivityOptions activityOptions=ActivityOptions.newBuilder()
                .setTaskQueue("ChildTaskQueue")
                .setStartToCloseTimeout(Duration.ofMinutes(30))
                .setRetryOptions(
                        RetryOptions.newBuilder()
                                .setInitialInterval(Duration.ofSeconds(20))
                                .build()
                )
                .build();

        ActivityStub activityStub=io.temporal.workflow.Workflow.newUntypedActivityStub(activityOptions);
        log.info("greeting sent from temporal for name " + name);
        var response=activityStub
                .executeAsync("childActivity", String.class,greeting + " " + name).get();
        //activity name , return type of the activity ,data
        log.info("child response :{}",response);
        activity.sendNotification(greeting,name);
        isGreetingSent=true;

    }
}
