package com.java.springboot.task_manager.exception;

public class UserNotCreatedException extends RuntimeException{
	private String message;
	public UserNotCreatedException(String message) {
		this.message=message;

	}
	@Override
	public String getMessage() {

		return message;
	}
}
