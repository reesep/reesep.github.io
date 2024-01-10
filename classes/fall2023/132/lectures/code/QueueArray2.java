
public class QueueArray2 {
	private Order[] orders;
	
	private int size;
	private int front;
	private int capacity;
	
	public QueueArray2() {
		this.orders = new Order[6];
		this.size = 0;
		this.front = 0;
		this.capacity = this.orders.length; //6
	}
	
	public void enqueue(Order newOrder) {
		
		if(this.size == this.capacity) {
			System.out.println("Error... queue is full");
			return;
		}
		
		int insert_spot = (front + size) % capacity;
		this.orders[insert_spot] = newOrder;
		
		this.size++;
		System.out.println("Added " + newOrder.getName() + " at index #" + insert_spot);
	}
	
	
	public void dequeue() {
		
		if(this.size == 0) {
			System.out.println("Error... queue is empty");
			return;
		}
		else {
			Order o = this.orders[front];
			this.orders[front] = null;
			front = (front + 1) % capacity;
			this.size--;
			System.out.println(o.getName() + "'s order was removed");
			
		}
		
	}
	
	
	public void printQueue() {
		
		int start = front;
		int counter = 1;
		int n = 0;
		while(n != this.size) {
			System.out.println(counter + ". " + this.orders[start].getName());
			start = (start + 1) % capacity;
			counter++;
			n++;
		}
		
		
	}
	
	
}
