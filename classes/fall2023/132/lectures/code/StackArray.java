
public class StackArray {

	private VideoGame[] data;
	private int top_of_stack;
	private int size;
	
	public StackArray() {
		this.data = new VideoGame[8]; // O(N)
		this.top_of_stack = -1;
		this.size = 0;
	}
	
	public void push(VideoGame newGame) {
		if(this.size == this.data.length) {
			System.out.println("Stack is full...");
			return;
		}
		else {
			this.top_of_stack++;
			data[top_of_stack] = newGame;
			this.size++;
		}
	}
	
	public void pop() {
		
		if(this.size == 0) {
			System.out.println("Nothing to remove...");
			return;
		}
		else {
			this.data[this.top_of_stack] = null;
			this.top_of_stack--;
			this.size--;
		}
		
	}
	
	public VideoGame peek() {
		
		if(this.size != 0) {
			return this.data[this.top_of_stack];
		}
		else {
			return null;
		}
		
	}
	
	public void printStack() {
		
		for(int i = this.size-1; i >= 0; i--) {
			data[i].printInfo();
		}
		
	}
	
}
