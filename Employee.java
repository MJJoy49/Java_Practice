import java.lang.*;

public class Employee {
  private String name;
  private String jobTitle;
  private double salary;

  public Employee(String name, String jobTitle, double salary) 
  {
    this.name = name;
    this.jobTitle = jobTitle;
    this.salary = salary;
  }

  String getName() 
  {
    return name;
  }

  void setName(String name) 
  {
    this.name = name;
  }

  String getJobTitle() 
  {
    return jobTitle;
  }

   void setJobTitle(String jobTitle) 
   {
    this.jobTitle = jobTitle;
   }

   double getSalary() 
   {
    return salary;
   }

   void setSalary(double salary) 
	{
		this.salary = salary;
	}

  void raiseSalary(double percentage) 
  {
    salary = salary + salary * percentage / 100;
  }

   void EmployeeDetails() 
   {
    System.out.println("Name: " + name);
    System.out.println("Job Title: " + jobTitle);
    System.out.println("Salary: " + salary);
   }
  
  
 
  public static void main(String[] args) 
  {

    Employee p1 = new Employee("Rima", "Manager", 40000);
    Employee p2 = new Employee("Maria", "Software Engineer", 60000);
    System.out.println("\nEmployee Details:");
    p1.EmployeeDetails();
    p2.EmployeeDetails();

    p1.raiseSalary(4);
    p2.raiseSalary(6);

    System.out.println("\nAfter raising salary:");
    System.out.println("\n4% for 'Rima':");
    p1.EmployeeDetails();
    System.out.println("\n6% for 'Maria':");
    p2.EmployeeDetails();
  }

}