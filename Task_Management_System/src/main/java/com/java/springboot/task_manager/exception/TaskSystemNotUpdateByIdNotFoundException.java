package com.java.springboot.task_manager.exception;

public class TaskSystemNotUpdateByIdNotFoundException extends RuntimeException {
private String message;

public TaskSystemNotUpdateByIdNotFoundException(String message) {
	
	this.message = message;
}

public String getMessage() {
	return message;
}

}
