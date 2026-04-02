package test;

import java.util.Scanner;

public class IntegerSetTest
{
	public static void main(String[] args)
	{
		
	
	
		Scanner input = new Scanner(System.in);
		
		IntegerSet set1 = new IntegerSet();
		IntegerSet set2 = new IntegerSet();
		IntegerSet set3 = new IntegerSet();
		IntegerSet set4 = new IntegerSet();
		
		
		set1.insertElement(5);
		set1.insertElement(15);
		
		set2.insertElement(5);
		set2.insertElement(15);
		
		set3.insertElement(5);
		
		set4.insertElement(20);
		
		IntegerSet.isEqualTo(set1, set2);
		IntegerSet.isEqualTo(set1, set3);
	
		
		System.out.println();
		
		
		
		
		IntegerSet setIntersection = IntegerSet.intersections(set1, set3);

		System.out.println(setIntersection.toSetString());
		System.out.println();
		
		
		System.out.println("------------------------");
		System.out.println();
		
		
		IntegerSet setUnion =  IntegerSet.union(set1,set2);
		
		System.out.println(setUnion.toSetString());
		System.out.println();
	
	}
}
