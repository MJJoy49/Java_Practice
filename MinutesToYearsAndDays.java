import java.lang.*;
import java.util.Scanner;

public class MinutesToYearsAndDays
{
	
	final int y=525960;
	
	MinutesToYearsAndDays(int n)
	{
		int days=(n/60/24)%365;
		int years=(1*n)/y;
		
		System.out.println(n+" minutes is approximately "+years+" years and "+days+" days");
	
	}
	
	public static void main(String[] args)
	{
		
		Scanner mins= new Scanner(System.in);  
		System.out.print("Input the number of minutes: ");
		int  input= mins.nextInt();
		MinutesToYearsAndDays n= new MinutesToYearsAndDays(input);
		
	}
}