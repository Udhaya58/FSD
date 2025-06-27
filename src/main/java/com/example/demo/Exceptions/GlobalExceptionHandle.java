package com.example.demo.Exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionHandle {
	@ExceptionHandler(ISBNNOTFound.class)
	public ResponseEntity<String> handleUserNotFoundException(ISBNNOTFound ex){
		return new ResponseEntity<>(ex.getMessage(),HttpStatus.NOT_FOUND);
		
	}
	@ExceptionHandler(UsernameNotFoundException.class)
	public ResponseEntity<String> handleUserNotFoundException1(UsernameNotFoundException ex){
		return new ResponseEntity<>(ex.getMessage(),HttpStatus.NOT_FOUND);
		
	}

}
