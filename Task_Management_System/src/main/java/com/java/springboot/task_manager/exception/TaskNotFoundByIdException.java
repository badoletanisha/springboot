package com.java.springboot.task_manager.exception;

public class TaskNotFoundByIdException extends RuntimeException{
	private String message;
	public TaskNotFoundByIdException(String message) {
		this.message=message;

	}
	@Override
	public String getMessage() {

		return message;
	}
}
