import java.lang.*;
import java.util.Scanner;

public class CountNumberOfDigits
{
	
	
	CountNumberOfDigits(long n)
	{
		
		if (n<=10000000000L)
		{
			long num=n;
			long cout=0;
			while(num>0)
			{
				 
				long lastnum=num%10;
				num=num/10;
				
				if(lastnum>0)
				{
					cout=cout+1;
				}
			}
			
			System.out.println("Degit :"+cout);
			
		}
		
		else
		{
			System.out.println("Wrong input!");
		}
	}
	
	public static void main(String[] args)
	{
		
		Scanner numbers= new Scanner(System.in);  
		System.out.print("Input an integer number less than ten billion: ");
		long  input= numbers.nextLong();
		CountNumberOfDigits n= new CountNumberOfDigits(input);
		
	}
}