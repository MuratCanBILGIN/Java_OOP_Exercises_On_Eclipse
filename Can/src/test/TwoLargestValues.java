package test;

import java.util.Scanner;

public class TwoLargestValues {

	public static void main(String[] args) {
		
		int[] sayilar = new int[10];
		
		Scanner input = new Scanner(System.in);
		
		int geciciSayiTutanDegisken;
		
		for(int i = 0; i < 10; i++)
		{
			Boolean ayniBulunduMu = false;
			System.out.print("Please enter a (integer)number: ");
			geciciSayiTutanDegisken = input.nextInt();
			for(int j = 0;j < i; j++)
			{
				if(sayilar[j] == geciciSayiTutanDegisken)
				{
					ayniBulunduMu = true;
					break;
				}
			}
			if (ayniBulunduMu == false) {
				sayilar[i] = geciciSayiTutanDegisken;
			}
			
			if(ayniBulunduMu == true)
			{
				i--;
				ayniBulunduMu = false;
			}
			System.out.println();
			
		}
		
		int largestNumber = sayilar[0];
		int secondLargestNumber = 0;
		boolean farkliyiBuldukMu = false;
		
		for(int i = 0; i <10 ; i++)
		{
			if(sayilar[i] > largestNumber)
			{
				largestNumber = sayilar[i];
				//secondLargestNumber = largestNumber;
			}/*else
				if(sayilar[i] > secondLargestNumber)
				{
					secondLargestNumber = sayilar[i];
				}*/
		}
		
		for(int i = 0; i < 10 ; i++)
		{
			if(sayilar[i] != largestNumber)
			{
				secondLargestNumber = sayilar[i];
				farkliyiBuldukMu = true;
			}
			
			if (farkliyiBuldukMu) {
				break;
			}
		}
		
		for(int i = 0; i < 10; i++)
		{
			if (sayilar[i] == largestNumber) {
				continue;
			}
			
			if (sayilar[i] > secondLargestNumber) {
				secondLargestNumber = sayilar[i];
			}
		}
		
		
		System.out.println("Largest number: " + largestNumber);
		System.out.println("Second largest number: "+ secondLargestNumber);
	}
	
	

		
}
