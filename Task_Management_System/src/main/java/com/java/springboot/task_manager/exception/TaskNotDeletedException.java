package com.java.springboot.task_manager.exception;

public class TaskNotDeletedException extends RuntimeException{
	private String message;
	public TaskNotDeletedException(String message) {
		this.message=message;

	}
	@Override
	public String getMessage() {

		return message;
	}
}
