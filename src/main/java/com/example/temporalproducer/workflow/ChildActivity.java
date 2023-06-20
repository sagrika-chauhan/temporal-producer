package com.example.temporalproducer.workflow;

import io.temporal.activity.ActivityInterface;
import io.temporal.activity.ActivityMethod;

@ActivityInterface
public interface ChildActivity {
    @ActivityMethod(name = "childActivity")
    String sendNotification(String greeting, String name);

}
