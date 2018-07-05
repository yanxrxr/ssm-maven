package com.ssm.service;

public interface UserService {
	
	public String getUserInfo(String userName);
	
	public int addUser(String userName, String email, String password);
	
}
