
public class StackArrayDemo {

	public static void main(String[] args) {
		
		Hall hall1 = new Hall("Barnard Hall",3);
		Hall hall2 = new Hall("Roberts Hall",3);
		Hall hall3 = new Hall("Cobbleigh Hall",6);
		
		StackArray stack = new StackArray();
		
		stack.push(hall1);
		stack.push(hall2);
		stack.push(hall3);
		
		stack.printStack();
		
		stack.pop();
		stack.printStack();
		
		Hall next = stack.peek();
		next.printInfo();

	}

}
