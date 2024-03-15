package com.java.springboot.productproject.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.java.springboot.productproject.entity.User;

public interface UserRepo extends JpaRepository<User, Integer>{

}
