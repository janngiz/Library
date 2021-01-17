package com.anurag.handler;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.anurag.Exception.BookNotFoundException;

@RestControllerAdvice
public class CustomExceptionHandler {
	
	@ExceptionHandler(BookNotFoundException.class)
	public ResponseEntity<String> handleBookNotFound(BookNotFoundException bnfe){
		
		return  new ResponseEntity<String>(bnfe.getMessage(), HttpStatus.NOT_FOUND);
	}

}
