package com.java.springboot.task_manager.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class TaskSystem {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int systemId;
	private String systemName;
	private double systemVersion;
	private String systemUsers;
	private String systemTasks;
	private String categories;
	private String priorities;
	
	public int getSystemId() {
		return systemId;
	}
	public void setSystemId(int systemId) {
		this.systemId = systemId;
	}
	public String getSystemName() {
		return systemName;
	}
	public void setSystemName(String systemName) {
		this.systemName = systemName;
	}
	public double getSystemVersion() {
		return systemVersion;
	}
	public void setSystemVersion(double systemVersion) {
		this.systemVersion = systemVersion;
	}
	public String getSystemUsers() {
		return systemUsers;
	}
	public void setSystemUsers(String systemUsers) {
		this.systemUsers = systemUsers;
	}
	public String getSystemTasks() {
		return systemTasks;
	}
	public void setSystemTasks(String systemTasks) {
		this.systemTasks = systemTasks;
	}
	public String getCategories() {
		return categories;
	}
	public void setCategories(String categories) {
		this.categories = categories;
	}
	public String getPriorities() {
		return priorities;
	}
	public void setPriorities(String priorities) {
		this.priorities = priorities;
	}
	
}