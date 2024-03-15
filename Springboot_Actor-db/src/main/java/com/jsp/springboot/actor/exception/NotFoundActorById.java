package com.jsp.springboot.actor.exception;

public class NotFoundActorById extends RuntimeException{

	private String message;
	
	public NotFoundActorById(String message) {
		this.message=message;
	}
	
	public String getMessage() {
		return message;
		
	}
	
}
