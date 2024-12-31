package com.example.executor_demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.task.TaskExecutor;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

import java.util.concurrent.CompletableFuture;

@Service
public class AsyncService {

    private final TaskExecutor taskExecutor;

    @Autowired
    public AsyncService(TaskExecutor taskExecutor) {
        this.taskExecutor = taskExecutor;
    }

    @Async
    public void executeAsyncTask(Runnable task) {
        taskExecutor.execute(task);
    }

    @Async
    public CompletableFuture<String> performTask() {
        return CompletableFuture.supplyAsync(() -> {
            // Simulate a long-running task
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
            return "Task Completed";
        }, taskExecutor);
    }
}
