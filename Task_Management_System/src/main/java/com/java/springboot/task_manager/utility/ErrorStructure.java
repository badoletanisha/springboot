package com.java.springboot.task_manager.utility;

import org.springframework.web.bind.annotation.ResponseBody;

@ResponseBody
public class ErrorStructure<T> {
	private int statuscode;
	private String errorMessage;
	private T errordata;
	public int getStatuscode() {
		return statuscode;
	}
	public void setStatuscode(int statuscode) {
		this.statuscode = statuscode;
	}
	public String getErrorMessage() {
		return errorMessage;
	}
	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}
	public T getErrordata() {
		return errordata;
	}
	public void setErrordata(T errordata) {
		this.errordata = errordata;
	}
	
	
	
}
