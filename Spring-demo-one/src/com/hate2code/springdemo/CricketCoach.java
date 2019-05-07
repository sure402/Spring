package com.hate2code.springdemo;

public class CricketCoach implements Coach {
	private String coachName ;

	@Override
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return "cricket match begins at 9am";
	}

	public void getCoachName() {
		System.out.println("coachName = "+coachName );
	}

	public void setCoachName(String coachName) {
		this.coachName = coachName;
	}

}
