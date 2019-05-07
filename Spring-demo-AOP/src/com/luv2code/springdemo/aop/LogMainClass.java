package com.luv2code.springdemo.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;


@Aspect
public class LogMainClass {
	
	@Before("execution(* com.luv2code.spring.aop.businesslogic.MyManager.*(..))")
	public void logbefore(JoinPoint jp){
		
		System.out.println("logbeforeMethod");
	}
	@After("execution(* com.luv2code.spring.aop.businesslogic.MyManager.*(..))")
	public void logafter(JoinPoint jp){
		
		System.out.println("logbafterMethod");
	}
	
}
