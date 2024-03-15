package com.java.springboot.productproject.utility;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;

import com.java.springboot.productproject.exception.ProductNotFoundException;

@RestController
public class ApplicationHandler {
@ExceptionHandler
public ResponseEntity<ErrorStructure<String>> productNotFoundException(ProductNotFoundException ex){
	ErrorStructure<String> errorStructure = new ErrorStructure<>();
	errorStructure.setStatuscode(HttpStatus.NOT_FOUND.value());
	errorStructure.setMessage(ex.getMessage());
	errorStructure.setData("Task not Created Succsefully");
	return new ResponseEntity<ErrorStructure<String>>(errorStructure, HttpStatus.NOT_FOUND);

}
}
