package test;

import java.util.Scanner;

public class RationalTest {

	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		
		Rational rational1 = new Rational(5,10);
		Rational rational2 = new Rational(3,5);
		
		int x = rational1.getNumerator();
		int y = rational1.getDenominator();
		
		System.out.println(x + "/" + y);
		
		Rational rational3 = Rational.addTwoRationalNumbers(rational1, rational2);
		
		int z = rational3.getNumerator();
		int t = rational3.getDenominator();
		
		System.out.println();
		
		System.out.println(z + "/" + t);
		
		Rational rational4 = Rational.subtractTwoRationalNumbers(rational1, rational2);
		
		z  = rational4.getNumerator();
		t = rational4.getDenominator();
		
		System.out.println();
		
		System.out.println(z + "/" + t);
		
		Rational rational5 = Rational.multiplyTwoRationalNumbers(rational1, rational2);
		
		z  = rational5.getNumerator();
		t = rational5.getDenominator();
		
		System.out.println();
		
		System.out.println(z + "/" + t);
		
		Rational rational6 = Rational.divideTwoRationalNumbers(rational1, rational2);
		
		z  = rational6.getNumerator();
		t = rational6.getDenominator();
		
		System.out.println();
		
		System.out.println(z + "/" + t);
		
		System.out.println();
		
		System.out.println(rational1.printRational()+ " " + rational6.printRational());
		
		System.out.println();
		
		System.out.println(rational6.printDecimal(rational6, 5));
		
		System.out.println();
		
		Rational rational7 = new Rational(1,2000);
		System.out.println(rational7.printDecimal(rational7, 10));
		
		
	}

}
