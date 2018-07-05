package com.ssm.dao;

import com.ssm.entities.User;

public interface UserDao {
	
	public User getUserInfo(String userName);
	
	public int addUser(User user);
}
