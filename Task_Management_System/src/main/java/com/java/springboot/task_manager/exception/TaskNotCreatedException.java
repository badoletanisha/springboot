package com.java.springboot.task_manager.exception;

public class TaskNotCreatedException extends RuntimeException{
	private String message;
	public TaskNotCreatedException(String message) {
		this.message=message;

	}
	@Override
	public String getMessage() {

		return message;
	}
}
