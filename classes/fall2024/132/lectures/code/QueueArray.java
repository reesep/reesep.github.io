
public class QueueArray {
	
	private Order[] data;
	private int size;
	private int capacity;
	
	public QueueArray(int s) {
		this.data = new Order[s];
		this.size = 0;
		this.capacity = s;
		//this.front = 0;
	}
	
	public void enqueue(Order newOrder) {
		if (size == capacity) {
			System.out.println("Queue is full");
			return;
		}
		int insert_spot = size;
		data[insert_spot] = newOrder;
		size ++;
		
		
	}
	
	public Order dequeue() {
		if (size == 0) {
			System.out.println("There is nothing to remove");
			return null;
		}
		Order temp = data[0];
		for (int i = 0; i < size - 1; i++) {
			data[i] = data[i + 1];
		}
		
		data[size-1] = null;
		size--;
		
		return temp;
		
	}
	
	public Order peek() {
		return data[0];
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
		int start = 0;
		int n = 0;
		
		while(n != size) {
			System.out.println((n + 1) + ":" + data[start]);
			start++;
			n++;
			
		}
	}

}
