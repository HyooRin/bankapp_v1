package com.tenco.bank.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import com.tenco.bank.handler.AuthInterceptor;
// 우리가 만든 인터셉트 클래스 등록 + 패턴 설정 
@Configuration // Ioc 등록 - 2개이상 빈으로 등록될 때 사용
public class WebMvcConfig implements WebMvcConfigurer {
    @Autowired	
	private AuthInterceptor authInterceptor;

	
	@Override
	public void addInterceptors(InterceptorRegistry registry) {
		
		registry.addInterceptor(authInterceptor)
				.addPathPatterns("/account/**")
				.addPathPatterns("/auth/**"); // 1. path 더 추가하는 방법
		
		// 인터셉터 등록
		//registry.addInterceptor(new AdminInterceptor()) // 2. 인터셉터 등록
	}
	
	// 리소스 등록 처리
	// 서버 컴퓨터에 위치한 Resource를 활용하는 방법(프로젝트 외부 폴더 접근 방법)
	
	@Override
	public void addResourceHandlers(ResourceHandlerRegistry registry) {
		registry.addResourceHandler("/images/uploads/**")
				.addResourceLocations("file:///C:\\spring_upload\\bank\\upload/");
	}
	
	@Bean // Ioc 관리 대상 처리 - 싱글톤
	public PasswordEncoder passwordEncoder() {
		return new BCryptPasswordEncoder();
	}
	
	

}
