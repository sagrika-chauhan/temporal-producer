package com.example.temporalproducer.workflow;

import io.temporal.workflow.SignalMethod;
import io.temporal.workflow.WorkflowInterface;
import io.temporal.workflow.WorkflowMethod;
@WorkflowInterface
public interface ChildWorkFlow {
    @WorkflowMethod
    void composeGreeting(String greeting, String name);

    @SignalMethod
    void greetingSent(String greeting , String name);
}