package com.java.springboot.task_manager.exception;

public class CategoryNotUpdatedException extends RuntimeException{
	private String message;
	public CategoryNotUpdatedException(String message) {
		this.message=message;

	}
	@Override
	public String getMessage() {

		return message;
	}
}

