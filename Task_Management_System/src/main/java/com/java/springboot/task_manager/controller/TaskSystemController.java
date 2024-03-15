package com.java.springboot.task_manager.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.java.springboot.task_manager.entity.Priority;
import com.java.springboot.task_manager.entity.TaskSystem;

import com.java.springboot.task_manager.service.TaskSystemService;
import com.java.springboot.task_manager.utility.ResponseStructure;
@RestController
public class TaskSystemController {
	@Autowired
	private TaskSystemService taskSystemService;
	@GetMapping("/taskSystem/addTaskSystem")
	public ResponseEntity<ResponseStructure<Priority>> addTaskSystem(@RequestBody TaskSystem taskSystem)  {
		return taskSystemService.addTaskSystem(taskSystem);	
	}
	

	
	@PostMapping("/taskSystem/getTaskSystemById")
	public TaskSystem getTaskSystemById(int systemId)  {
		return taskSystemService.getTaskSystemById(systemId);
	}
	
	@PutMapping("/taskSystem/getTaskSystemById")
	public TaskSystem updateTaskSystem(int systemId,TaskSystem updateTaskSystem)  {
		return taskSystemService.updateTaskSystem(systemId, updateTaskSystem);
		
	}
	@DeleteMapping("/taskSystem/deleteTaskSystem")
	public TaskSystem deleteTaskSystem(int systemId) {
		return taskSystemService.deleteTaskSystem(systemId);
		
	}
	@GetMapping("/taskSystem/getAllTaskSystem")
	public ResponseEntity<ResponseStructure<List<Priority>>> getAllTaskSystem() {
		return taskSystemService.getAllTaskSystem();
		
	}
}
