//PART 2: Implement a CheckingAccount class that inherits from the BankAccount class
package CriticalThinking;

public class CheckingAccount extends BankAccount {
	
	double interestRate;
	double overdraftFee;
		
	//implement Checking Account with interest rate and overdraft fee
	public CheckingAccount(String firstName, String lastName, double balance, double interestRate, double overdraftFee) {
		super(); //Calls the BankAccount() constructor to set balance to 0.0
		
		//Using inherited setters
		setFirstName(firstName);
		setLastName(lastName);
		
		this.balance = balance;
		this.interestRate = interestRate;
		this.overdraftFee = overdraftFee;
		}
	
	//Creating an overdraft fee rule that will display a negative balance that includes a $30 overdraft fee and denotes that a fee has been assessed
	public void processWithdrawal(double amount) {
		super.withdrawal(amount);
		
		if (balance < 0) {
		super.withdrawal(overdraftFee);
		System.out.println("Your account has been overdrafted. An overdraft fee of $" + overdraftFee + " will be applied to your account.");
		}
	}
	
	//Apply interest fee to the account balance
	public double applyInterestRate() {
		double interest = 0.0;
		
		if (balance >= 0) {
				interest = balance * interestRate;
				deposit(interest);
		}
		return interest;
	}
		
	//Will display all superclass attributes and provide an additional interest rate
	public void accountSummary() {
		super.accountSummary();
		System.out.println("Overdraft Fee: " + overdraftFee);
		System.out.println("Interest Rate: " + interestRate);
	}
}


