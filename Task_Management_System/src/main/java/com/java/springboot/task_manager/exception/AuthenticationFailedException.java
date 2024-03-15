package com.java.springboot.task_manager.exception;

public class AuthenticationFailedException extends RuntimeException{
	private String message;
	public AuthenticationFailedException(String message) {
		this.message=message;

	}
	@Override
	public String getMessage() {

		return message;
	}
}