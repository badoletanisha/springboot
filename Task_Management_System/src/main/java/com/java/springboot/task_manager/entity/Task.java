package com.java.springboot.task_manager.entity;

import java.util.Set;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
@Entity
public class Task {	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private int taskId;
	private String taskTitle;
	private String taskDescription;
	private String priority;
	private String taskStatus;
	private String taskCategory;
	@ManyToMany(mappedBy = "tasks")
	private Set<User> taskAssignedTo;
	private String taskDueDate;
	
	
	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public int getTaskId() {
		return taskId;
	}


	public void setTaskId(int taskId) {
		this.taskId = taskId;
	}


	public String getTaskTitle() {
		return taskTitle;
	}


	public void setTaskTitle(String taskTitle) {
		this.taskTitle = taskTitle;
	}


	public String getTaskDescription() {
		return taskDescription;
	}


	public void setTaskDescription(String taskDescription) {
		this.taskDescription = taskDescription;
	}


	public String getPriority() {
		return priority;
	}


	public void setPriority(String priority) {
		this.priority = priority;
	}


	public String getTaskStatus() {
		return taskStatus;
	}


	public void setTaskStatus(String taskStatus) {
		this.taskStatus = taskStatus;
	}


	public String getTaskCategory() {
		return taskCategory;
	}


	public void setTaskCategory(String taskCategory) {
		this.taskCategory = taskCategory;
	}


	public Set<User> getTaskAssignedTo() {
		return taskAssignedTo;
	}


	public void setTaskAssignedTo(Set<User> taskAssignedTo) {
		this.taskAssignedTo = taskAssignedTo;
	}


	public String getTaskDueDate() {
		return taskDueDate;
	}


	public void setTaskDueDate(String taskDueDate) {
		this.taskDueDate = taskDueDate;
	}


	public void add(Task task) {
		// TODO Auto-generated method stub

	}


	public void setUser(User user) {
		// TODO Auto-generated method stub
		
	}


}

////1. *Task class*:
////   - id: Unique identifier for the task
////   - title: Title or name of the task
////   - description: Description of the task
////   - priority: Priority level of the task (e.g., high, medium, low)
////   - status: Current status of the task (e.g., pending, in progress, completed)
////   - category: Category or type of the task
////   - assigned_to: User assigned to the task
////   - due_date: Deadline for the task
//
