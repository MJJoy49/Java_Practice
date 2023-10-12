import java.lang.*;

public class Person
{
	private String name;
	private int nationalId;
	private int age;
	private double height;
	
	
	
	//------------cons-----------
	Person(){}
	Person(String name, int nationalId,int age,double height)
	{
		this.name=name;
		this.nationalId=nationalId;
		this.age=age;
		this.height=height;
	}
	
	
	
	
	//------------set---------
	void setName(String name)
	{
		this.name= name;
	}
	
	void setNationalId(int nationalId)
	{
		this.nationalId=nationalId;
	}
	
	void setAge(int age)
	{
		this.age=age;
	}
	
	void setHeight(double height)
	{
		this.height=height;
	}
	
	
	
	
	//-----------get-------
	String getName()
	{
		return name;
	}
	
	int getNationalId()
	{
		return nationalId;
	}
	
	int getAge()
	{
		return age;
	}
	
	double getHeight()
	{
		return height;
	}
	
	
	
	
	//----------showDetails----------
	
	void ShowDetails()
	{
		System.out.println("The person name: "+name);
		System.out.println("The person national Id: "+nationalId);
		System.out.println("The person age: "+age);
		System.out.println("The person height: "+height);
		System.out.println(" ");
		
	}
	
	
	
	
	
	
	//------------------main-------------
	public static void main (String[] args)
	{
		
		//--------ob1--------
		Person p1=new Person("Topu",27733477,19,5.6);
		p1.ShowDetails();
		
		
		//--------ob2---------
		Person p2=new Person();
		p2.setName("Siam");
		p2.setNationalId(234468264);
		p2.setAge(20);
		p2.setHeight(5.8);
		p2.ShowDetails();
		
		
	}
	
	static void Person()
	{
		System.out.println("THIS IS PARSOM DATA");
	}
	

}