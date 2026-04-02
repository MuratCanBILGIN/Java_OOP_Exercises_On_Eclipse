package test;

import java.util.Scanner;

public class EnhancedRectangleTest {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		EnhancedRectangleClass rectangle1 = new EnhancedRectangleClass(1, 1, 3, 1, 1, 3, 3, 3);
		
		System.out.printf("Rectangle's perimeter: %.1f\n",rectangle1.perimeter());
		System.out.printf("Rectangle's area: %.1f\n",rectangle1.area());
		System.out.printf("Rectangle's length: %.1f\n",rectangle1.length());
		System.out.printf("Rectangle's width: %.1f\n",rectangle1.width());
		System.out.printf("Rectangle's square situation: %b\n",rectangle1.isSquare());
		
	}

}
