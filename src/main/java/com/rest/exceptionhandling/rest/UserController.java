package com.rest.exceptionhandling.rest;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.rest.exceptionhandling.NoDataRequestException;
import com.rest.exceptionhandling.RestResponseEntityExceptionHandler;
import com.rest.exceptionhandling.ValidationException;
import com.rest.exceptionhandling.dto.UserDTO;

@RestController
@RequestMapping("/users")
public class UserController {

	@PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE, 
				 produces = MediaType.APPLICATION_JSON_VALUE)
	@ResponseStatus(value = HttpStatus.CREATED)
	public UserDTO register(@RequestBody UserDTO userDTO) throws ValidationException, NoDataRequestException {
		if(userDTO == null||userDTO.getPassword()==null||userDTO.getUsername()==null) {
			throw new NoDataRequestException("User must be contained in request");
		}
		if(userDTO.getPassword().length() < 3) {
			throw new ValidationException("password","password must have more than 3 characters");
		}
		
		return userDTO;
	}
	
	
	
}
