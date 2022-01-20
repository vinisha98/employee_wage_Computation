package com.employeedetails;

public class employeedetails {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Welcome to Employee Wage Computation Program on Master Branch");
		int Is_Present=1;
		int Sal_Per_Hr=20;
		int Work_Hr;
		double emp = Math.floor(Math.random() * 10) %  2;
		if (emp == 	Is_Present) {
		System.out.println("Employee is present");
		Work_Hr=8;
		}
		else{
		System.out.println("Employee is absent");
		Work_Hr=0;
	}
		int Daily_Wage= (Sal_Per_Hr * Work_Hr);
		System.out.println("salary will be");
		System.out.println(Daily_Wage);
	}
}
