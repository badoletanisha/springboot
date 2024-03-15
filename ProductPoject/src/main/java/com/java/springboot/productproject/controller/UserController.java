package com.java.springboot.productproject.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.java.springboot.productproject.entity.User;
import com.java.springboot.productproject.service.UserService;
import com.java.springboot.productproject.utility.ResponseStructure;

@RestController
public class UserController {


	private UserService userService;


	public UserController(UserService userService) {
		super();
		this.userService = userService;
	}


	@PostMapping("/users")
	public ResponseEntity<ResponseStructure<User>> saveUser(@RequestBody User user){
		return userService.saveUser(user);

	}

}
