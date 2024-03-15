package com.java.springboot.task_manager.serviceimpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.java.springboot.task_manager.entity.Task;
import com.java.springboot.task_manager.exception.ListOfTaskNotFoundException;
import com.java.springboot.task_manager.exception.TaskNotCreatedException;
import com.java.springboot.task_manager.exception.TaskNotDeletedException;
import com.java.springboot.task_manager.exception.TaskNotFoundByIdException;
import com.java.springboot.task_manager.exception.TaskNotFoundByPriorityException;

import com.java.springboot.task_manager.exception.TaskNotUpdatedByIdException;
import com.java.springboot.task_manager.repository.TaskRepository;
import com.java.springboot.task_manager.service.TaskService;
import com.java.springboot.task_manager.utility.ResponseStructure;

@Service
public class TaskServiceImpl implements TaskService {

	@Autowired
	private TaskRepository taskRepository;

	@Override
	public ResponseEntity<ResponseStructure<Task>> createTask(Task task) {
		Task savedTask = taskRepository.save(task);

		if (savedTask == null) {
			throw new TaskNotCreatedException("Failed to create task.");
		}

		ResponseStructure<Task> responseStructure = new ResponseStructure<>();
		responseStructure.setStatuscode(HttpStatus.CREATED.value());
		responseStructure.setMessage("Task Created Successefully!!");
		responseStructure.setData(savedTask);
		return new ResponseEntity<ResponseStructure<Task>>(responseStructure, HttpStatus.CREATED);
	}

	@Override
	public Task getTaskById(int taskId) {
		Optional<Task> byId = taskRepository.findById(taskId);
		if (byId.isPresent()) {
			return byId.get();
		} else {
			throw new TaskNotFoundByIdException("Task not found with ID");
		}
	}

	@Override
	public Task assigningTask(String priority) {
		Optional<Task> byPriority = taskRepository.findByPriority(priority);
		if (byPriority.isPresent()) {
			return byPriority.get();

		} else {
			throw new TaskNotFoundByPriorityException("Task not found with priority ");
		}
	}

	@Override
	public Task updateTask(int taskId, Task updateTask) {

		Optional<Task> optional = taskRepository.findById(taskId);
		if (optional.isPresent()) {
			Task givenTask = optional.get();
			updateTask.setTaskId(givenTask.getTaskId());
			return optional.get();
		}
		else {
			throw new TaskNotUpdatedByIdException("Task not updated ");
		}
	}

	@Override
	public Task deleteTask(int taskId) {
		Optional<Task> optional = taskRepository.findById(taskId);
		if(optional.isPresent()) {
			Task deleteTask = optional.get();
			taskRepository.delete(deleteTask);
			return optional.get();
		}
		else {
			throw new TaskNotDeletedException("Task not Deleted");
		}
	}

	@Override
	public ResponseEntity<ResponseStructure<List<Task>>> getAllTasks() {
		List<Task>tasksList =taskRepository.findAll();
		if(tasksList.isEmpty()) {
			throw new ListOfTaskNotFoundException("List Of task");
		}
		else {
			ResponseStructure<List<Task>> responseStructure =new ResponseStructure<>();
			responseStructure.setStatuscode(HttpStatus.FOUND.value());
			responseStructure.setMessage("get all the task ");
			responseStructure.setData(tasksList);
			return new ResponseEntity<ResponseStructure<List<Task>>>(responseStructure,HttpStatus.FOUND);
		}
	}






}
