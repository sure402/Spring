package com.luv2code.spring.aop.businesslogic;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Required;

public class GuruNaveen {
	
	
	
	
	private String guruName;
	
	private int guruAge;
	
	
	
//	public  GuruNaveen(StudentSuresh StudentSuresh){
//		this.StudentSuresh = StudentSuresh;
//		System.out.println("InsideNaveenConstructor");
//		
//	}

	public String getGuruName() {
		return guruName;
	}

	
	public void setGuruName(String guruName) {
		this.guruName = guruName;
	}


	public int getGuruAge() {
		return guruAge;
	}

	
	public void setGuruAge(int guruAge) {
		this.guruAge = guruAge;
	}

	

	

}
