package atm;

//Class Withdrawal represents and ATM withdrawal transaction
public class Withdrawal {
	
	//attributes
	private int accountNumber; // account to withdraw funds from
	private double amount; // amount to withdraw
	
	//references to associated objects
	private Screen screen; // ATM's screen
	private Keypad keypad; // ATM's keypad
	private CashDispenser cashDispenser; // ATM's cash dispenser
	private BankDatabase bankDatabase; // account info database
	
	//constructor with no arguements
	public Withdrawal()
	{
		
	};
	
	//operations
	public void execute()
	{
		
	}
	
	
}
