package com.estar.branchs.controller;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalController {

	@ExceptionHandler(value = {Exception.class})
	public void exceptionDeal(Exception exception) {
		
	}
}
