package empWagebuider;

public interface EmpWageInterface {
	public void addCompanyEmpWage(String company, int empRatePerHr, int workingDayInMonth, int maxHoursInMonth);
	public void computeWage();
	public int empWageCalculation(CompanyEmpWage companyEmpWage);
	

}
