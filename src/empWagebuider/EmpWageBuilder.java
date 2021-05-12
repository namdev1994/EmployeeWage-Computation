package empWagebuider;
import java.util.*;

public class EmpWageBuilder implements EmpWageInterface{
	//constants
	public static final int Is_Full_Time=1;
	public static final int Is_Part_Part=0;
	private int numOfCompany=0;
	public ArrayList<CompanyEmpWage>companyWageList;
	public Map<String,CompanyEmpWage>companyToEmpWageMap;
	public EmpWageBuilder()
	{
		companyWageList=new ArrayList<>();
		companyToEmpWageMap=new HashMap<>();
	}
	public void addCompanyEmpWage(String company, int empRatePerHr, int workingDayInMonth, int maxHoursInMonth)
	{
	 CompanyEmpWage companyEmpWage=new CompanyEmpWage(company,empRatePerHr,workingDayInMonth,maxHoursInMonth);
		companyWageList.add(companyEmpWage);
		companyToEmpWageMap.put(company, companyEmpWage);
	}
	public void computeWage()
	{
		for(int i=0;i< companyWageList.size();i++)
		{
			CompanyEmpWage companyEmpWage=companyWageList.get(i);
			companyEmpWage.setTotalEmpWage(this.empWageCalculation(companyEmpWage));
			System.out.println(companyEmpWage);
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
		System.out.println("for Day "+totalWorkingDay+" Daily Emp Wage  is : "+empHrs*companyEmpWage.empRatePerHr);	
	}
	return totalEmpHrs*companyEmpWage.empRatePerHr;
	}
	public int getTotalWage(String company)
	{
		return companyToEmpWageMap.get(company).totalEmpWage;
	}

	public static void main(String ards[])
	{
		System.out.println("Welcome to EmployeeWage Computation");
		EmpWageBuilder empWageBuilder=new EmpWageBuilder();
		empWageBuilder.addCompanyEmpWage("Dmart",20,2,10);
		empWageBuilder.addCompanyEmpWage("Reliance",20,3,20);
		//empWageBuilder.computeWage();
		System.out.println("Total Wage for Dmart Company: "+empWageBuilder.getTotalWage("Dmart"));
}
}