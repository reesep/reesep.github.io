import java.util.LinkedList;
public class QueueLinkedList {

	private LinkedList<Order> data;
	private int size;
	
	public QueueLinkedList() {
		this.data = new LinkedList<Order>();
		this.size = 0;
	}
	
	public void enqueue(Order newOrder) {
		this.data.add(newOrder);
		this.size++;
	}
	
	public void dequeue() {
		this.data.removeFirst();
		this.size--;
	}
	
	public void printQueue() {
		for(Order o: this.data) {
			o.printOrder();
		}
	}
	
	public Order peek() {
		return this.data.getFirst();
	}
	
}
