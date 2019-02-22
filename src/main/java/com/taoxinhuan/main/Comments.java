package com.taoxinhuan.main;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;

@SpringBootApplication
@MapperScan("com.taoxinhuan.main.dao")
public class Comments extends SpringBootServletInitializer {
	public static void main(String[] args) {
		SpringApplication.run(Comments.class, args);
	}
	
	/**
	 * 项目打成war包
	 */
	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(Comments.class);
	}
}
