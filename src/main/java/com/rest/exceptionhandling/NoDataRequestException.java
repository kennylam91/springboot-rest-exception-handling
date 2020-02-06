package com.rest.exceptionhandling;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

public class NoDataRequestException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = -896824998445695216L;

	public NoDataRequestException(String message) {
		super(message);
		// TODO Auto-generated constructor stub
	}

	
}
