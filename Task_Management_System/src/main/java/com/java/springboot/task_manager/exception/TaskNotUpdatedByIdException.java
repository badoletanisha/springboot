package com.java.springboot.task_manager.exception;

public class TaskNotUpdatedByIdException extends RuntimeException{
	private String message;
	public TaskNotUpdatedByIdException(String message) {
		this.message=message;

	}
	@Override
	public String getMessage() {

		return message;
	}
}