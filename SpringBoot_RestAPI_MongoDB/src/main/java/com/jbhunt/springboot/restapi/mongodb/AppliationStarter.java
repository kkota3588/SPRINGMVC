package com.jbhunt.springboot.restapi.mongodb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AppliationStarter {
//	static {
//		System.setProperty("spring.config.location", "file:classpath=src/main/resources/application.yml");
//	}
	public static void main(String[] args) {
		SpringApplication.run(AppliationStarter.class, args);

	}

}
