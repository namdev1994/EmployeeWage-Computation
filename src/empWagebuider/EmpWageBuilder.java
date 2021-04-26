package empWagebuider;
import java.util.*;

public class EmpWageBuilder {
	public static void main(String ards[])
	{
		System.out.println("Welcome to EmployeeWage Computation");
		int EmpRate_PerHr=20;
		int FullDay_Hr=8;
		Random rand=new Random();
		int n=rand.nextInt(2);
		System.out.println(n);
		if(n==1)
		{
			int income=EmpRate_PerHr*FullDay_Hr;
			System.out.println("Employee is present And Full Earning is="+income);
			
		}
		else
		{
			System.out.println("Employee is Absent");
		}
		
	}

}
