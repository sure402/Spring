package com.luv2code.springdemo;

public class HelloGuru {

	private StudentSuresh StdSuresh;
	private String notes ;
	
	
	public void callAdd(){
		
		StdSuresh.add();
	} 
	
	public StudentSuresh getStdSuresh() {
		
	return StdSuresh;
	}
	public void setStdSuresh(StudentSuresh stdSuresh) {
		StdSuresh = stdSuresh;
		System.out.println("Calling setter Injection of HelloGuru Class");
	}
	public void getNotes() {
		System.out.println("MyNotes = "+ notes);
	}
	public void setNotes(String notes) {
		this.notes = notes;
	}
	
	public void init(){
		
		System.out.println("Bean is in Init method");
	}
	public void destroy(){
		
		System.out.println("Bean is in destroy method");
	}
}
