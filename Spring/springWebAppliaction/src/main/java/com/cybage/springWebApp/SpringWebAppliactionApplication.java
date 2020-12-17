package com.cybage.springWebApp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@SpringBootApplication(scanBasePackages="com.cybage")
@EnableJpaRepositories(basePackages = "com.cybage")
@EntityScan("com.cybage.model")
public class SpringWebAppliactionApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringWebAppliactionApplication.class, args);
	}

}
