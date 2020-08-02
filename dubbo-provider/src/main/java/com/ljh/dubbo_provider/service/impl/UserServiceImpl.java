package com.ljh.dubbo_provider.service.impl;

import com.ljh.dubbo_interface.service.UserService;

public class UserServiceImpl implements UserService{

	public String hello() {
		return "hello,dubbo!!";
	}

}
