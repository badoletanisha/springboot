package com.java.springboot.task_manager.service;

import java.util.List;
import org.springframework.http.ResponseEntity;
import com.java.springboot.task_manager.entity.Priority;
import com.java.springboot.task_manager.utility.ResponseStructure;

public interface PriorityService {


	ResponseEntity<ResponseStructure<Priority>> addPriority(Priority priority);
	Priority getPriorityById(int priorityId);
	Priority updatePriority(int priorityId, Priority updatePriority) ;
	Priority deletePriority(int priorityId);
	ResponseEntity<ResponseStructure<List<Priority>>> getAllPriorities();



}
