package com.employeedetails;

public class employeedetails {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Welcome to Employee Wage Computation Program on Master Branch");
		int Is_Present=1;
		int Is_Part_Time=2;
		int Sal_Per_Hr=20;
		int Work_Hr=0;
		int emp = (int) Math.floor(Math.random() * 10) %  3;
		switch(emp) { 
			case 1:
				System.out.println("Employee is present");
				Work_Hr=8;
				break;
			case 2:
				System.out.println("Employee is parttimer");
				Work_Hr=4;
				break;
			case 3:
				System.out.println("Employee is absent");
				Work_Hr=0;
				break;
			default:
				System.out.println("contition doesnot exit");
		}
		int Daily_Wage= (Sal_Per_Hr * Work_Hr);
		System.out.println("salary will be");
		System.out.println(Daily_Wage);
	}
}
