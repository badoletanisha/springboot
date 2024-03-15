package com.java.springboot.task_manager.service;

import java.util.List;

import org.springframework.http.ResponseEntity;

import com.java.springboot.task_manager.entity.Task;
import com.java.springboot.task_manager.utility.ResponseStructure;

public interface TaskService {

public ResponseEntity<ResponseStructure<Task>> createTask(Task task);	
public Task getTaskById(int taskId);
public Task assigningTask(String taskPriority);
public Task updateTask(int taskId,Task updateTask);
public Task deleteTask(int taskid);
//public ResponseEntity<TaskResponseStructure<Task>> completedTask(String taskAssigned_to);
//public ResponseEntity<TaskResponseStructure<Task>> filteringTaskByStatus(String Status);
public ResponseEntity<ResponseStructure<List<Task>>> getAllTasks();


}




//getAllTasks(): Retrieve all tasks.
//getTaskById(long id): Retrieve a task by its unique identifier.
//createTask(Task task): Create a new task.
//updateTask(Task task): Update an existing task.
//deleteTask(long id): Delete a task by its unique identifier.
//Additional methods depending on your specific requirements, such as methods 
//for assigning tasks, marking tasks as completed, filtering tasks by status, etc.