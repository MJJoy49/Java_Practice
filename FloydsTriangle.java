import java.lang.*;
import java.util.Scanner;
public class FloydsTriangle
{
	FloydsTriangle(int Rows)
	{
		int number = 1;
		for (int row= 1; row<=Rows; row++)
		{
			for (int column=1; column<=row; column++)
			{
				System.out.print(number + " ");
				number++;
			}
				System.out.println();
		}
	}


	public static void main(String[] args)
	{
   
		System.out.print("Input number of rows : ");
		Scanner in = new Scanner(System.in);
		int Rows = in.nextInt();
		FloydsTriangle ob=new FloydsTriangle(Rows);
	}
}