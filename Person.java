import java.lang.*;

public class Person
{
	private String name;
	private int age;
	
	Person(String name, int age)
	{
		this.name=name;
		this.age=age;
		
	}
	
	void ShowDetails()
	{
		System.out.println("The person name: "+name);
		System.out.println("The person age: "+age);
	}
	
	
	public static void main (String[] args)
	{
		
		
		Person p1=new Person("maria",19);
		p1.ShowDetails();
		
		
	}
}