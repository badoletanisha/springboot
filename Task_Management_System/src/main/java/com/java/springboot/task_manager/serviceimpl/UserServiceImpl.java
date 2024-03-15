package com.java.springboot.task_manager.serviceimpl;

import java.util.List;
import java.util.Optional;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.java.springboot.task_manager.entity.Task;
import com.java.springboot.task_manager.entity.User;
import com.java.springboot.task_manager.exception.AssignedUsersForTaskNotFoundByException;
import com.java.springboot.task_manager.exception.IncorrectpasswordException;

import com.java.springboot.task_manager.exception.ListOfUserNotFoundByException;
import com.java.springboot.task_manager.exception.RemoveUserFromTaskNotFoundByException;
import com.java.springboot.task_manager.exception.TaskForUserNotFoundByException;
import com.java.springboot.task_manager.exception.UserEmailNotFoundByException;
import com.java.springboot.task_manager.exception.UserNotCreatedException;
import com.java.springboot.task_manager.exception.UserNotDeleteByIdException;
import com.java.springboot.task_manager.exception.UserNotFoundByIdException;
import com.java.springboot.task_manager.exception.UserNotFoundByUsernameException;
import com.java.springboot.task_manager.exception.UserNotFoundByassingTaskException;
import com.java.springboot.task_manager.exception.UserNotUpdatedByIdException;
import com.java.springboot.task_manager.repository.TaskRepository;
import com.java.springboot.task_manager.repository.UserRepository;
import com.java.springboot.task_manager.service.UserService;
import com.java.springboot.task_manager.utility.ResponseStructure;

@Service
public class UserServiceImpl implements UserService{

	@Autowired
	private UserRepository userRepository;
	private TaskRepository taskRepository; // Autowire TaskRepository



	@Override
	public ResponseEntity<ResponseStructure<User>> createUser(User user) {
		User savedUser =userRepository.save(user);
		if(savedUser == null) {
			throw new UserNotCreatedException("Failed to create User");
		}
		else {
			ResponseStructure<User> responseStructure = new ResponseStructure<>();
			responseStructure.setStatuscode(HttpStatus.CREATED.value());
			responseStructure.setMessage("Task Created Successefully!!");
			responseStructure.setData(savedUser);
			return new ResponseEntity<ResponseStructure<User>>(responseStructure, HttpStatus.CREATED);
		}
	}
	@Override
	public User getUserById(int userId) {
		Optional<User> byId = userRepository.findById(userId);
		if(byId.isPresent()) {
			return byId.get();
		}
		else {	
			throw new UserNotFoundByIdException("user not found by id");
		}

	}
	@Override
	public User updateUser(int userId,User updatedUser) {
		Optional<User> byId = userRepository.findById(userId);
		if(byId.isPresent()) {
			User existingUser =byId.get();
			updatedUser.setUserId(existingUser.getUserId());
			return userRepository.save(updatedUser);
		}else {
			throw new UserNotUpdatedByIdException("User not updated by ID");
		}
	}

	@Override
	public User deleteUser(int userId) {
		Optional<User> optional = userRepository.findById(userId);
		if(optional.isPresent()) {
			User deleteUser = optional.get();
			userRepository.delete(deleteUser);
			return optional.get();
		}
		else {
			throw new UserNotDeleteByIdException("User not Deleted ");
		}
	}

	@Override
	public User getUserByUsername(String username, String password) {
		Optional<User> optional = userRepository.findByUsername(username);
		if (optional.isPresent()) {
			User user = optional.get();
			if (((User) user).getPassword().equals(password)) {
				return user;
			} 
			else {
				throw new IncorrectpasswordException("Incorrect password");
			}
		} 
		else {
			throw new UserNotFoundByUsernameException("User not found");
		}
	}	

	@Override
	public List<Task> getTasksForUser(int userId) {
		Optional<User> optional =userRepository.findById(userId);
		if(optional.isPresent()) {
			User user =optional.get();
			return user.getListTask();
		}
		else {
			throw new TaskForUserNotFoundByException("Task not found with ID");
		}
	}
	@Override
	public User assignTask(int userId, int taskId) {
		Optional<User> optionalUser =userRepository.findById(userId);
		if(optionalUser.isPresent()) {
			User user =optionalUser.get();
			Optional<Task> optionalTask =taskRepository.findById(taskId);
			if (optionalTask.isPresent()) {
				Task task = optionalTask.get();
				user.createTask(task);
				userRepository.save(user); // Assuming user.createTask() doesn't save the user automatically
				return user;
			}
		}
		throw new UserNotFoundByassingTaskException("");
	}
	@Override
	public Set<User> getAssignedUsersForTask(int taskId) {
		Optional<Task> optionalTask = taskRepository.findById(taskId);
		if(optionalTask.isPresent()) {
			Task task = optionalTask.get();
			Set<User> assignedUsers = task.getTaskAssignedTo();

			return assignedUsers;
		}
		throw new AssignedUsersForTaskNotFoundByException("");
	}
	@Override
	public User removeUserFromTask(int userId, int taskId) {
		Optional<User> optionalUser = userRepository.findById(userId);
		if (optionalUser.isPresent()) {
			User user = optionalUser.get();

			// Find the task in the user's task list
			Optional<Task> optionalTask = user.getListTask().stream()
					.filter(task -> task.getTaskId() == taskId)
					.findFirst();

			if (optionalTask.isPresent()) {
				Task task = optionalTask.get();
				// Remove the task from the user's task list
				user.getListTask().remove(task);

				// Save the updated user
				return userRepository.save(user);
			}
		}

		throw new RemoveUserFromTaskNotFoundByException("");
	}
	@Override
	public User getUserByEmail(String email) {
		Optional<User> optionalUser =userRepository.findByEmail(email);
		if(optionalUser.isPresent()) {
//			User user =optionalUser.get();
			return optionalUser.get();
		}
		throw new UserEmailNotFoundByException("user not found by id");
	}
	@Override
	public ResponseEntity<ResponseStructure<List<User>>>getAllUsers() {
		List<Task>ListOfTask =taskRepository.findAll();
		if(ListOfTask.isEmpty()) {
			throw new ListOfUserNotFoundByException("List Of task");
		}
		else {
		ResponseStructure<List<User>> responseStructure =new ResponseStructure<>();
			responseStructure.setStatuscode(HttpStatus.FOUND.value());
			responseStructure.setMessage("get all the task ");
			responseStructure.setListOfTask(ListOfTask);
			return new ResponseEntity<ResponseStructure<List<User>>>(responseStructure,HttpStatus.FOUND);
		}		

	}

}




