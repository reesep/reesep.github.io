
public class StackArray {
	
	private VideoGame[] data;
	private int top_of_stack;
	private int size;
	
	public StackArray(int capacity) {
		this.data = new VideoGame[capacity];
		this.top_of_stack = -1;
		this.size = 0;
	}
	
	public void push(VideoGame newGame) {
		if(size == data.length) {
			System.out.println("Can't push, stack is full...");
			return;
		}
		
		top_of_stack ++;
		data[top_of_stack] = newGame;
		size ++;
	}
	
	
	public void pop() {
		if(size == 0) {
			System.out.println("Error... stack is empty");
			return;
		}
		
		data[top_of_stack] = null;
		top_of_stack --;
		size --;
		
	}
	
	public VideoGame peek() {
		if(size != 0) {
			return data[top_of_stack];
		}
		else {
			return null;
		}
	}
	
	public boolean isEmpty() {
		if(size == 0) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public void printStack() {
		for(int i = size-1; i >= 0; i--) {
			System.out.println(data[i].getName() + " - Rated: " + data[i].getRating());
		}
	}

}
