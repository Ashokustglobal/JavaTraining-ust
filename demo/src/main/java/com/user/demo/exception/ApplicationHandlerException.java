package com.user.demo.exception;

import java.util.HashMap;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

//import com.labour.labourDetails.exceptions.PersonNotFoundException;

@RestControllerAdvice
public class ApplicationHandlerException {

	
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
	@ExceptionHandler(UserNotFoundException.class)
	public Map<String, String> handleBusinessException(UserNotFoundException pf){
		Map<String, String> errorMap=new HashMap<>();
		errorMap.put("errorMessage", pf.getMessage());
		return errorMap;
	}
	
	
	
}
