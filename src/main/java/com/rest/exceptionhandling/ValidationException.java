package com.rest.exceptionhandling;

import java.net.URI;

import org.zalando.problem.AbstractThrowableProblem;
import org.zalando.problem.Status;

public class ValidationException extends AbstractThrowableProblem{
	
	private static final URI TYPE = URI.create("validation-fail");

	public ValidationException(String message) {
		super(TYPE,
				"Validation Error",
				Status.BAD_REQUEST,
				message);
	}
	
	

}
