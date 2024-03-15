package com.java.springboot.task_manager.exception;

public class AddpriorityNotFoundException extends RuntimeException {
	private String message;

	public AddpriorityNotFoundException(String message) {

		this.message = message;
	}

	public String getMessage() {
		return message;
	}



}
