package test;

public class ChargeAccount {
	
	//Instance Variables
	private int account_number;
	private int balance_begg_month;
	private int total_charge;
	private int total_credit;
	private int allowed_credit_limit;
	
	
	//Constructor Method
	public ChargeAccount(int account_number, int balance_begg_month, int total_charge, int total_credit, int allowed_credit_limit)
	{
		this.account_number = account_number;
		this.allowed_credit_limit = allowed_credit_limit;
		this.balance_begg_month = balance_begg_month;
		this.total_charge = total_charge;
		this.total_credit = total_credit;
	}
	
	
	//Methods
	public void newBalance()
	{
		int new_balance = balance_begg_month + total_charge - total_credit;
		
		if(new_balance > allowed_credit_limit)
		{
			System.out.println();
			System.out.println("Credit limit exceeded.");
		};
		
		System.out.println("New balance: " + new_balance);
	}
	
	
	
	//Get, Set Methods
	public int getAccount_number() {
		return account_number;
	}
	public void setAccount_number(int account_number) {
		this.account_number = account_number;
	}
	public int getBalance_begg_month() {
		return balance_begg_month;
	}
	public void setBalance_begg_month(int balance_begg_month) {
		this.balance_begg_month = balance_begg_month;
	}
	public int getTotal_charge() {
		return total_charge;
	}
	public void setTotal_charge(int total_charge) {
		this.total_charge = total_charge;
	}
	public int getTotal_credit() {
		return total_credit;
	}
	public void setTotal_credit(int total_credit) {
		this.total_credit = total_credit;
	}
	public int getAllowed_credit_limit() {
		return allowed_credit_limit;
	}
	public void setAllowed_credit_limit(int allowed_credit_limit) {
		this.allowed_credit_limit = allowed_credit_limit;
	}
}
