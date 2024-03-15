package com.java.springboot.task_manager.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.java.springboot.task_manager.entity.Priority;
import com.java.springboot.task_manager.service.PriorityService;
import com.java.springboot.task_manager.utility.ResponseStructure;

@RestController
public class PriorityController {
@Autowired
private PriorityService priorityService;

@GetMapping("/priority/addPriority")
public ResponseEntity<ResponseStructure<Priority>> addPriority(@RequestParam Priority priority)  {
	return priorityService.addPriority(priority);	
}

@PostMapping("/priority/getPriorityById")
public Priority getPriorityById(@RequestParam int priorityId) {
	return priorityService.getPriorityById(priorityId);
	
}


@PutMapping("/priority/updatePriority")
public Priority updatePriority(@RequestParam int priorityId,@RequestBody Priority priority) {
	return priorityService.updatePriority(priorityId, priority);
}

@DeleteMapping("/priority/deletePriority")
public Priority deletePriority(int priorityId)  {
	return priorityService.deletePriority(priorityId);
	
}

@GetMapping("/priority/getAllPriorities")
public ResponseEntity<ResponseStructure<List<Priority>>> getAllPriorities()  {
	return priorityService.getAllPriorities();
}

}
