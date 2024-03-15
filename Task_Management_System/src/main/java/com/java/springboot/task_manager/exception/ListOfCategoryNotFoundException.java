package com.java.springboot.task_manager.exception;

public class ListOfCategoryNotFoundException extends RuntimeException {
private String message;
public ListOfCategoryNotFoundException(String message) {
	
	this.message=message;
	
}
public String getMessage() {
	return message;
}
}
