package CriticalThinking;

public class BankAccount {

	protected String firstName;
	protected String lastName;
	protected int accountID;
	protected double balance;
	protected double totalDeposits;
	protected double totalWithdrawals;
	protected double interestRate;
	protected double overdraftFee;
	
	//Initialize balance to zero
	public BankAccount() {
		this.balance = 0.0;
	}
	
	//Accepts a single value double dollar amount, and the parameter value is added to the balance. Additionally, track total deposits made.
	public void deposit(double amount) {
		balance = balance + amount;
		totalDeposits = totalDeposits + amount;
	}
	
	//Accepts a single value double dollar amount; the parameter value is subtracted from the balance. Additionally, track total withdrawals made
	public void withdrawal(double amount) {
		balance = balance - amount;
		totalWithdrawals = totalWithdrawals + amount;
	}
	
	//Setter for accountID
	public void setAccountID(int accountID) {
		this.accountID = accountID;
	}
	
	//Setter for firstName
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	//Setter for lastName
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	//Getter for accountID
	public int getAccountID() {
		return accountID;
	}
	
	//Getter for firstName
	public String getFirstName() {
		return firstName;
	}
	
	//Getter for lastName
	public String getLastName() {
		return lastName;
	}
	
	//Getter for balance
	public double getBalance() {
		return balance;
	}
	
	//Initialize method for accountSummary
	public void accountSummary() {
		System.out.println("Name: " + " " + firstName + " " + lastName);
		System.out.println("Account ID: " + accountID);
		System.out.println("Current Balance: " + balance);
		System.out.println("Deposits: " + totalDeposits);
		System.out.println("Withdrawals: " + totalWithdrawals);
	}
	}
