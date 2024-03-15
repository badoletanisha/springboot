package com.java.springboot.task_manager.exception;

public class ListOfUserNotFoundByException extends RuntimeException{
	private String message;
	public ListOfUserNotFoundByException(String message) {
		this.message=message;

	}
	@Override
	public String getMessage() {

		return message;
	}
}
