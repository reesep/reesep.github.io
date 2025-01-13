
public class Lab7Demo {

	public static void main(String args[]) {
		Book book1 = new Book("The Great Gatsby", "F. Scott Fitzgerald"); 
		Book book2 = new Book("Moby-Dick", "Herman Melville");
		Book book3 = new Book("The Catcher in the Rye", "J. D. Salinger");
		Book book4 = new Book("Lord of the Flies", "William Golding");
		
		BookStack stack = new BookStack(3); //capacity of array = 3 (but should be able to grow dynamically)
		
		stack.push(book1);
		stack.push(book2);
		stack.push(book3);
		stack.push(book4); // array should grow by 1 here
		
		stack.printStack();
		
		System.out.println("The size of the stack is: " + stack.getSize());
		System.out.println("The top of the stack currently is: " + stack.peek().getInfo());
		System.out.println();
	
		
		Book removed = stack.pop();
		System.out.println("Item removed: " + removed.getInfo());
		stack.printStack();
		System.out.println("The size of the stack is: " + stack.getSize());
		System.out.println("The top of the stack currently is: " + stack.peek().getInfo());
		System.out.println("");
	
		stack.pop();
		stack.pop();
		
		stack.printStack();
		System.out.println("The size of the stack is: " + stack.getSize());
		System.out.println("The top of the stack currently is: " + stack.peek().getInfo());
		System.out.println("");
		
		removed = stack.pop();
		System.out.println("Item removed: " + removed.getInfo());
		
		
		if(stack.isEmpty()) {
			System.out.println("The stack is now empty...");
		}
	}
	
	
}

