package com.complaint.customer.ExceptionHandler;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;


import com.complaint.customer.*;


@ControllerAdvice
public class CustomerExeceptionController {
	
	@ExceptionHandler(value=CustomerNotFoundException.class)
	public ResponseEntity<Object> handleException(CustomerNotFoundException ex) {
		return new ResponseEntity<Object>(ex.getMessage(), HttpStatus.NOT_FOUND);
	}
}