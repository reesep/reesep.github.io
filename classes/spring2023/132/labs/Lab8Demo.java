
public class Lab8Demo {

	public static void main(String[] args) {
		
		StackLinkedList stack = new StackLinkedList();
		
		// Methods you need to write
		// push(), pop(), printStack(), getSize(), peek(), isEmpty()
		
		
		stack.push("The Great Gatsby");
		stack.push("Moby-Dick");
		stack.push("The Catcher in the Rye");
		stack.push("Lord of the Flies");
		
		stack.printStack();
		
		System.out.println("The size of the stack is: " + stack.getSize());
		System.out.println("The top of the stack currently is: " + stack.peek());
		System.out.println();
		
		String removed = stack.pop();
		System.out.println("Item removed: " + removed);
		stack.printStack();
		System.out.println("The size of the stack is: " + stack.getSize());
		System.out.println("The top of the stack currently is: " + stack.peek());
		System.out.println("");
		
		
		stack.pop();
		stack.pop();
		
		stack.printStack();
		System.out.println("The size of the stack is: " + stack.getSize());
		System.out.println("The top of the stack currently is: " + stack.peek());
		System.out.println("");
		
		removed = stack.pop();
		System.out.println("Item removed: " + removed);
		System.out.println("The top of the stack currently is: " + stack.peek());
		
		if(stack.isEmpty()) {
			System.out.println("The stack is now empty...");
		}
		
		
		
		
		
		
		
		
		
		

	}

}
