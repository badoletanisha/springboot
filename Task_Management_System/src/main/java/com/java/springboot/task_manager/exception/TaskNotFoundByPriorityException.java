package com.java.springboot.task_manager.exception;

public class TaskNotFoundByPriorityException extends RuntimeException{
	private String message;
	public TaskNotFoundByPriorityException(String message) {
		this.message=message;

	}
	@Override
	public String getMessage() {

		return message;
	}
}
