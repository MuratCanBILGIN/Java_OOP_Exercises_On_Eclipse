package test;

import java.util.Scanner;

public class DateClassTest {

	public static void main(String[] args) {


		Scanner inputScanner = new Scanner(System.in);
		
		DateClass dateClass1 = new DateClass(89, 596);
		DateClass dateClass2 = new DateClass(2, 2, 2);
		DateClass dateClass3 = new DateClass("June", 25, 2000);

		
		System.out.println("Day: " + dateClass1.getDay());
		System.out.println("Month: " + dateClass1.getMonth());
		System.out.println("Year: " + dateClass1.getYear());
		System.out.println();
		
		System.out.println("Day: " + dateClass2.getDay());
		System.out.println("Month: " + dateClass2.getMonth());
		System.out.println("Year: " + dateClass2.getYear());
		System.out.println();
		
		System.out.println("Day: " + dateClass3.getDay());
		System.out.println("Month: " + dateClass3.getMonth());
		System.out.println("Year: " + dateClass3.getYear());
		System.out.println();
		
	}

}
