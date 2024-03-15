package com.java.springboot.productproject.utility;

import org.springframework.stereotype.Component;

@Component
public class ResponseStructure<T> {
	private int statuscode;
	private String Message;
	private T data;
	public int getStatuscode() {
		return statuscode;
	}
	public ResponseStructure<T> setStatuscode(int statuscode) {
		this.statuscode = statuscode;
		return this;
	}
	public String getMessage() {
		return Message;
	}
	public ResponseStructure<T> setMessage(String message) {
		Message = message;
		return this;
	}
	public T getData() {
		return data;
	}
	public ResponseStructure<T> setData(T data) {
		this.data = data;
		return this;
	}
	
}
