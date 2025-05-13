
public class StackLinkedListDemo {

	public static void main(String[] args) {
		
		StackLinkedList stack = new StackLinkedList();
		stack.push(new VideoGame("Mario Kart", 'E'));
		stack.push(new VideoGame("Grand Theft Auto 6", 'M'));
		stack.push(new VideoGame("Valheim", 'T'));
		stack.push(new VideoGame("Legend of Zelda", 'E'));
		
		stack.printStack();
		System.out.println();
		
		stack.pop();
		stack.printStack();
		
		System.out.println(stack.peek().getInfo());
		stack.pop();
		stack.pop();
		stack.pop();
		
		System.out.println(stack.isEmpty());

	}

}
