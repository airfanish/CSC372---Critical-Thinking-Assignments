package CriticalThinking;

public class Test {

	public Test() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		
		//Step 1 - Create an account: firstName, lastName, balance, interestRate, overdraftFee
		
		CheckingAccount myAccount = new CheckingAccount("Jane", "Doe", 100.0, 0.05, 30.0);
		
		//Step 2 - Test a normal withdrawal
		System.out.println("--- Withdrawing $25 ---");
		myAccount.processWithdrawal(25.0);
		myAccount.accountSummary();
		
		//Step 3 - Test an overdraft
		System.out.println("--- Withdrawing $80 ---");
		myAccount.processWithdrawal(80.0);
		myAccount.accountSummary();
		
		//Step 4 - Test a deposit
		System.out.println("--- Deposit $200 ---");
		myAccount.deposit(200.0);
		myAccount.accountSummary();
		
		//Step 5 - Apply the interest rate
		double earned = myAccount.applyInterestRate();
		System.out.println("You have earned $" + earned + " in interest.");
		myAccount.accountSummary();
	}

}
