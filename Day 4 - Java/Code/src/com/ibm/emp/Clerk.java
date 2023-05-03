package com.ibm.emp;

public class Clerk extends Employee {

	private double commision;

	public Clerk(String empName, double salary, double commision) {
		super(empName, salary);
		this.commision = commision;
	}

	@Override
	public void payslip() {
		// TODO Auto-generated method stub
		super.payslip();
		System.out.println("Commision: " + commision);
	}

	@Override
	public double getSalary() {
		// TODO Auto-generated method stub
		return super.getSalary() + commision;
	}

}
