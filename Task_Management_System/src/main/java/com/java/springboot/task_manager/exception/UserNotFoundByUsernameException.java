package com.java.springboot.task_manager.exception;

public class UserNotFoundByUsernameException extends RuntimeException{
	private String message;
	public UserNotFoundByUsernameException(String message) {
		this.message=message;

	}
	@Override
	public String getMessage() {

		return message;
	}

}
