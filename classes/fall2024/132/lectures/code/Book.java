
public class Book {

	private String book_name;
	private String author;
	private int year;
	
	public Book(String name, String author, int year) {
		this.book_name = name;
		this.author = author;
		this.year = year;
	}
	
	public void printInfo() {
		System.out.println("Book Name: " + this.book_name);
		System.out.println("Author: " + this.author);
		System.out.println("Release Year: " + this.year);
	}
}
