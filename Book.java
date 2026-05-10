package CriticalThinking;

//Create a class “Book” which will have these 5 member variables
public class Book {

	private int id;
	private String title;
	private String author;
	private String isbn;
	private int numberOfPages;
	
	//Implement a default constructor.
	public Book() {
		
	}
	
	//Implement a parameterized constructor that has 5 parameters to be used to initialize those 5 member variables.
	public Book(int id, String title, String author, String isbn, int numberOfPages) {
		this.id = id;
		this.title = title;
		this.author = author;
		this.isbn = isbn;
		this.numberOfPages = numberOfPages;		
	}
	
	//Implement all the getter and setter methods and define them public.
	//Setter/Getter for variable id
	public void setId(int id) {
		this.id = id;
	}
	
	public int getId() {
		return id;	
	}
	
	//Setter/Getter for variable title
	public void setTitle(String title) {
		this.title = title;
	}
	
	public String getTitle() {
		return title;	
	}
	
	//Setter/Getter for variable author
	public void setAuthor(String author) {
		this.author = author;
	}
		
	public String getAuthor() {
		return author;	
	}
	
	//Setter/Getter for variable isbn
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
		
	public String getIsbn() {
		return isbn;	
	}
	
	//Setter/Getter for variable numberOfPages
	public void setNumberOfPages(int numberOfPages) {
		this.numberOfPages = numberOfPages;
	}
			
	public int getNumberOfPages() {
		return numberOfPages;	
	}
	
	//Create a member method named “printBookInfo()" 
	public void printBookInfo() {
		System.out.println("ID: " + id);
		System.out.println("Title: " + title);
		System.out.println("Author: " + author);
		System.out.println("ISBN: " + isbn);
		System.out.println("Page Count: " + numberOfPages);
		System.out.println(); //blank line after a book is printed - for readability
	}
	
}
