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
	
	public void push(VideoGame newGame) {
		data.addFirst(newGame);
		size ++;
		top_of_stack = data.getFirst();
	}
	
	
	public void pop() {
		if(size == 0) {
			System.out.println("Error... stack is empty");
			return;
		}
		
		data.remove();
		top_of_stack = data.getFirst();
		size--;
		
	}
	
	public VideoGame peek() {
		return top_of_stack;
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
		
		for(VideoGame v: data) {//O(N)
			System.out.println(v.getName()+ " - Rated: "+ v.getRating()); //O(1)
		}
		
	}

}
