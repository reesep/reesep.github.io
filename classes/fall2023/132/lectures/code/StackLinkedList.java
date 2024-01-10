
import java.util.LinkedList;

public class StackLinkedList {

	private LinkedList<VideoGame> data;
	private VideoGame top_of_stack;
	private int size;
	
	public StackLinkedList() {
		this.data = new LinkedList<VideoGame>();
		this.top_of_stack = null;
		this.size = 0;
	}
	
	public void push(VideoGame newVideoGame) {
		
		this.data.addFirst(newVideoGame);
		this.size++;
		this.top_of_stack = this.data.getFirst();
		
	}
	
	public void pop() {
		if(this.size != 0) {
			this.data.removeFirst();
			this.size--;
			this.top_of_stack = this.data.getFirst();
		}
		
	}
	
	public VideoGame peek() {
		return this.top_of_stack;
	}
	
	public void printStack() {
		for(VideoGame v: this.data) {
			v.printInfo();
		}
	}
	
	
}
