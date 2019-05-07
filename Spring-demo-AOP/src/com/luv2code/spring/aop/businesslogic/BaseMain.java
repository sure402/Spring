package com.luv2code.spring.aop.businesslogic;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BaseMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// load the spring configuration file
				ClassPathXmlApplicationContext context = 
						new ClassPathXmlApplicationContext("applicationContext.xml");
				
				MyManager guru = (MyManager) context.getBean("MyManagerId");		
		
				guru.createEmployee(new GuruNaveen());
				guru.deleteEmployee(10);
				guru.updateEmployee(new GuruNaveen());
		
	}

}
