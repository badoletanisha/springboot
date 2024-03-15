package com.java.springboot.task_manager.exception;

public class UserNotUpdatedByIdException extends RuntimeException{
	private String message;
	public UserNotUpdatedByIdException(String message) {
		this.message=message;

	}
	@Override
	public String getMessage() {

		return message;
	}
}
