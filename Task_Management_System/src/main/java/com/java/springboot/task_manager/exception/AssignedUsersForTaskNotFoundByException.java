package com.java.springboot.task_manager.exception;

public class AssignedUsersForTaskNotFoundByException extends RuntimeException{
	private String message;
	public AssignedUsersForTaskNotFoundByException(String message) {
		this.message=message;

	}
	@Override
	public String getMessage() {

		return message;
	}
}
