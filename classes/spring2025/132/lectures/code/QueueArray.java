
public class QueueArray {

	private Order[] orders;
	
	private int size;
	private int front;
	private int capacity;

	public QueueArray(int c) {
		this.orders = new Order[c];
		this.size = 0;
		this.capacity = orders.length;
		this.front = 0;
	}
	
	
	public void enqueue(Order newOrder) {
		
		if(size == capacity) {
			System.out.println("Queue is full...");
			return;
		}
		
		int insert_spot = (front + size) % capacity;
		orders[insert_spot] = newOrder;
		this.size++;
		
	}
	
	public Order dequeue() {
		
		if(size == 0) {
			System.out.println("Queue is empty...");
			return null;
		}
		
		else {
			Order o = orders[front];
			orders[front] = null;
			front = (front + 1) % capacity;
			this.size--;
			return o;
		}
	
	}
	
	public Order peek() {
		return orders[front];
	}
	
	public boolean isEmpty() {
		return size == 0;
	}
	
	public void printQueue() {
		
		int start = front;
		int counter = 1;
		int n = 0;
		while(n != this.size) {
			System.out.println(counter + ". " + orders[start]);
			start = (start + 1) % capacity;
			counter++;
			n++;
		}
		
	}
	
	
}
