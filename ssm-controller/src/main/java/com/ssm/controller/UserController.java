package com.ssm.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ssm.service.UserService;

@Controller("userController")
@RequestMapping("userController")
public class UserController {
	
	@Autowired
	private UserService userService;
	
	@ResponseBody
	@RequestMapping("getUserInfo")
	public String getUserInfo(String userName) {
		String name = userService.getUserInfo(userName);
		System.out.println("User name: " + name);
		return name;
	}
}
