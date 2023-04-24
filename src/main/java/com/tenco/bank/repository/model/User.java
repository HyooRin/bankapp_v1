package com.tenco.bank.repository.model;

import java.sql.Timestamp;

import lombok.Data;

@Data
public class User {
	
	private Integer id;
	private String username;
	private String password;
	private String fullname;
	private Timestamp createdAt;
	
	private String uploadFileName;
	
	public String setUpUserImage() {
		System.out.println(this.uploadFileName);
		return uploadFileName == null ? "https://picsum.photos/id/1/300" : "/images/uploads/" + uploadFileName;
	}

}
