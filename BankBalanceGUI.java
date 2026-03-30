package CriticalThinking;

import  java.awt.event.ActionEvent; //imports the ActionEvent class - for when buttons get clicked
import java.awt.event.ActionListener; //imports the ActionListener interface to respond when button gets clicked
import javax.swing.*; //imports all swing classes

public class BankBalanceGUI implements ActionListener{

	private BankAccount account; //handles the bank data (from previous CT assignment)
	private JFrame frame; //main program window
	private JPanel panel; //container
	private JLabel label; //label
	private JTextField text; //TextField
	private JButton showButton;
	private JButton depositButton;
	private JButton withdrawButton;
	private JButton exitButton;
	
	public static void main(String[] args) {
		new BankBalanceGUI(); //this starts the GUI
	}

	//This is the constructor that builds the GUI
	public BankBalanceGUI() {
		
		account = new BankAccount();
		
		String balanceInput = JOptionPane.showInputDialog(null, "Enter your current balance: ");		
		try {
			double startingBalance = Double.parseDouble(balanceInput);
			account.setBalance(startingBalance);
		}
		catch (NumberFormatException e) {
		    JOptionPane.showMessageDialog(null, "Invalid input. Balance set to $0.00");
		    account.setBalance(0.0);
		}
		    
		//Construct the JFrame object
		frame = new JFrame("Bank Balance Application");
		
		//Set the frame's height and width in pixels
		frame.setSize(500,300);
		
		//Set the program to exit when the user closes the frame
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//Create the panel object
		panel = new JPanel();
		
		//add the panel to the frame
		frame.add(panel);
		
		//Construct the JLabel object
		label = new JLabel("Current Balance: $" + account.getBalance());
		panel.add(label);
		
		//Construct the JTextField object
		text = new JTextField(10);
		panel.add(text);
		
		//construct the 4 buttons
		showButton = new JButton("Show Balance");
		panel.add(showButton);
		showButton.addActionListener(this);
		
		depositButton = new JButton("Deposit");
		panel.add(depositButton);
		depositButton.addActionListener(this);
		
		withdrawButton = new JButton("Withdraw");
		panel.add(withdrawButton);
		withdrawButton.addActionListener(this);
		
		exitButton = new JButton("Exit");
		panel.add(exitButton);
		exitButton.addActionListener(this);
		
		//Make the frame visible to the user
				frame.setVisible(true);
		}
	
	public void actionPerformed(ActionEvent e) {

		Object source = e.getSource(); //shows what button user selected
		//Show Balance
		if (source == showButton) {
			label.setText("Current Balance: $" + account.getBalance());
		}
		//Deposit
		else if (source == depositButton) {
			try {
				double amount = Double.parseDouble(text.getText());
				account.deposit(amount);
				label.setText("Current Balance: $" + account.getBalance());
				text.setText(""); //clears the input field
			}
			catch (NumberFormatException ex) {
				JOptionPane.showMessageDialog(null,  "Invalid amount entered");
			}
		}
			
		//Withdraw
		else if (source == withdrawButton) {
			try {
				double amount = Double.parseDouble(text.getText());
				account.withdrawal(amount);
				label.setText("Current Balance: $" + account.getBalance());
			            text.setText(""); // clears input field
	        } 
	        catch (NumberFormatException ex) {
	            JOptionPane.showMessageDialog(null, "Invalid amount entered");
	        }
	    }

	    // EXIT
	    else if (source == exitButton) {
	        JOptionPane.showMessageDialog(null, 
	            "Final Balance: $" + account.getBalance());
	        System.exit(0);
			}
		
		}
	}


	
