
import java.util.LinkedList;

public class GenericQueue<T> {

	private LinkedList<T> queue;
	private int size;
	
	public GenericQueue() {
		this.queue = new LinkedList<T>();
		this.size = 0;
		
	}
	
	public void enqueue(T newData) {
		this.queue.add(newData);
		this.size++;
	}
	
	public T dequeue() {
		this.size--;
		return this.queue.removeFirst();
	}
	
	public void print() {
		for(T each: this.queue) {
			System.out.println(each);
		}
	}
	
}
