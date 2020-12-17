package com.example.demo.Exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;

@ControllerAdvice
public class GlobalExceptionHandler {
	@ExceptionHandler(ResourceNotFoundException.class)
public ResponseEntity<?>resourceNotFoundException(ResourceNotFoundException ex,WebRequest request){
	ErrorDetails errorDetail=new ErrorDetails(ex.getMessage(), request.getDescription(false));
	return new ResponseEntity<>(errorDetail,HttpStatus.NOT_FOUND);
}


}
