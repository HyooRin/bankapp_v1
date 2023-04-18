package com.tenco.bank.handler;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.tenco.bank.handler.exception.CustomRestfullException;

/**
 * 예외시
 * 데이터를 내려 줄 수 있다
 */

@RestControllerAdvice // Ioc 대상 + AOP 기반 
public class MyRestfulExceptionHandler {
	
	@ExceptionHandler(Exception.class)
	public void exception(Exception e) {
		System.out.println(e.getClass().getName());
		System.out.println(e.getMessage());
	}
	
	// 사용자 정의 예외 클래스 활용
	@ExceptionHandler(CustomRestfullException.class)
	public String basicException(CustomRestfullException e) {
		
		StringBuffer sb = new StringBuffer();
		sb.append("<script>");
		// 반드시 마지막에 ;을 붙여서 사용하자 !
		sb.append("alert('" + e.getMessage() +"');");
		sb.append("history.back();");
		sb.append("</script>");
		return sb.toString();		
		
	}

}
