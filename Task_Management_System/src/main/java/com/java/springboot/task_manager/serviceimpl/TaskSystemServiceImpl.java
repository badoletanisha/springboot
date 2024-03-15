package com.java.springboot.task_manager.serviceimpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.java.springboot.task_manager.entity.Priority;
import com.java.springboot.task_manager.entity.TaskSystem;
import com.java.springboot.task_manager.exception.AddpriorityNotFoundException;
import com.java.springboot.task_manager.exception.DeletedeleteTaskSystemNotFoundException;
import com.java.springboot.task_manager.exception.ListOfTaskSystemNotFoundException;
import com.java.springboot.task_manager.exception.TaskSystemByIdNotFoundException;
import com.java.springboot.task_manager.exception.TaskSystemNotUpdateByIdNotFoundException;
import com.java.springboot.task_manager.repository.TaskSystemRepository;
import com.java.springboot.task_manager.service.TaskSystemService;
import com.java.springboot.task_manager.utility.ResponseStructure;
@Service
public class TaskSystemServiceImpl implements TaskSystemService{
	@Autowired 
	private TaskSystemRepository taskSystemRepository;

	@Override
	public ResponseEntity<ResponseStructure<Priority>> addTaskSystem(TaskSystem taskSystem) {
		TaskSystem saveTaskSystem =taskSystemRepository.save(taskSystem);
		if(saveTaskSystem == null) {
			throw new AddpriorityNotFoundException(" Failed to add priority");
		}
		else {
			ResponseStructure<Priority> responseStructure =new ResponseStructure<>();
			responseStructure.setStatuscode(HttpStatus.CREATED.value());
			responseStructure.setMessage("category add successfully");
			responseStructure.setSaveTaskSystem(saveTaskSystem);		
			return new ResponseEntity<ResponseStructure<Priority>>(responseStructure,HttpStatus.CREATED);

		}
	}

	@Override
	public TaskSystem getTaskSystemById(int systemId)   {
		Optional<TaskSystem> taskSystemOptional =taskSystemRepository.findById(systemId);
		if(taskSystemOptional.isPresent()) {
			return taskSystemOptional.get();
		}
		else {
			
		}
		throw new TaskSystemByIdNotFoundException("");
	}

	@Override
	public TaskSystem updateTaskSystem(int systemId,TaskSystem updateTaskSystem)  {
		Optional<TaskSystem> optionalPriority = taskSystemRepository.findById(systemId);
		if(optionalPriority.isPresent()) {
			TaskSystem exixtingupdateTaskSystem = optionalPriority.get();
			exixtingupdateTaskSystem.setSystemId(systemId);

			return taskSystemRepository.save(exixtingupdateTaskSystem);
			}
		throw new TaskSystemNotUpdateByIdNotFoundException("");
		}
		
		



	@Override
	public TaskSystem deleteTaskSystem(int systemId)  {
		Optional<TaskSystem> optionalTaskSystem = taskSystemRepository.findById(systemId);
		if (optionalTaskSystem.isPresent()) {
			TaskSystem deleteTaskSystem = optionalTaskSystem.get();
			taskSystemRepository.delete(deleteTaskSystem);
			return deleteTaskSystem;
		}
		throw new  DeletedeleteTaskSystemNotFoundException(""); 
		
	}


	@Override
	public ResponseEntity<ResponseStructure<List<Priority>>> getAllTaskSystem() {
		List<TaskSystem> taskSystemList = taskSystemRepository.findAll(); 
		if(taskSystemList.isEmpty()) {
			throw new ListOfTaskSystemNotFoundException(" List of category");
		}
		else {
			ResponseStructure<List<Priority>> responseStructure =new ResponseStructure<>();
			responseStructure.setStatuscode(HttpStatus.FOUND.value());
			responseStructure.setMessage("get all the task ");
			responseStructure.setTaskSystemList(taskSystemList);
			return new ResponseEntity<ResponseStructure<List<Priority>>>(responseStructure,HttpStatus.FOUND);
		}
	}


}
