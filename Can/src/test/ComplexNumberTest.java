package test;

import java.util.Scanner;

public class ComplexNumberTest {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		ComplexNumbers number1 = new ComplexNumbers(5.0, 10.0);
		
		ComplexNumbers number2 = new ComplexNumbers(6.0, 7.0);
		
		
		
		System.out.println(number1 + " + " + number2 + " = " +  
		ComplexNumbers.addTwoComplexNumbers(number1, number2));
		
		System.out.println();
		
		System.out.println(number1 + " - " + number2 + " = " + 
		ComplexNumbers.subtractTwoComplexNumbers(number1, number2));
		
		System.out.println();
		
		System.out.println("Number 1: " + number1);
		System.out.println("Number 2: " + number2);
		

	}

}
