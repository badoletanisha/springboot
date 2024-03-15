package com.java.springboot.task_manager.exception;

public class TaskForUserNotFoundByException extends RuntimeException{
	private String message;
	public TaskForUserNotFoundByException(String message) {
		this.message=message;

	}
	@Override
	public String getMessage() {

		return message;
	}
}

