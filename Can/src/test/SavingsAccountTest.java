package test;

import java.util.Scanner;

public class SavingsAccountTest {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		SavingAccount saver1 = new SavingAccount(2000.00);
		SavingAccount saver2 = new SavingAccount(3000.00);

		
		System.out.print("Monthly interest saver1: ");
		saver1.calculateMonthlyInterest();
		System.out.println(saver1.getSavingsBalance());
		
		System.out.print("Monthly interest saver2: ");
		saver2.calculateMonthlyInterest();
		System.out.println(saver2.getSavingsBalance());
		
		SavingAccount.modifyInterestRate(5.0);
		
		System.out.print("Monthly interest saver1: ");
		saver1.calculateMonthlyInterest();
		System.out.println(saver1.getSavingsBalance());
		
		System.out.print("Monthly interest saver2: ");
		saver2.calculateMonthlyInterest();
		System.out.println(saver2.getSavingsBalance());
		
	}

}
