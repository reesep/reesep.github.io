
import java.util.LinkedList;

public class StackLinkedList {

	private LinkedList<Hall> data;
	private Hall top_of_stack;
	private int size;
	
	public StackLinkedList() {
		this.data = new LinkedList<Hall>();
		this.top_of_stack = null;
		this.size = 0;
	}
	
	public void push(Hall newHall) {
		
		this.data.addFirst(newHall);
		this.size++;
		this.top_of_stack = this.data.getFirst();
		
	}
	
	public void pop() {
		
		if(this.size == 0) {
			return;
		}
		else {
			this.data.removeFirst();
			this.top_of_stack = this.data.getFirst();
			this.size--;
		}
		
	}
	
	public void printStack() {
		
		for(int i = 0; i < this.size; i++) {
			this.data.get(i).printInfo();
		}
		
	}
	
	public Hall peek() {
		
		if(this.size != 0) {
			return this.top_of_stack;
		}
		else {
			return null;
		}
	}
	
	
	
	
	
}
