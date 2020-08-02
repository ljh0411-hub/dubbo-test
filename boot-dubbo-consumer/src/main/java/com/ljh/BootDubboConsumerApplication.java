package com.ljh;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.alibaba.dubbo.config.spring.context.annotation.EnableDubbo;

@EnableDubbo
@SpringBootApplication
public class BootDubboConsumerApplication {
	public static void main(String[] args) {
		SpringApplication.run(BootDubboConsumerApplication.class, args);
	}

}
