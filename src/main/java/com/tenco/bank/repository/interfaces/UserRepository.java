package com.tenco.bank.repository.interfaces;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.tenco.bank.dto.SignUpFormDto;
import com.tenco.bank.repository.model.User;
@Mapper // MyBatis 의존설정함 (build.gradle 파일)
public interface UserRepository {
	// 코드 수정하기 ㄴ
	public int insert(SignUpFormDto signUpFormDto);
	public int updateById(User user);
	public int deleteById(Integer id);
	public User findById(Integer id);
	public List<User> findAll();
	

}
