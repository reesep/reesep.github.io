
public class StackArray {

	private Hall[] data;
	private int top_of_stack;
	private int size;
	
	
	public StackArray() {
		data = new Hall[8];
		top_of_stack = -1;
		size = 0;
	}
	
	public void push(Hall newHall) {
		

		if(this.size == 8) {
			return;
		}
		else {
			this.top_of_stack++;
			data[this.top_of_stack] = newHall;
			this.size++;
		}
	
	}
	
	public void printStack() {
		
		for(int i = this.size-1; i >= 0; i--) {
			this.data[i].printInfo();
		}
		
	}
	
	public void pop() {
		
		if(this.size == 0) {
			return;
		}
		else {
			this.data[this.top_of_stack] = null;
			this.top_of_stack--;
			this.size--;
			
		}
		
	}
	
	
	public Hall peek() {
		
		if(this.size != 0) {
			return this.data[this.top_of_stack];
		}
		else {
			return null;
		}
	}
	
	public boolean isEmpty() {
		
		if(this.size == 0) {
			return true;
		}
		else {
			return false;
		}
		
	}
	
	
	
	
	
	
}
