package empWagebuider;
import java.util.*;

public class EmpWageBuilder {
	public static void main(String ards[])
	{
		System.out.println("Welcome to EmployeeWage Computation");
		int Is_Full_Time=1;
		int Is_Part_Part=0;
		int EmpRate_PerHr=20;
		int FullDay_Hr=8;
		int PartTime_Hr=4;
		Random rand=new Random();
		int n=rand.nextInt(2);
		Random randX=new Random();
		int m=randX.nextInt(2);
		if(n==1)
		{
			if(m==Is_Full_Time)
			{
				
			int income=EmpRate_PerHr*FullDay_Hr;
			System.out.println("Employee Is Present And Full Day Earning Is="+income);
			}
			else
			{
				int income=EmpRate_PerHr*PartTime_Hr;
				System.out.println("Employee Is Present And Part Time Day Earning Is="+income);
			}
			
		}
		else
		{
			System.out.println("Employee is Absent");
		}
		
	}

}
