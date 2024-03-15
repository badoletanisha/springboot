package com.java.springboot.task_manager.exception;

public class UserNotDeleteByIdException extends RuntimeException{
	private String message;
	public UserNotDeleteByIdException(String message) {
		this.message=message;

	}
	@Override
	public String getMessage() {

		return message;
	}
}
