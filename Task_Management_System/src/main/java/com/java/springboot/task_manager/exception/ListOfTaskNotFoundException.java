package com.java.springboot.task_manager.exception;

public class ListOfTaskNotFoundException extends RuntimeException{
	private String message;
	public ListOfTaskNotFoundException(String message) {
		this.message=message;

	}
	@Override
	public String getMessage() {

		return message;
	}
}
