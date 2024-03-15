package com.java.springboot.task_manager.exception;

public class DeletePriorityNotFoundException extends RuntimeException {
	private String message;

	public DeletePriorityNotFoundException(String message) {
		super();
		this.message = message;
	}

	public String getMessage() {
		return message;
	}



}
