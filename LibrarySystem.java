package CriticalThinking;

import java.util.Scanner;
import java.util.InputMismatchException; //exception handling

public class LibrarySystem {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		Inventory inventory = new Inventory();
	
	// Create menu items
	while (true) {
		
		System.out.println("1. Add Book");
		System.out.println("2. Borrow Book");
		System.out.println("3. Return Book");
		System.out.println("4. Search by Title");
		System.out.println("5. Print All Books");
		System.out.println("6. Exit");
		System.out.println(); //empty line for readability
		
		
		//try-catch exception handling
		
		try {
			//attempt to read user's menu choice
			System.out.print("Enter your choice: ");
			int choice = input.nextInt();
			
			//Add switch statement to decide which menu action to run based on the user's choice
			switch (choice) {
			
			case 1:
				//prompt user for book info
				System.out.println("Enter ID: ");
				int id = input.nextInt();
				input.nextLine();
				
				System.out.println("Enter Title: ");
				String title = input.nextLine();
				
				System.out.println("Enter Author: ");
				String author = input.nextLine();
				
				System.out.println("Enter ISBN: ");
				String isbn = input.nextLine();
				
				System.out.println("Enter Page Count: ");
				int numberOfPages = input.nextInt();
				
				//create Book object
				Book book = new Book(id, title, author, isbn, numberOfPages);			
				//add book to inventory
				inventory.addBook(book);
				//success message
				System.out.println("Book added to the library.");
				System.out.println(); //extra space for readability
				break;
				
			case 2:
				//prompt user info
				System.out.println("Enter ID: ");
				int borrowBookId = input.nextInt();
				//borrow book
				inventory.borrowBook(borrowBookId);
				break;
				
			case 3:
				//prompt user for info
				System.out.println("Enter ID: ");
				int returnBookId = input.nextInt();
				//return book
				inventory.returnBook(returnBookId);
				break;
				
			case 4:
				//prompt user for input
				System.out.println("Enter Title: ");
				input.nextLine();
				String searchTitle = input.nextLine();
				//search book
				inventory.searchByTitle(searchTitle); //REMINDER: Need to handle found/not found logic inside searchByTitle()
				break;
				
			case 5:
				//print all books
				inventory.printAll();
				break;
				
			case 6:
				System.out.println("Exiting the program. Goodbye!");
				input.close();
				return;
				
			default:
				System.out.println("Invalid option.");
			}
		}
		catch (InputMismatchException e) {
			System.out.println("Invalid input. Please enter a number.");
			input.nextLine();
		}
	}
	}
}

		
		
		
	