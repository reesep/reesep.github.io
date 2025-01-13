
public class StackArrayDemo {
	
	public static void main(String [] args) {
		StackArray stack = new StackArray();
		
		VideoGame v1 = new VideoGame("Legend of Zelda", 'T');
		VideoGame v2 = new VideoGame("Animal Crossing", 'E');
		VideoGame v3 = new VideoGame("Minecraft", 'E');
		
		stack.push(v1);
		stack.push(v2);
		stack.push(v3);
		
		stack.printStack();
		System.out.println();
		
		//stack.pop();
		stack.printStack();
		
		VideoGame v4 = new VideoGame("GTA", 'M');
		stack.push(v4);
		VideoGame v5 = new VideoGame("Stardew Valley", 'E');
		stack.push(v5);
		VideoGame v6 = new VideoGame("MarioKart", 'E');
		stack.push(v6);
		
		System.out.println();
		stack.printStack();
	}

}
