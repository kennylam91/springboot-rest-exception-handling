package com.rest.exceptionhandling;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@ControllerAdvice
public class RestResponseEntityExceptionHandler extends ResponseEntityExceptionHandler {

	@ExceptionHandler(NoDataRequestException.class)
	public ResponseEntity<Object> handleNoDataRequestException(Exception ex){
		System.out.println("NoDataRequestException Handler");
		return new ResponseEntity<>(ex, HttpStatus.LENGTH_REQUIRED);
	}
	
	@ExceptionHandler(ValidationException.class)
	public ResponseEntity<Object> handleValidationException(ValidationException ex){
		System.out.println("ValidException");
		return new ResponseEntity<>(ex, HttpStatus.BAD_REQUEST);
	}
}
