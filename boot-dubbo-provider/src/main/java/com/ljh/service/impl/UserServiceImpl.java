package com.ljh.service.impl;


import org.springframework.stereotype.Component;

import com.alibaba.dubbo.config.annotation.Service;
import com.ljh.dubbo_interface.service.UserService;

@Service  //使用alibaba的service进行暴露服务
@Component
public class UserServiceImpl implements UserService{

	@Override
	public String hello() {
		return "hello boot-dubbo !!";
	}
	

}
