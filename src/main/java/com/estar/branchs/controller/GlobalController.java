package com.estar.branchs.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RestControllerAdvice;

/**
 * 指定只针对RestController注解、Controller注解标注的控制器类进行增强
 *
 */
@RestControllerAdvice(annotations = {RestController.class, Controller.class})
public class GlobalController {

	@ExceptionHandler(value = {Exception.class})
	public void exceptionDeal(Exception exception) {
		
	}
}
