
public class QueueArray2 {
	
	private Order2[] data;
	private int size;
	private int capacity;
	private int front;
	
	public QueueArray2(int s) {
		this.data = new Order2[s];
		this.size = 0;
		this.capacity = s;
		this.front = 0;
	}
	
	public void enqueue(Order2 newOrder) {
		if (size == capacity) {
			System.out.println("Queue is full");
			return;
		}
		int back = (front + size) % capacity;
		data[back] = newOrder;
		size ++;
		
		System.out.println("Added " + newOrder.getName() + " at index #" + back + "\n");
		
		
	}
	
	public Order2 dequeue() {
		if (size == 0) {
			System.out.println("There is nothing to remove");
			return null;
		}
		Order2 temp = data[front];
		data[front] = null;
		front = (front + 1) % capacity;
		size--;
		
		return temp;
		
	}
	
	public Order2 peek() {
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
	
	public void printQueue() {
		int start = front;
		int n = 0;
		
		while(n != size) {
			System.out.println((n + 1) + ":" + data[start]);
			start = (start + 1) % capacity;
			n++;
			
		}
	}

}
