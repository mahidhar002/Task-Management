package com.example.task_submission_service.service;

import com.example.task_submission_service.model.TaskDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestHeader;

@FeignClient(name="SUBMISSION-SERVICE", url="http://localhost:5002/")
public interface TaskService {
    @GetMapping("/api/tasks/{id}")
    public TaskDTO getTaskById(@PathVariable Long id,
                               @RequestHeader("Authorization") String jwt);

    @PutMapping("/api/tasks/{id}/complete")
    public TaskDTO completeTask(@PathVariable Long id);
}
