package com.java.springboot.task_manager.exception;

public class IncorrectpasswordException extends RuntimeException{
	private String message;
	public IncorrectpasswordException(String message) {
		this.message=message;

	}
	@Override
	public String getMessage() {

		return message;
	}
}
