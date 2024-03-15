package com.java.springboot.task_manager.exception;

public class PriorityNotUpdateByIdNotFoundException extends RuntimeException {
private String message;

public PriorityNotUpdateByIdNotFoundException(String message) {
	super();
	this.message = message;
}

public String getMessage() {
	return message;
}



}
