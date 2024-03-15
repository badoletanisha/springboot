package com.java.springboot.task_manager.exception;

public class UserNotFoundByassingTaskException extends RuntimeException{
	private String message;
	public UserNotFoundByassingTaskException(String message) {
		this.message=message;

	}
	@Override
	public String getMessage() {

		return message;
	}
}

