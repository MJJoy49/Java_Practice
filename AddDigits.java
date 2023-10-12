import java.lang.*;
import java.util.Scanner;

public class AddDigits
{
	
	
	AddDigits(int n)
	{
		if (n<=1000 && n>=0)
		{
			int num=n;
			int add=0;
			while(num>0)
			{
				 
				int lastnum=num%10;
				add=add+lastnum;
				num=num/10;
			}
			
			System.out.println(add);
		}
		
		else
		{
			System.out.println("Wrong input!");
		}
	}
	
	public static void main(String[] args)
	{
		
		Scanner degits= new Scanner(System.in);  
		System.out.print("Input an integer between 0 and 1000: ");
		int  input= degits.nextInt(); 
		
		
		AddDigits n= new AddDigits(input);
		
	}
}