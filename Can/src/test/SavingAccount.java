package test;

public class SavingAccount {
	
	static double annualInterestRate = 0.0;
	private double savingsBalance = 0.0;
	
	
	
	
	public SavingAccount(double savingsBalance) {
		this.savingsBalance = savingsBalance;
	}
	
	
	
	
	public void calculateMonthlyInterest()
	{
		double monthlyInterest = savingsBalance * ((annualInterestRate/100)/12);
		savingsBalance = savingsBalance + monthlyInterest;
	}
	
	
	public static void modifyInterestRate(double newValue)
	{
		annualInterestRate = newValue;
	}
	
	public double getSavingsBalance()
	{
		return savingsBalance;
	}
}
