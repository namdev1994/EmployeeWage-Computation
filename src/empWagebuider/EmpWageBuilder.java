package empWagebuider;
import java.util.*;

public class EmpWageBuilder implements EmpWageInterface{
	//constants
	public static final int Is_Full_Time=1;
	public static final int Is_Part_Part=0;
	private int numOfCompany=0;
	private CompanyEmpWage[] companyEmpWageArray;
	public EmpWageBuilder()
	{
		companyEmpWageArray=new CompanyEmpWage[5];
	}
	public void addCompanyEmpWage(String company, int empRatePerHr, int workingDayInMonth, int maxHoursInMonth)
	{
		companyEmpWageArray[numOfCompany]=new CompanyEmpWage(company,empRatePerHr,workingDayInMonth,maxHoursInMonth);
		numOfCompany++;
	}
	public void computeWage()
	{
		for(int i=0;i< numOfCompany;i++)
		{
			companyEmpWageArray[i].setTotalEmpWage(this.empWageCalculation(companyEmpWageArray[i]));
			System.out.println(companyEmpWageArray[i]);
		}
	}
	public int empWageCalculation(CompanyEmpWage companyEmpWage)
	{
		int empHrs=0,totalEmpHrs=0,totalWorkingDay=0;
	
	while(companyEmpWage.maxHoursInMonth > totalEmpHrs && companyEmpWage.workingDayInMonth > totalWorkingDay)
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
	return totalEmpHrs*companyEmpWage.empRatePerHr;
	}

	public static void main(String ards[])
	{
		System.out.println("Welcome to EmployeeWage Computation");
		EmpWageBuilder empWageBuilder=new EmpWageBuilder();
		empWageBuilder.addCompanyEmpWage("Dmart",20,2,10);
		empWageBuilder.addCompanyEmpWage("Reliance",20,3,20);
		empWageBuilder.computeWage();
}
}