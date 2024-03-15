package com.jsp.springboot.actor.exception;

public class NotUpdateByActorId extends RuntimeException{
	private String Message;

	public NotUpdateByActorId(String Message) {
		this.Message=Message;
	}
	@Override
	public String getMessage() {
	return Message;
	}
}
