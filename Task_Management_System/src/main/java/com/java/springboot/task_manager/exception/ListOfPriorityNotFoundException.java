package com.java.springboot.task_manager.exception;

public class ListOfPriorityNotFoundException extends RuntimeException {
private String message;

public ListOfPriorityNotFoundException(String message) {
	super();
	this.message = message;
}

public String getMessage() {
	return message;
}



}
