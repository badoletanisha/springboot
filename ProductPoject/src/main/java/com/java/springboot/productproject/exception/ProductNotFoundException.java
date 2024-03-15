package com.java.springboot.productproject.exception;

public class ProductNotFoundException extends RuntimeException {
	private String message;

	public ProductNotFoundException(String message) {
		super();
		this.message = message;
	}

	public String getMessage() {
		return message;
	}
}
