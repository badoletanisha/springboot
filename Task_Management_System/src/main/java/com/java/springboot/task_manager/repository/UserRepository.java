package com.java.springboot.task_manager.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.java.springboot.task_manager.entity.User;
@Repository
public interface UserRepository extends JpaRepository<User, Integer>{

	

	Optional<User> findByUsername(String username);

	

	@Query("SELECT user FROM User user WHERE user.userId = :userId")
	User getUserById(@Param("userId") int userId);



	Optional<User> findByEmail(String email);


}
