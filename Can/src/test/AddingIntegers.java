package test;

import java.util.Scanner;

public class AddingIntegers
{
	public static void main(String[] args)
	{
		Scanner inputScanner = new Scanner(System.in);
		
		int number1;
		int number2;
		int sum;
		
		System.out.print("Ilk sayiyi giriniz: ");
		number1 = inputScanner.nextInt();
		
		System.out.print("Ikinci sayiyi giriniz: ");
		number2 = inputScanner.nextInt();
		
		System.out.printf("Toplamlari: %d",sum = number1 + number2);
		
		inputScanner.close();
	}
}
