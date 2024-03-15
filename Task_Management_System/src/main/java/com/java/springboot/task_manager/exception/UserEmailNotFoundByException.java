package com.java.springboot.task_manager.exception;

public class UserEmailNotFoundByException extends RuntimeException{
	private String message;
	public UserEmailNotFoundByException(String message) {
		this.message=message;

	}
	@Override
	public String getMessage() {

		return message;
	}
}

