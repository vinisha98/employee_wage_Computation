package com.employeedetails;

public class employeedetails {
	public static final  int Is_Present=1;
		public static final int Is_Part_Time=2;
			public static final int Sal_Per_Hr=20;


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Welcome to Employee Wage Computation Program on Master Branch");
		int Emp_Hr=0;
		int Total = 0;
		int Days = 0;
		int Work_Hr = 0;
		while(Days<=20)
		{
		int emp = (int) Math.floor(Math.random() * 10) %  3;
		switch(emp) { 
			case 1:
				System.out.println("Employee is present");
				Emp_Hr=8;
				break;
			case 2:
				System.out.println("Employee is parttimer");
				Emp_Hr=4;
				break;
			case 3:
				System.out.println("Employee is absent");
				Emp_Hr=0;
				break;
			default:
				System.out.println("contition doesnot exit");
		}
		int Daily_Wage= (Sal_Per_Hr * Emp_Hr);
		Total= (Total+Daily_Wage);
		Days=(Days+1);
		Work_Hr=(Work_Hr+Emp_Hr);
		}
		System.out.println("totalsalary will be");
		System.out.println(Total);
		System.out.println("total working hours will be");
		System.out.println(Work_Hr);	
	}
}
