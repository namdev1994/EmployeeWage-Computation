package empWagebuider;
import java.util.*;

public class EmpWageBuilder {
	//constants
	public static final int Is_Full_Time=1;
	public static final int Is_Part_Part=0;
	public static int empWageCalculation(String company, int empRatePerHr, int workingDayInMonth, int maxHoursInMonth) //method implementation with parameter
	{
		int empHrs=0,totalEmpHrs=0,totalWorkingDay=0;
	
	while(maxHoursInMonth > totalEmpHrs && workingDayInMonth > totalWorkingDay)
	{
		totalWorkingDay++;
		Random rand=new Random();
		int check=rand.nextInt(3);
		System.out.println("random number :"+check);
		switch(check)
		{
		case Is_Full_Time:
			 empHrs=8;
			 break;
		case  Is_Part_Part:
			 empHrs=4;
			 break;
		default:
			 empHrs=0;
			 break;
			
		}
		totalEmpHrs +=empHrs;
		System.out.println("Working Days : "+totalWorkingDay+" empHours = "+empHrs);
		System.out.println("Total employee work Hours : "+totalEmpHrs);	
	}
	int totalWage=empRatePerHr*totalEmpHrs;
	System.out.println("total Employee Wage for "+company+" is "+totalWage);
	return totalWage;
	}

	public static void main(String ards[])
	{
		System.out.println("Welcome to EmployeeWage Computation");
		empWageCalculation("Dmart",20,3,15);    // method call
		empWageCalculation("Reliance",20,2,10); // method call
				
}
}