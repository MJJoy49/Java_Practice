import java.lang.*;

public class InchesToMeters
{
	public double meters;
	final double m=0.0254;
	
	InchesToMeters(double inches)
	{
		meters=inches*m;
		System.out.println(inches+"inch is "+meters+" meters");
	}
	
	public static void main(String[] args)
	{
		InchesToMeters convert1=new InchesToMeters(1000);
		
	}
}