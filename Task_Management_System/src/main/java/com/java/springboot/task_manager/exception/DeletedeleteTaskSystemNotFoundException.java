package com.java.springboot.task_manager.exception;

public class DeletedeleteTaskSystemNotFoundException extends RuntimeException {
private String message;

public DeletedeleteTaskSystemNotFoundException(String message) {
	super();
	this.message = message;
}

public String getMessage() {
	return message;
}


}
