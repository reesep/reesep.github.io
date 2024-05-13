

public class QueueArray {

	private Order[] data;
	private int size;
	private int capacity;
	
	private int front;
	
	public QueueArray(int s) {
		this.data = new Order[s];
		this.size = 0;
		this.capacity = s;
		this.front = 0;
	}
	
	public void enqueue(Order newOrder) {
		if(size == capacity) {
			System.out.println("Queue is full");
			return;
		}
		
		int insert_spot = (front + size) % capacity;
		data[insert_spot] = newOrder;
		this.size++;
	
	}
	
	public void printQueue() {
		
		int start = front;
		int n = 0;
		while(n != size) {
			System.out.println((n+1) + ": " + data[start].getInfo());
			start = (start + 1) % capacity;
			n++;
		}
		
	}
	
	public Order dequeue() {
		if(size == 0) {
			System.out.println("Queue is empty");
			return null;
		}
		Order temp = data[front];
		data[front] = null;
		front = (front + 1) % capacity;
		this.size--;
		return temp;
	}
	
	public Order peek() {
		return data[front];
	}
	
	public boolean isEmpty() {
		if(size == 0) {
			return true;
		}
		else {
			return false;
		}
	}
	
}
