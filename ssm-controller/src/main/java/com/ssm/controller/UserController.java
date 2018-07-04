package com.ssm.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller("userController")
@RequestMapping("userController")
public class UserController {
	
	@ResponseBody
	@RequestMapping("getUserInfo")
	public String getUserInfo(String userName) {
		System.out.println("User name: " +userName);
		return userName;
	}
}
