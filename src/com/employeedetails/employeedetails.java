package com.employeedetails;

public class employeedetails {
	public static final  int Is_Present=1;
		public static final int Is_Part_Time=2;
			public static final int Sal_Per_Hr=20;

			public static int computeEmployeeWage(){
				System.out.println("Welcome to Employee Wage Computation Program on Master Branch");
				int Emp_Hr=0;
				int Total = 0;
				int Days = 0;
				int Work_Hr = 0;
				while(Days<20 && Work_Hr<100) 
				{
				int emp = (int) Math.floor(Math.random() * 10) %  3;
				switch(emp) { 
					case Is_Present:
						Emp_Hr=8;
						break;
					case Is_Part_Time:
						Emp_Hr=4;
						break;
					default:
						Emp_Hr=0;
				}
				int Daily_Wage= (Sal_Per_Hr * Emp_Hr);
				Total= (Total+Daily_Wage);
				Days=(Days+1);
				Work_Hr=(Work_Hr+Emp_Hr);
				}
				System.out.println("totalsalary will be: " + Total);
				System.out.println(Total);
				System.out.println("total working days will be: " + Days);
				System.out.println("total working hours will be: " + Work_Hr);
				return Total;
			}
			
	public static void main(String[] args) {
		computeEmployeeWage();
	}
}
