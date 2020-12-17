package client;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import bean.User;

public class Client {

	public static void main(String[] args) {
	
		
		ApplicationContext mycontext=new ClassPathXmlApplicationContext("SpringConfig.xml");
		
		System.out.println("Using setter injection: ");
		User u=(User) mycontext.getBean("user");
		System.out.println(u);
		
		
		System.out.println("Using constructor injection: ");
		User u1=(User)mycontext.getBean("user1");
		System.out.println(u1);

	}

}
