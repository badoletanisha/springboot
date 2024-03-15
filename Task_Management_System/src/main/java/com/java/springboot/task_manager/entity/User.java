package com.java.springboot.task_manager.entity;



import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import jakarta.persistence.OneToMany;

@Entity
public  class User  {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
private int userId;
private String username;
private String email;
private String password;
private String full_name;
@OneToMany
private List<Task> tasks = new ArrayList<>();


public List<Task> getListTask() {
	return tasks;
}
public void setListTask(List<Task> listTask) {
	this.tasks = listTask;
}
public String getFull_name() {
	return full_name;
}

public void setFull_name(String full_name) {
	this.full_name = full_name;
}
private String role;
public int getUserId() {
	return userId;
}
public void setUserId(int userId) {
	this.userId = userId;
}
public String getUsername() {
	return username;
}
public void setUsername(String username) {
	this.username = username;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}

public String getRole() {
	return role;
}
public void setRole(String role) {
	this.role = role;
}

public void createTask(Task task) {
	task.add(task);
	task.setUser(this);
}

}

/*
 * - id: Unique identifier for the user
   - username: Username of the user
   - email: Email address of the user
   - password: Password for the user's account (if applicable)
   - full_name: Full name of the user
   - role: Role or position of the user in the system (e.g., admin, regular user)

 */
