import java.lang.*;

public class FahrenheitToCelsius
{
	
	public double celsius;
	
	FahrenheitToCelsius(double fahrenheit)
	{
		celsius=(5*(fahrenheit-32))/9;
		System.out.println(fahrenheit +" degree Fahrenheit is equal to "+celsius+" in Celsius.");
	}
	
	
	public static void main (String[] args)
	{
		FahrenheitToCelsius convert1= new FahrenheitToCelsius(212);
	}
}