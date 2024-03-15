package com.java.springboot.task_manager.exception;

public class CategoryNotFoundException extends RuntimeException{
	private String message;
	public CategoryNotFoundException(String message) {
		this.message=message;

	}
@Override
	public String getMessage() {
		
		return message;
	}
}
