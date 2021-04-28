package empWagebuider;
import java.util.*;

public class EmpWageBuilder {
	public static void main(String ards[])
	{
		System.out.println("Welcome to EmployeeWage Computation");
	
	//empWageCalculation Method call
		empWageCalculation();
	
	}
	
	
	
	//method Implementation
	
		public static void empWageCalculation()
		{
		int fullTimeDays=0;
		int partTimedays=0;
		int workingDayMonth=20;
		int maxHoursInMonth=100;
		int totalempHour=0;
		int totalWorkingDay=0;
		int absent=0;
		int income=0;
		int Is_Full_Time=1;
		int Is_Part_Part=0;
		int EmpRate_PerHr=20;
		int FullDay_Hr=8;
		int PartTime_Hr=4;
		while(maxHoursInMonth > totalempHour && workingDayMonth > totalWorkingDay)
		{
			totalWorkingDay++;
			Random rand=new Random();
			int n=rand.nextInt(3);
			switch(n)
			{
			case 1:
				fullTimeDays++;
				totalempHour=totalempHour+FullDay_Hr;
				break;
			case 2:
				partTimedays++;
				totalempHour=totalempHour+PartTime_Hr;
				break;
			default:
				absent++;
				break;
				
			}
		}
		int fullTimeIncome=EmpRate_PerHr*(FullDay_Hr*fullTimeDays);
		int partTimeIncome=EmpRate_PerHr*(PartTime_Hr*partTimedays);
		System.out.println("-----------------------------------------");
		System.out.println("FullTime Days in Month ="+fullTimeDays);
		System.out.println("PartTime Days in Month ="+partTimedays);
		System.out.println("Absent days in month ="+absent);
		System.out.println("Total Working Days in Month ="+(fullTimeDays+partTimedays));
		System.out.println("Total Hours ="+totalempHour);
		System.out.println("FullTime Income ="+fullTimeIncome);
		System.out.println("PartTime Income ="+partTimeIncome);
	
		
}
}