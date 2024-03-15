package com.java.springboot.task_manager.service;

import java.util.List;

import org.springframework.http.ResponseEntity;
import com.java.springboot.task_manager.entity.Priority;
import com.java.springboot.task_manager.entity.TaskSystem;
import com.java.springboot.task_manager.utility.ResponseStructure;

public interface TaskSystemService {

	ResponseEntity<ResponseStructure<Priority>> addTaskSystem(TaskSystem taskSystem);

	ResponseEntity<ResponseStructure<List<Priority>>> getAllTaskSystem();

	TaskSystem deleteTaskSystem(int systemId) ;

	TaskSystem updateTaskSystem(int systemId, TaskSystem updateTaskSystem) ;

	TaskSystem getTaskSystemById(int systemId) ;

}
