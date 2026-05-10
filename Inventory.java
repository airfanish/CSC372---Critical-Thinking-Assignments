package CriticalThinking;

//import statements
import java.util.ArrayList;

public class Inventory {

	//keeps track of books and inventory
	private ArrayList<Book> bookInventory = new ArrayList<Book>();
	//keeps track of currently borrowed books
	private ArrayList<Book> borrowedBooks = new ArrayList<Book>();
	
	//This method creates a new Book object and adds it to the main inventory.
	public void addBook(Book book) {
		bookInventory.add(book);
	}
	
	// This method iterates over the book collection (ArrayList or LinkedList) and calls the printBookInfo() method from the Book class to display details of each book
	public void printAll() {
		for (Book book : bookInventory) {
			book.printBookInfo();
		}
	}
		
	//This method handles the borrowing process by removing a book from the main inventory and adding it to the lending inventory.
	public void borrowBook(int id) {
		for (int i = 0; i < bookInventory.size(); i++) {
			Book book = bookInventory.get(i);
			
			if (book.getId() == id) {
				borrowedBooks.add(book);
				bookInventory.remove(i);
				System.out.println("Book successfully borrowed.");
				return;
			}
		}
		System.out.println("Book not found or already borrowed.");
	}
	
	//This method processes book returns by moving the book from the lending inventory back to the main inventory.
	public void returnBook(int id) {
		for (int i = 0; i < borrowedBooks.size(); i++) {
			Book book = borrowedBooks.get(i);
			
			if (book.getId() == id) {
				bookInventory.add(book);
				borrowedBooks.remove(i);
				System.out.println("Book successfully returned.");
				return;
			}
		}
		System.out.println("Book not found or already returned.");
	}

	//method in the Inventory class. It should iterate through the book list and return all books with matching or partially matching titles (case-insensitive)
	public void searchByTitle(String title) {
		
		//tracks whether a matching title was found
		boolean found = false;
		
		for (Book book : bookInventory) {
			
			if (book.getTitle().toLowerCase().contains(title.toLowerCase())) {
				book.printBookInfo();
				found = true; //matching book was found
		}	
	}
		//if no matching titles were found
		if (!found) {
			System.out.println("No matching book found.");
		}
}
}


