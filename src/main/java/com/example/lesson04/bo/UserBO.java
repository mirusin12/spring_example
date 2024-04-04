package com.example.lesson04.bo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.lesson04.domain.User;
import com.example.lesson04.mapper.UserMapper;

@Service
public class UserBO {
	
	@Autowired
	private UserMapper userMapper;
	
	// input: 4개 파라미터
	// output: X (성공한 행의 개수 안받음)
	public void addUser(String name, String yyyymmdd,
			String email, String introduce) {
		userMapper.insertUser(name, yyyymmdd, email, introduce);
		
	}
	
	// input: X
	// output: User or null    []
	public User getLatestUser() {
		return userMapper.selectLatestUser();
	}
}
