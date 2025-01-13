import java.util.LinkedList;

public class QueueLinkedList {
	
	private LinkedList<Order> data;
	private int size;
	
	public QueueLinkedList() {
		this.data = new LinkedList<Order>();
		this.size = 0;
	}
	
	public void enqueue(Order newOrder) {
		data.add(newOrder);
		size++;
		
	}
	
	public Order dequeue() {
		if (size == 0) {
			System.out.println("There is nothing to remove");
			return null;
		}
		size--;
		return data.remove();
	}
	
	public Order peek() {
		return data.getFirst();
	}
	
	public boolean isEmpty() {
		if(size == 0) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public void printQueue() {
		for(Order o: data) {
			System.out.println(o);
		}
	}

}
