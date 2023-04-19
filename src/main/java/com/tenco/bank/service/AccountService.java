package com.tenco.bank.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.tenco.bank.dto.SaveFormDto;
import com.tenco.bank.handler.exception.CustomRestfullException;
import com.tenco.bank.repository.interfaces.AccountRepository;
import com.tenco.bank.repository.model.Account;

@Service // Ioc 대상 + 싱글톤으로 관리
public class AccountService {
	
	@Autowired  // DI 
	private AccountRepository accountRepository;
	
	// 서비스 로직 만들기
	/**
	 * 계좌 생성 기능 
	 * @param saveFormDto
	 * @param principalId
	 */
	@Transactional
	public void createAccount(SaveFormDto saveFormDto, Integer principalId) {
		// saveFormDto를 변경 또는 신규생성
		// 1단계 레벨
		Account account = new Account();
		account.setNumber(saveFormDto.getNumber());
		account.setPassword(saveFormDto.getNumber());
		account.setBalance(saveFormDto.getBalance());
		account.setUserId(principalId);
		int resultRowCount = accountRepository.insert(account);
		if(resultRowCount != 1) {
			throw new CustomRestfullException("계좌 생성 실패", HttpStatus.INTERNAL_SERVER_ERROR);
		}		
		
	}
	
	// 계좌 목록 보기 기능 
	@Transactional
	public List<Account> readAccountList(Integer userId){
		
		List<Account> list = accountRepository.findByUserId(userId); 
		return list;
	}
	 

}
