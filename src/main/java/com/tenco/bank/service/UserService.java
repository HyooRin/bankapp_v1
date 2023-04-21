package com.tenco.bank.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.tenco.bank.dto.SignInFormDto;
import com.tenco.bank.dto.SignUpFormDto;
import com.tenco.bank.handler.exception.CustomRestfullException;
import com.tenco.bank.repository.interfaces.UserRepository;
import com.tenco.bank.repository.model.User;

@Service // Ioc 대상
public class UserService {
	
	@Autowired // DI 처리 (객체 생성시 의존주입처리)
	private UserRepository userRepository;
	
	@Autowired // DI 처리 - webMvcConfig 에서 Ioc 처리함
	private PasswordEncoder passwordEncoder; 
	
	@Transactional
	// 메서드 호출이 시작될때 트랜젝션의 시작
	// 메서드 종료시 트랜젝션 종료 (commit)	
	public void createUser(SignUpFormDto signUpFormDto) {
		
		String rawPwd = signUpFormDto.getPassword();
		String hashPwd = passwordEncoder.encode(rawPwd);
		signUpFormDto.setPassword(hashPwd); // 객체 상태 변경
		
		int result = userRepository.insert(signUpFormDto);
		if(result != 1) {
			throw new CustomRestfullException("회원가입 실패", HttpStatus.INTERNAL_SERVER_ERROR);
		}		
	}
	/**
	 * 로그인 서비스 처리
	 * @param signInFormDto
	 * @return userEntity 응답 
	 */
	@SuppressWarnings("unused")
	@Transactional
	public User signIn(SignInFormDto signInFormDto) {
		
		String rawPwd = signInFormDto.getPassword();		
		// User userEntity = userRepository.findByUsernameAndPassword(signInFormDto);
		User userEntity = userRepository.findByUsername(signInFormDto);
		if(userEntity == null) {
			throw new CustomRestfullException("계정이 존재하지 않습니다", HttpStatus.INTERNAL_SERVER_ERROR);
		}
		
		boolean isMatched = passwordEncoder.matches( rawPwd , userEntity.getPassword() );		
		
		if(isMatched == false) {
			throw new CustomRestfullException("비밀번호가 틀립니다", HttpStatus.INTERNAL_SERVER_ERROR);
		}
		
				
		return userEntity;		
	}

}
