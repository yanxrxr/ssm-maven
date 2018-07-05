package com.ssm.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ssm.dao.UserDao;
import com.ssm.entities.User;
import com.ssm.service.UserService;

@Service("userService")
public class UserServiceImpl implements UserService {
	
	@Autowired
	private UserDao userDao;

	@Override
	public String getUserInfo(String userName) {
		User user = userDao.getUserInfo(userName);
		System.out.println(user.toString());
		return user.toString();
	}

	@Override
	public int addUser(String userName, String email, String password) {
		User user = new User();
		user.setUserName(userName);
		user.setEmail(email);
		user.setPassword(password);
		return userDao.addUser(user);
	}
	
}
