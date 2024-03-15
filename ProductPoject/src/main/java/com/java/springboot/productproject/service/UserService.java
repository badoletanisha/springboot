package com.java.springboot.productproject.service;

import org.springframework.http.ResponseEntity;

import com.java.springboot.productproject.entity.User;
import com.java.springboot.productproject.utility.ResponseStructure;

public interface UserService {

	ResponseEntity<ResponseStructure<User>> saveUser(User user);

}
