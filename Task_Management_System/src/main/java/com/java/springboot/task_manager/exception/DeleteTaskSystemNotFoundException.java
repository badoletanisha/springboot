package com.java.springboot.task_manager.exception;

public class DeleteTaskSystemNotFoundException extends RuntimeException{
private String message;

public DeleteTaskSystemNotFoundException(String message) {
	super();
	this.message = message;
}

public String getMessage() {
	return message;
}


}
