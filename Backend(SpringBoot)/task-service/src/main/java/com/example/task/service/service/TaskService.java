package com.example.task.service.service;

import com.example.task.service.model.Task;
import com.example.task.service.model.TaskStatus;

import java.util.List;

public interface TaskService {
    Task createTask(Task task, String requesterRole) throws Exception;

    Task getTaskById(Long id) throws Exception;

    List<Task> getAllTasks(TaskStatus status, String sortByDeadline, String sortByCreatedAt);

    Task updateTask(Long id, Task updatedTask, Long userId) throws Exception;

    void deleteTask(Long id);

    Task assignedToUser(Long userId,Long taskId) throws Exception;

    List<Task> assignedUsersTask(Long userId,TaskStatus status, String sortByDeadline, String sortByCreatedAt);

    Task completeTask(Long taskId) throws Exception;

}
