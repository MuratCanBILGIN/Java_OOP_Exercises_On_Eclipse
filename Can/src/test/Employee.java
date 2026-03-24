package test;

public class Employee
{

	// Instance Variables.
	String name;
	String lastName;
	double salary;
	double percentage;
		
	
	
	
	
	
	//Constructor
	public Employee(String name, String lastName, double salary)
	{
		this.name = name;
		this.lastName = lastName;
		if(salary <= 0.0)
		{
			this.salary = 0.0;
		}else
		{
			this.salary = salary;
		}
	}
	
	
		
	
	
	
	
	//Class Methods
	public double yearlySalary()
	{
		return this.salary * 12;
	}
	
	public void raise(double percentage)
	{
		salary = salary + (salary * (percentage / 100));
	}
	
	
	
	
	
	
	
	//Get,Set Method
	public String getName()
	{
		return name;
	}
	
	public void setName(String name)
	{
		this.name = name;
	}
	
	public String getLastName()
	{
		return lastName;
	}
	
	public void setLastName(String lastName)
	{
		this.lastName = lastName;
	}
	
	public double getSalary()
	{
		return salary;
	}
	
	public void setSalary(double salary)
	{
		if(salary <= 0.0)
		{
			this.salary = 0.0;
		}else
		{
			this.salary = salary;
		}
	}
	
}
