package com.java.springboot.task_manager.exception;

public class RemoveUserFromTaskNotFoundByException extends RuntimeException{
	private String message;
	public RemoveUserFromTaskNotFoundByException(String message) {
		this.message=message;

	}
	@Override
	public String getMessage() {

		return message;
	}
}
