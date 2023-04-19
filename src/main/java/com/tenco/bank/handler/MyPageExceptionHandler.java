package com.tenco.bank.handler;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
/**
 * View 랜더링을 위해 ModelAndView
 * 객체를 반환하도록 기본설정 되어있다
 * 예외 Page를 리턴하도록 활용예정  
 *
 */
import org.springframework.web.servlet.ModelAndView;

import com.tenco.bank.handler.exception.CustomPageException;
/**
 * view 랜더링 위해 ModelAndView
 * 객체를 반환하도록 기본설정 되어있다.
 * 예외 Page를 리턴하도록 활용 예정
 */

@ControllerAdvice
public class MyPageExceptionHandler {

	// 사용자 정의클래스 활용
	@ExceptionHandler(CustomPageException.class)
	public ModelAndView handleRuntimePageException(CustomPageException e) {
		//ModelAndView 활용방법 
		ModelAndView modelAndView = new ModelAndView("errorPage");
		modelAndView.addObject("statusCode", HttpStatus.NOT_FOUND.value());
		modelAndView.addObject("message", e.getMessage());
		return modelAndView;		
	}
}
