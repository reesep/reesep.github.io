import java.util.LinkedList;

public class QueueLinkedList {

	private LinkedList<Order> queue;
	private int size;
	
	public QueueLinkedList() {
		this.queue = new LinkedList<Order>();
		this.size = 0;
	}
	
	public void enqueue(Order newOrder) {
		this.queue.add(newOrder);
		this.size++;
	}
	
	public Order dequeue() {
		Order removedOrder = this.queue.poll();
		this.size--;
		return removedOrder;
	}
	
	public boolean isEmpty() {
		return this.size == 0;
	}
	
	public Order peek() {
		if(!isEmpty()) {
			return this.queue.getFirst();
		}
		else {
			return null;
		}
	}
	
	public void printQueue() {
		int counter = 1;
		for(Order o: this.queue) {
			System.out.println(counter + ": " + o);
			counter++;
		}
	}
	
}
