package com.springboot.handler;

import java.io.IOException;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.springboot.exception.InvalidFieldException;

@RestControllerAdvice
public class StudentExceptionHandler {
	
	@ExceptionHandler
	public String handleInvalidFieldException(InvalidFieldException exception) {
		return exception.getMessage();
	}
	
	@ExceptionHandler
	public String handleInvalidFirstFieldException(IOException exception) {
		return exception.getMessage();
	}
}
