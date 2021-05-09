package empWagebuider;

public class CompanyEmpWage
{
	public final String company;
	public final int empRatePerHr;
	public final int workingDayInMonth;
	public final int maxHoursInMonth;
	public int totalEmpWage;
	
	//constructor
	public CompanyEmpWage(String company, int empRatePerHr, int workingDayInMonth, int maxHoursInMonth) {
		this.company = company;
		this.empRatePerHr = empRatePerHr;
		this.workingDayInMonth = workingDayInMonth;
		this.maxHoursInMonth = maxHoursInMonth;	
	}
	public void setTotalEmpWage(int totalEmpWage)
	{
		this.totalEmpWage=totalEmpWage;
	}
	public String toString()
	{
		return "total Emp Wage for company "+company+" is "+totalEmpWage;
	}
}
