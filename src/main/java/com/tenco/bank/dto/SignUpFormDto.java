package com.tenco.bank.dto;

import org.springframework.web.multipart.MultipartFile;

import lombok.Data;

@Data
public class SignUpFormDto {
	
	private String username;
	private String password;
	private String fullname;
	// private MultipartFile[] 다중처리 배열로 사용하자
	private MultipartFile file; // file 은 name file 속성과 일치시켜야 함
	private String originFileName;
	private String uploadFileName;
}
