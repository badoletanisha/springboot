package com.java.springboot.task_manager.exception;

public class PriorityByIdNotFoundException extends RuntimeException {
	private String message;

	public PriorityByIdNotFoundException(String message) {
		super();
		this.message = message;
	}

	public String getMessage() {
		return message;
	}



}
