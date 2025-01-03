package com.example.executor_demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.task.TaskExecutor;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

import java.util.concurrent.CompletableFuture;

@Service
public class AsyncService {

    private final TaskExecutor taskExecutor;
    private final UserService userService;

    @Autowired
    public AsyncService(TaskExecutor taskExecutor, UserService userService) {
        this.taskExecutor = taskExecutor;
        this.userService = userService;
    }

    @Async
    public void executeAsyncTask(Runnable task) {
        taskExecutor.execute(task);
    }

    @Async
    public CompletableFuture<String> performTask() {
        return CompletableFuture.supplyAsync(() -> {
            // Simulate a long-running task
            String userDetails = userService.getUser();
            return "Task completed with user: " + userDetails;
        }, taskExecutor);
    }
}
