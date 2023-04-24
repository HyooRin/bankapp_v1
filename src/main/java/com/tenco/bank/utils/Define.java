package com.tenco.bank.utils;

public class Define {
	// 서버 프로그램에서 상태값을 변경할 수 있는 변수는 절대 지양
	public final static String PRINCIPAL = "principal";
	
	// 이미지 처리 관련 
	public static final String UPLOAD_DIRECTORY = "C:\\spring_upload\\bank\\upload";
	public static final int MAX_FILE_SIZE = 1024 * 1024 * 20; // 최대 20MB 
	// 1 byte = 8
	// 1024 -> 1KB 
	// 1,048,476 -> 1MB (1024 * 1024) 
			

}
