package com.example.TodoApplicationDemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan({"model","service","controller"})
public class TodoApplicationDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(TodoApplicationDemoApplication.class, args);
	}

}
