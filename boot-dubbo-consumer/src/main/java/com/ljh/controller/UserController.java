package com.ljh.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.dubbo.config.annotation.Reference;
import com.ljh.dubbo_interface.service.UserService;

@Controller
public class UserController {
	
	@Reference
	private UserService userService;

	@RequestMapping("/user")
	@ResponseBody
	public String hello(){
		return userService.hello();
	}
}
