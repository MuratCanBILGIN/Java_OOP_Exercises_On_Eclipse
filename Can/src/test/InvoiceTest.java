package test;

import java.util.Scanner;

public class InvoiceTest
{

	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		
		String partnumber1;
		String partdescription1;
		int purchasequantity1;
		double price1;
		
		
		
		System.out.printf("-----------WELCOME-----------");
		System.out.println();
		
		System.out.print("Please enter the part number: ");
		partnumber1 = input.nextLine();
		System.out.println();
		
		System.out.print("Please enter the part description: ");
		partdescription1 = input.nextLine();
		System.out.println();
		
		System.out.print("Please enter the purchase quantity: ");
		purchasequantity1 = input.nextInt();
		System.out.println();
		
		System.out.print("Please enter the price: $");
		price1 = input.nextDouble();
		System.out.println();
		
		
		
		Invoice invoice1 = new Invoice(partnumber1, partdescription1, purchasequantity1, price1);
		
		System.out.printf("Here is the amount you have to pay: $%.2f", invoice1.getInvoiceAmount());
	}

}
