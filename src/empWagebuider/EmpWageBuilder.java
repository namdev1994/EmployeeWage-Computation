package empWagebuider;
import java.util.*;

public class EmpWageBuilder {
	//constants
	public static final int Is_Full_Time=1;
	public static final int Is_Part_Part=0;
	private final String company;
	private final int empRatePerHr;
	private final int workingDayInMonth;
	private final int maxHoursInMonth;
	
	//constructor
	public EmpWageBuilder(String company, int empRatePerHr, int workingDayInMonth, int maxHoursInMonth) {
		this.company = company;
		this.empRatePerHr = empRatePerHr;
		this.workingDayInMonth = workingDayInMonth;
		this.maxHoursInMonth = maxHoursInMonth;
		
	}
	public int empWageCalculation()
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
	return totalEmpHrs*empRatePerHr;
	}

	public static void main(String ards[])
	{
		System.out.println("Welcome to EmployeeWage Computation");
		//boject creation of Class
		EmpWageBuilder dmart=new EmpWageBuilder("Dmart",20,2,10);
		System.out.println("EmpWage for "+dmart.company+" is : "+dmart.empWageCalculation());
		EmpWageBuilder reliance =new EmpWageBuilder("Reliance",20,2,10);
		System.out.println("EmpWage for "+reliance.company+" is : "+reliance.empWageCalculation());
	
		
}
}