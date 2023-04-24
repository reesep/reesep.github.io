
import java.util.LinkedList;
public class QueueLinkedList {

	private LinkedList<Order> orders;
	private int size;
	
	public QueueLinkedList() {
		this.orders = new LinkedList<Order>();
		this.size = 0;
	}
	
	public void enqueue(Order newOrder) {
		
		this.orders.addLast(newOrder);
		this.size++;
		
	}
	public void printQueue() {
		int counter = 1;
		for(Order each_order: this.orders) {
			each_order.printOrder(counter);
			counter++;
		}
	}
	
	public Order dequeue() {
		if(this.size != 0) {
			Order removed = this.orders.removeFirst();
			System.out.println(removed.getName() + "'s order just got serviced and removed from the queue");
			size--;
			return removed;
		}
		else {
			return null;	
		}
	}
	
	
}
