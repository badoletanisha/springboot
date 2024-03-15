package com.java.springboot.task_manager.exception;


public class UpdateCategoryByIdNotFoundException extends RuntimeException{
	private String message;
	public UpdateCategoryByIdNotFoundException(String message) {
		this.message=message;

	}
	@Override
	public String getMessage() {

		return message;
	}
}
