package com.java.springboot.task_manager.exception;

public class TaskSystemByIdNotFoundException extends RuntimeException {
	private String message;

	public TaskSystemByIdNotFoundException(String message) {
		super();
		this.message = message;
	}

	public String getMessage() {
		return message;
	}


}
