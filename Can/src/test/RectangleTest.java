package test;

import java.util.Scanner;

public class RectangleTest {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the rectangle length: ");
		double length = input.nextDouble();
		System.out.println();
		
		System.out.println("Enter the rectangle width: ");
		double width = input.nextDouble();
		System.out.println();
		
		Rectangle rectangle1 = new Rectangle(length, width);
		
		System.out.println("Rectangle area: "+ rectangle1.areaOfRectangle() + "\n" + "Rectangle perimeter: " + rectangle1.calculatePerimeter());
	}

}
