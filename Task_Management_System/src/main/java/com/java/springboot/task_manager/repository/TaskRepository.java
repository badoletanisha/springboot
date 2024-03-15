package com.java.springboot.task_manager.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.java.springboot.task_manager.entity.Task;

@Repository
public interface TaskRepository extends JpaRepository<Task, Integer>{

	Optional<Task> findByPriority(String priority);

	 public Task getTaskById(int taskId);

	

}
