package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringBootApp {

	public static void main(String[] args) {
		// contenedor de beans
		ApplicationContext context = SpringApplication.run(SpringBootApp.class, args);
	}

}
