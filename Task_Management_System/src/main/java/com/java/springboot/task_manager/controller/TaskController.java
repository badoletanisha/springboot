package com.java.springboot.task_manager.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import com.java.springboot.task_manager.entity.Task;
import com.java.springboot.task_manager.service.TaskService;
import com.java.springboot.task_manager.utility.ResponseStructure;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
public class TaskController {
	@Autowired
	private TaskService taskService;

	@PostMapping("/tasks/createTask")
	public ResponseEntity<ResponseStructure<Task>> createTask(@RequestBody Task task) {
		return taskService.createTask(task);
	}
	@GetMapping("/tasks/getTaskById")
	public Task getTaskById(@RequestParam int taskId) {
		return taskService.getTaskById(taskId);

	}
	@GetMapping("/tasks/assigningTask")
	public Task assigningTask(String priority){
		return taskService.assigningTask(priority);
	}
	@PutMapping("/tasks/updateTask")
	public Task updateTask(@RequestParam int taskId,@RequestBody Task task){
		return taskService.updateTask(taskId, task);
	}
	
	@DeleteMapping("/tasks/deleteTask")
	public Task deleteTask(@RequestParam int taskId){
		return taskService.deleteTask(taskId);
	}
	
	@GetMapping("/tasks/getAllTasks")
	public ResponseEntity<ResponseStructure<List<Task>>> getAllTasks() {
		return taskService.getAllTasks();
	}
	
	
}
