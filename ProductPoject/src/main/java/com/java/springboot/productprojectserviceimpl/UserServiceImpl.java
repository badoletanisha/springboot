package com.java.springboot.productprojectserviceimpl;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import com.java.springboot.productproject.entity.User;
import com.java.springboot.productproject.repository.UserRepo;
import com.java.springboot.productproject.service.UserService;
import com.java.springboot.productproject.utility.ResponseStructure;

public class UserServiceImpl  implements UserService{

	private UserRepo userRepo;
	
	private ResponseStructure<User>  structure;
 	
	@Override
	public ResponseEntity<ResponseStructure<User>> saveUser(User user) {
		User uinqueUser = userRepo.save(user);
		
		return ResponseEntity.ok(structure.setStatuscode(HttpStatus.OK.value())
				.setMessage("")
				.setData(uinqueUser));
	}

}
