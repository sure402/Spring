package com.luv2code.springdemo;

public class GuruNaveen {
	
	private StudentSuresh StudentSuresh;
	
	
//	public  GuruNaveen(StudentSuresh StudentSuresh){
//		this.StudentSuresh = StudentSuresh;
//		System.out.println("InsideNaveenConstructor");
//		
//	}
	
	
	public void callAdd(){
		
		StudentSuresh.add();
	}


	public StudentSuresh getStudentSuresh() {
		return StudentSuresh;
	}


	public void setStudentSuresh(StudentSuresh studentSuresh) {
		StudentSuresh = studentSuresh;
		System.out.println("This is StudentSuresh setter injection");
	}

}
