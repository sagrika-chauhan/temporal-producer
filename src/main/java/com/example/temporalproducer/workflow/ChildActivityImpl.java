package com.example.temporalproducer.workflow;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class ChildActivityImpl implements ChildActivity{

    @Override
    public String sendNotification(String greeting, String name) {
        log.info("Sending notification for : "+ greeting + " " + name);
        return  greeting + name;
    }
}
