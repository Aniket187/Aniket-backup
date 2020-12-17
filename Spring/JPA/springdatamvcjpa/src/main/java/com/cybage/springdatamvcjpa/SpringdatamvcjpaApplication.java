package com.cybage.springdatamvcjpa;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import com.cybage.service.SoccerService;
import com.cybage.service.SoccerServiceImpl;

@SpringBootApplication(scanBasePackages="com.cybage")
@EnableJpaRepositories(basePackages="com.cybage.repository")
@EntityScan("com.cybage.model")
@EnableTransactionManagement
public class SpringdatamvcjpaApplication implements CommandLineRunner {

	
	 @Autowired
	    SoccerServiceImpl soccerService;
	    
	public static void main(String[] args) {
		SpringApplication.run(SpringdatamvcjpaApplication.class, args);
	}
	
	    @Override
	    public void run(String... arg0) throws Exception {
	      
	    	
	    	soccerService.addBarcelonaPlayer("Xavi Hernandez", "Midfielder", 6);
	        List<String> players = soccerService.getAllTeamPlayers(1);
	        for(String player : players)
	        {
	            System.out.println("Introducing Barca player => " + player);
	        }
	    }

}
