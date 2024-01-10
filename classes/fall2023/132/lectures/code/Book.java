
public class Book {

	private String book_name;
	private String author;
	private int year;
	
	public Book(String name, String author, int year) {
		this.book_name = name;
		this.author = author;
		this.year = year;
	}
	
	public void print_info() {
		System.out.println(this.book_name);
		System.out.println(this.author);
		System.out.println(this.year);
		
	}
	
}
