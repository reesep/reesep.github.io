import java.util.LinkedList;

public class GenericQueue<T> {

	private LinkedList<T> queue;
	private int size;
	
	public GenericQueue() {
		this.queue = new LinkedList<>();
		this.size = 0;
	}
	
	public void enqueue(T newdata) {
		this.queue.add(newdata);
		this.size++;
	}
	
	public void print() {
		for(T each: this.queue) {
			System.out.println(each);
		}
	}
	
	public T dequeue() {
		this.size--;
		return this.queue.removeFirst();
	}
	
}
