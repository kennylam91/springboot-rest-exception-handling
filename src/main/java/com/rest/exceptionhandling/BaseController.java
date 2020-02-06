package com.rest.exceptionhandling;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;

public class BaseController {

	@ExceptionHandler(Exception.class)
	public ResponseEntity<Object> handleAllException(Exception ex){
		return new ResponseEntity<>(ex, HttpStatus.INTERNAL_SERVER_ERROR);
	}
	
	@ExceptionHandler(ValidationException.class)
	public ResponseEntity<Object> handleValidationException(ValidationException ex){
		return new ResponseEntity<>(ex, HttpStatus.BAD_REQUEST);
	}
}
