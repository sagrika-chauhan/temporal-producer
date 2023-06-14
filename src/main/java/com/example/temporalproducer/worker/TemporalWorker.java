package com.example.temporalproducer.worker;

import com.example.temporalproducer.workflow.ActivityPlanWorkflowImpl;
import com.maersk.composition.service.TemporalClientProvider;
import io.temporal.client.WorkflowClient;
import io.temporal.worker.WorkerFactory;
import io.temporal.worker.WorkerFactoryOptions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class TemporalWorker implements ApplicationRunner {

  WorkflowClient client;
  WorkerFactory factory;

  @Autowired
  private TemporalClientProvider temporalClientProvider;
  @Override
  public void run(ApplicationArguments args) throws Exception {
    client = temporalClientProvider.getTemporalClientInstance();
    WorkerFactoryOptions workerFactoryOptions = temporalClientProvider.getWorkerFactoryOptions();

    factory = WorkerFactory.newInstance(client, workerFactoryOptions);

    io.temporal.worker.Worker worker = factory.newWorker("emailProducer");//creating a worker using factory
    worker.registerWorkflowImplementationTypes(ActivityPlanWorkflowImpl.class);//register our workflow implementation
    factory.start();// starts our worker
  }

  public WorkflowClient getClient(){
    return client;
  }
}
