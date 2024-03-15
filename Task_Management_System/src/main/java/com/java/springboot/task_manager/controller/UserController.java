package com.java.springboot.task_manager.controller;

import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;


import com.java.springboot.task_manager.entity.Task;
import com.java.springboot.task_manager.entity.User;
import com.java.springboot.task_manager.service.UserService;
import com.java.springboot.task_manager.utility.ResponseStructure;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.PutMapping;

@RestController
public class UserController {
	@Autowired
	private UserService userService;

	@PostMapping("/users/createUser")
	public ResponseEntity<ResponseStructure<User>> createUser(@RequestBody User user ) {
		return userService.createUser(user);
	}

	@GetMapping("/users/getUserById")
	public  User getUserById(@RequestParam  int userId) {
		return userService.getUserById(userId);
	}
	@PutMapping("/users/updateUser")
	public User updateUser(@RequestParam int userId, @RequestBody User user) {
		return userService.updateUser(userId, user);
	}
	@DeleteMapping("/users/deleteUser")
	public User deleteUser(@RequestParam int userId) {
		return userService.deleteUser(userId);
	}

	@PostMapping("/users/getTasksForUser")
	public List<Task> getTasksForUser(@RequestParam int userId) {
		return userService.getTasksForUser(userId);
	}

	@GetMapping("/users/getAssignedUsersForTask")
	public  Set<User> getAssignedUsersForTask(@RequestParam  int taskId) {
		return  userService.getAssignedUsersForTask(taskId);
	}

	@GetMapping("/users/removeUserFromTask")
	public User removeUserFromTask(@RequestParam int userId,@RequestParam int taskId) {
		return userService.removeUserFromTask(userId, taskId);
		
	}
	@GetMapping("/users/getUserByEmail")
	public User getUserByEmail(String email) {
		return userService.getUserByEmail(email);
	}
	
	@GetMapping("/users/getAllUser")
	public ResponseEntity<ResponseStructure<List<User>>> getAllUser(){
		return userService.getAllUsers();
	}
	
//	@PostMapping("/users/loginUser")
//	public User loginUser(@RequestBody LoginRequest loginRequest )
//	{String username = loginRequest.getUsername();
//	String password = loginRequest.getPassword();
//	return userService.loginUser(username, password);	
//	}
//	@PostMapping("/users/getUserByUsername")
//	public ResponseEntity<User> getUserByUsername(@RequestBody LoginRequest loginRequest ){
//		User user = userService.getUserByUsername(loginRequest.getUsername(), loginRequest.getPassword());
//		if (user != null) {
//			return ResponseEntity.ok(user);
//		} else {
//			return  ResponseEntity.status(HttpStatus.UNAUTHORIZED).body(null);
//		}
//	}
}




























