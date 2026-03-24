package test;

import java.util.Scanner;

public class DateTest {

	public static void main(String[] args) {
		
		int day;
		int month;
		int year;
		
		Scanner input = new Scanner(System.in);
		
		Date date = new Date(0, 0, 0);

		System.out.println("Enter day/month/year: ");
		date.setDay(input.nextInt());
		date.setMonth(input.nextInt());
		date.setYear(input.nextInt());		

		date.displayDate();
		
		
		
	}

}
