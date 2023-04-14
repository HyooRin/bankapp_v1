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

}
