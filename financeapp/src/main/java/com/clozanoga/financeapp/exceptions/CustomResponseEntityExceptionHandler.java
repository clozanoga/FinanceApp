package com.clozanoga.financeapp.exceptions;

import java.util.HashMap;
import java.util.Map;

import javax.validation.ConstraintViolationException;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@ControllerAdvice
//@RestController
public class CustomResponseEntityExceptionHandler extends ResponseEntityExceptionHandler {

//	@ExceptionHandler
//	public final ResponseEntity<Object> handleUsernameAlreadyExists(UsernameAlreadyExistsException ex, WebRequest request) {
//		UsernameAlreadyExistsResponse exceptionResponse = new UsernameAlreadyExistsResponse(ex.getMessage());
//		return new ResponseEntity<Object>(exceptionResponse, HttpStatus.BAD_REQUEST);
//	}
	
	@ResponseStatus(HttpStatus.BAD_REQUEST)
	@ExceptionHandler(ConstraintViolationException.class)
	public final ResponseEntity<Object> handleConstraintViolation(ConstraintViolationException ex, WebRequest request) {
//		CustomError customError = new CustomError();
//        customError.setStatus(HttpStatus.BAD_REQUEST);
//        customError.setMessage(ex.getMessage());
//        customError.addConstraintErrors(ex.getConstraintViolations());
		
		 Map<String, String> errors = new HashMap<>();
	        ex.getConstraintViolations().forEach((error) -> {
	            String fieldName = error.getPropertyPath().toString();
	            String errorMessage = error.getMessage();
	            errors.put(fieldName, errorMessage);
	        });
	        
		return new ResponseEntity<>(errors, HttpStatus.BAD_REQUEST);
	}
	
	@Override
    public final ResponseEntity<Object> handleMethodArgumentNotValid(MethodArgumentNotValidException ex,
    		HttpHeaders headers, HttpStatus status, WebRequest request) {
        Map<String, String> errors = new HashMap<>();
        ex.getBindingResult().getAllErrors().forEach((error) -> {
            String fieldName = ((FieldError) error).getField();
            String errorMessage = error.getDefaultMessage();
            errors.put(fieldName, errorMessage);
        });

		return new ResponseEntity<>(errors, HttpStatus.BAD_REQUEST);
    }
	
}
