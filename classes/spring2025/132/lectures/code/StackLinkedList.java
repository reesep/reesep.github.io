import java.util.LinkedList;

public class StackLinkedList {

	private LinkedList<VideoGame> data;
	private int size;
	
	public StackLinkedList() {
		this.data = new LinkedList<VideoGame>();
	}
	
	public void push(VideoGame newGame) {
		data.addFirst(newGame);
		size++;
	}
	
	public void pop() {
		if(size == 0) {
			System.out.println("ERROR.... stack is empty");
		}
		else {
			data.removeFirst();
			size--;
		}
	}
	
	public VideoGame peek() {
		return data.getFirst();
	}
	
	public boolean isEmpty() {
		return data.isEmpty();
	}
	
	public void printStack() {
		for(VideoGame v: data) {
			System.out.println(v.getInfo());
		}
	}
	
	
	
	
}
