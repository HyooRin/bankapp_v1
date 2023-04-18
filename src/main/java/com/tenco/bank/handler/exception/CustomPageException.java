package com.tenco.bank.handler.exception;

import org.springframework.http.HttpStatus;

public class CustomPageException extends RuntimeException{

	private HttpStatus status;
	
	public CustomPageException(String message, HttpStatus status) {
		
		super(message);
		this.status = status;
	}
}
