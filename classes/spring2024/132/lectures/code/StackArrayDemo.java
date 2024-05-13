
public class StackArrayDemo {

	public static void main(String[] args) {
		
		StackArray stack = new StackArray(10);
		
		VideoGame v1 = new VideoGame("Star Wars Battlefront",'T');
		VideoGame v2 = new VideoGame("Mario Kart",'E');
		VideoGame v3 = new VideoGame("Call of Duty",'M');
		
		stack.push(v1);
		stack.push(v2);
		stack.push(v3);

		stack.printStack();
		System.out.println();
		
		VideoGame p = stack.peek();
		System.out.println(p.getName());
		
		stack.pop();
		
		VideoGame v4 = new VideoGame("Valheim", 'T');
		stack.push(v4);
		
		System.out.println();
		stack.printStack();

	}

}
