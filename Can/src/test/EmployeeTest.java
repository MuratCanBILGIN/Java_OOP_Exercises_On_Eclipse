package test;

import java.nio.channels.Pipe.SourceChannel;
import java.util.Scanner;

public class EmployeeTest
{

	public static void main(String[] args)
	{
		//these variables are for place holding
		String name1, name2;
		String lastName1, lastName2;
		double salary1,salary2;
		double percentage1, percentage2;
		
		
		
		
		
		Scanner input = new Scanner(System.in);
		
		
		
		
		
		//worker variables
		Employee worker1 = new Employee(null, null, 0);
		Employee worker2 = new Employee(null, null, 0);
		
		
		
		
		
		
		//takes worker1 input
		System.out.printf("Enter the first worker's name information: ");
		name1 = input.nextLine();
		worker1.setName(name1);
		
		System.out.printf("Enter the first worker's last name information: ");
		lastName1 = input.nextLine();
		worker1.setLastName(lastName1);
		
		System.out.printf("Enter the first worker's salary information: $");
		salary1 = input.nextDouble();
		input.nextLine();
		worker1.setSalary(salary1);
		
		
		
		
		System.out.println();
		
		
		
		
		//takes worker2 input
		System.out.printf("Enter the second worker's name information: ");
		name2 = input.nextLine();
		worker2.setName(name2);
		
		System.out.printf("Enter the second worker's last name information: ");
		lastName2 = input.nextLine();
		worker2.setLastName(lastName2);
		
		System.out.printf("Enter the second worker's salary information: $");
		salary2 = input.nextDouble();
		input.nextLine();
		worker2.setSalary(salary2);
		
		
		
		System.out.println();
		
		
		//Shows workers monthly and yearly salaries.
		System.out.printf("%s monthly/yearly salary: $%.2f/$%.2f\n", worker1.getName(), worker1.yearlySalary(), worker1.yearlySalary());
		System.out.printf("%s monthly/yearly salary: $%.2f/$%.2f\n", worker1.getName(), worker2.getSalary(), worker2.yearlySalary());
		System.out.println();
		
		


		//Raises the salaries of workers.
		System.out.printf("How much raise do you want to give to the %s : %%", worker1.getName());
		percentage1 = input.nextDouble();
		input.nextLine();
		worker1.raise(percentage1);
		System.out.println();
		
		System.out.printf("How much raise do you want to give to the %s : %%", worker2.getName());
		percentage2 = input.nextDouble();
		input.nextLine();
		worker2.raise(percentage2);
		System.out.println();
		
		
		//Displays the newly changed yearly worker salaries
		System.out.printf("%s's new yearly salary: $%.2f\n", worker1.getName(), worker1.yearlySalary());
		System.out.printf("%s's new yearly salary: $%.2f\n", worker2.getName(), worker2.yearlySalary());

		
		
		
		
		
	}

}
