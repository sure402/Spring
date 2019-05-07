package com.luv2code.spring.aop.businesslogic;

public class MyManagerImpl implements MyManager {

	@Override
	public void createEmployee(GuruNaveen gn) {
		// TODO Auto-generated method stub
		System.out.println("createEmployee method calling");
	}

	@Override
	public void deleteEmployee(int id) {
		// TODO Auto-generated method stub
		System.out.println("deleteEmployee method calling");
	}

	@Override
	public void updateEmployee(GuruNaveen gn) {
		// TODO Auto-generated method stub
		System.out.println("updateEmployee method calling");

	}

}
