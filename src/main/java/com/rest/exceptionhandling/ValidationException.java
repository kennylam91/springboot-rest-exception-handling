package com.rest.exceptionhandling;

public class ValidationException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 3349544752904508482L;

	private String property;
	
	private String message;

	public ValidationException(String property, String message) {
		super();
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
	
	
}
