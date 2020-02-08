package com.rest.exceptionhandling;

import java.util.Collections;

public class ValidationException extends Exception{

	private static final long serialVersionUID = 3349544752904508482L;

	private String property;
	
	private String message;

	public ValidationException(String property, String message) {
		this.property = property;
		this.message = message;
	}
	
	public String getProperty() {
		return property;
	}

	public void setProperty(String property) {
		this.property = property;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	@Override
	public String toString() {
		return "ValidationException [property=" + property + ", message=" + message + "]";
	}
	
	
	
	
}
