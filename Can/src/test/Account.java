package test;

public class Account
{

	private double balance;
	
	
	
	
	public Account(double initialBalance)
	{
		if(initialBalance > 0.0)
			balance = initialBalance;
	}

	
	
	
	public void credit(double amount)
	{
		balance = balance + amount;
	}
	
	public double getBalance()
	{
		return balance;
	}
	
	public void getDebit(double debit)
	{
		if(debit > balance || debit <= 0)
		{
			System.out.println("Debit amount exceeded account balance or less than 0");
		}else
		{
			System.out.printf("Here is your debit amount: $%.2f", debit);
			balance = balance - debit;
			System.out.println();
			System.out.printf("Your new account balance: $%.2f", balance);
		}
		
		
	}
	
}
