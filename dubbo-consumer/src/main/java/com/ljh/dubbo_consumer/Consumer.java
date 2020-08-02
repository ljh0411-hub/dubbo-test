package com.ljh.dubbo_consumer;

import java.io.IOException;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ljh.dubbo_interface.service.UserService;

public class Consumer {

	public static void main(String[] args) throws IOException {
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("classpath:dubbo-consumer.xml");
        context.start();
        
        //获取远程服务
        UserService userService = context.getBean(UserService.class);
        System.out.println("获取发布者的信息："+userService.hello());
        
        System.in.read(); // press any key to exit

	}

}
