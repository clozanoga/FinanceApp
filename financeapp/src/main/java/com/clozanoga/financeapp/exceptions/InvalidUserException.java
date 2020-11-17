package com.clozanoga.financeapp.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.BAD_REQUEST)
public class InvalidUserException extends RuntimeException {

	private static final long serialVersionUID = 4895751019373451354L;

	public InvalidUserException(String message) {
		super(message);
	}
	
}
