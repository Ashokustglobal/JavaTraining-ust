package com.labour.labourDetails.exceptions;

import java.util.HashMap;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class ApplicationHndlerException {

	@ResponseStatus(HttpStatus.BAD_REQUEST)
	@ExceptionHandler(MethodArgumentNotValidException.class)
	public Map<String, String> handleInvalidArgument(MethodArgumentNotValidException ex){
		Map<String, String>errprMap=new HashMap<>();
		
		ex.getBindingResult().getFieldErrors().forEach(error->{
			errprMap.put(error.getField(), error.getDefaultMessage());
		});		
		return errprMap;
		
	}
	
	@ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
	@ExceptionHandler(PersonNotFoundException.class)
	public Map<String, String> handleBusinessException(PersonNotFoundException pf){
		Map<String, String> errorMap=new HashMap<>();
		errorMap.put("errorMessage", pf.getMessage());
		return errorMap;
	}
	
}
