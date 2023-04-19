package com.tenco.bank.repository.interfaces;

import java.util.List;


import org.apache.ibatis.annotations.Mapper;

import com.tenco.bank.repository.model.Account;

@Mapper // Mybatis 연결 처리
public interface AccountRepository {
	
	public int insert(Account account);
	public int updateById(Account account);
	public int deleteById(int id);
	
	public List<Account> findAll();
	public Account findById(int id);
	
	public List<Account> findByUserId(Integer userId);
	
	

}
