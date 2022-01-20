package com.employeedetails;

public class employeedetails {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Welcome to Employee Wage Computation Program on Master Branch");
		int Sal_Per_Hr=20;
		int Emp_Hr=0;
		int Total = 0;
		int Days = 0;
		int Work_Hr = 0;
		while(Days<20 && Work_Hr<100) 
		{
		int emp = (int) Math.floor(Math.random() * 10) %  3;
		switch(emp) { 
			case 1:
				Emp_Hr=8;
				break;
			case 2:
				Emp_Hr=4;
				break;
			default:
				Emp_Hr=0;
		}
		int Daily_Wage= (Sal_Per_Hr * Emp_Hr);
		Total= (Total+Daily_Wage);
		Days=(Days+1);
		Work_Hr=(Work_Hr+Emp_Hr);
		System.out.println("totalsalary will be: " + Total);
		System.out.println(Total);
		System.out.println("total working days will be: " + Days);
		System.out.println("total working hours will be: " + Work_Hr);
		}
	}
}
