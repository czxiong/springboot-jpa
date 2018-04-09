package com.czx;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@EnableTransactionManagement //允许用注解配置事务
public class SpringbootjpaApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootjpaApplication.class, args);
	}
}
