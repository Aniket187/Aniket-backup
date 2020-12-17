package com.cybage.springWebApp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@SpringBootApplication(scanBasePackages="com.cybage")
public class SpringWebAppliactionApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringWebAppliactionApplication.class, args);
	}

}
