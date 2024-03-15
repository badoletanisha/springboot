package com.java.springboot.task_manager.exception;

public class AddCategoryNotCreatedException extends RuntimeException{
	private String message;
	public AddCategoryNotCreatedException(String message) {
		this.message=message;

	}
	@Override
	public String getMessage() {

		return message;
	}
}