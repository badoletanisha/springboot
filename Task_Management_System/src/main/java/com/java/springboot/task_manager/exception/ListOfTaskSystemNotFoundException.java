package com.java.springboot.task_manager.exception;

public class ListOfTaskSystemNotFoundException extends RuntimeException {
private String message;

public ListOfTaskSystemNotFoundException(String message) {
	super();
	this.message = message;
}

public String getMessage() {
	return message;
}



}
