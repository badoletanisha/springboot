package com.java.springboot.task_manager.exception;

public class CategoryByIdNotFoundException extends RuntimeException {

	private String message;

	public CategoryByIdNotFoundException(String message) {
		super();
		this.message = message;
	}

	public String getMessage() {
		return message;
	}

	
	
}
