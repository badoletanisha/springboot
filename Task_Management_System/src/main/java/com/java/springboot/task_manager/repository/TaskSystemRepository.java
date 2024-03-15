package com.java.springboot.task_manager.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.java.springboot.task_manager.entity.TaskSystem;
@Repository
public interface TaskSystemRepository extends JpaRepository<TaskSystem, Integer>{

}
