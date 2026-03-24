package test;

import java.util.Scanner;

public class ChargeAccountTest {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		ChargeAccount account = new ChargeAccount(172, 36000, 40000, 50000, 100000);
		
		account.newBalance();

	}

}
