package com.luv2code.springdemo.autowire;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BaseMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// load the spring configuration file
				ClassPathXmlApplicationContext context = 
						new ClassPathXmlApplicationContext("applicationContext.xml");
				
		GuruNaveen guru = (GuruNaveen) context.getBean("guruBeanId");		
		guru.callAdd();
		
		
		
	}

}
