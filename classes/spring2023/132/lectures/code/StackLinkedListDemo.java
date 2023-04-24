
public class StackLinkedListDemo {

	public static void main(String[] args) {
		
		Hall hall1 = new Hall("Barnard Hall",3);
		Hall hall2 = new Hall("Roberts Hall",3);
		Hall hall3 = new Hall("Cobbleigh Hall",6);
		
		StackLinkedList stack = new StackLinkedList();
		
		stack.push(hall1);
		stack.push(hall2);
		stack.push(hall3);
		
		stack.printStack();
		
		System.out.println();
		stack.pop();
		stack.printStack();
		
		System.out.println();
		Hall next = stack.peek();
		next.printInfo();

	}

}
