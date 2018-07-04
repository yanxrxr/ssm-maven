package com.ssm.service.impl;

import org.springframework.stereotype.Service;

import com.ssm.service.UserService;

@Service("userService")
public class UserServiceImpl implements UserService {

	@Override
	public String getUserInfo(String userName) {
		System.out.println("I'm in service now, username is " + userName);
		return userName;
	}
	
}
