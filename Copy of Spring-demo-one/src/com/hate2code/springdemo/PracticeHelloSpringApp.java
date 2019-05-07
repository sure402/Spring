package com.hate2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PracticeHelloSpringApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// load the spring configuration file
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("applicationContext.xml");
				
		// retrieve bean from spring container
		Coach theCoach = context.getBean("myCricketCoach", Coach.class);
		
		Coach theCoach1 = context.getBean("myBaseBallCoach", Coach.class);
		
		// call methods on the bean
		theCoach.getCoachName();
		System.out.println(theCoach.getDailyWorkout());
		System.out.println(theCoach1.getDailyWorkout());
		// close the context
		context.close();
	}

}










