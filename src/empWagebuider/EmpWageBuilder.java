package empWagebuider;
import java.util.*;

public class EmpWageBuilder {
	public static final int IS_FULL_TIME=1;
	public static final int IS_PART_TIME=0;
	public static final int EMP_RATE_PER_HR=20;
	public static final int WORKING_DAYS_IN_MONTH=2;
	public static final int MAX_HRS_IN_MONTH=10;
	public static int empWageCalculation() //Wage Calculation method
	{
		int empHrs=0,totalEmpHour=0,totalWorkingDay=0;
		while(MAX_HRS_IN_MONTH > totalEmpHour && WORKING_DAYS_IN_MONTH > totalWorkingDay)
		{
			totalWorkingDay++;
			Random rand=new Random();
			int n=rand.nextInt(3);
			switch(n)
			{
			case 1:
				empHrs=8;
				break;
			case 2:
				empHrs=4;
				break;
			default:

				break;
				
			}
		totalEmpHour=totalEmpHour+empHrs;
		System.out.println("Day : "+totalWorkingDay+" Emp Hours = "+empHrs);
	}
		int totalWage=EMP_RATE_PER_HR*empHrs;
		System.out.println("total Employee Wage = "+totalWage);
		return totalWage;
	}
	
	public static void main(String ards[])
	{
		System.out.println("Welcome to EmployeeWage Computation");
	//empWageCalculation Method call
		empWageCalculation();
	
	}
}