package empWagebuider;
import java.util.*;

public class EmpWageBuilder {
	public static void main(String ards[])
	{
		System.out.println("Welcome to EmployeeWage Computation");
		Random rand=new Random();
		int n=rand.nextInt(2);
		System.out.println(n);
		if(n==1)
		{
			System.out.println("Employee is present");
			
		}
		else
		{
			System.out.println("Employee is Absent");
		}
		
	}

}
