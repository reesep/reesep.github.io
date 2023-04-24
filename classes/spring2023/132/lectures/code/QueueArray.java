
public class QueueArray {

	private Order[] orders;
	
	private int size;
	private int front;
	private int back;
	private int capacity;
	
	public QueueArray() {
		this.orders = new Order[6];
		this.size = 0;
		this.front = 0;
		this.back = 0;
		this.capacity = this.orders.length; //6
	}
	
	public void enqueue(Order newOrder) {
		
		System.out.println("Adding " + newOrder.getName() + "'s order!");
		if(this.size == this.capacity) {
			System.out.println("Error: Queue is full");
			return;
		}
		else {
			this.orders[this.back] = newOrder;
			this.back++;
			this.size++;
		}
		
	}
	
	public void printQueue() {
		
		int counter = 1;
		for(int i = 0; i < this.back; i++) {
			this.orders[i].printOrder(counter);
			counter++;
		}
	}
	
	public void dequeue() {
		
		if(this.size == 0) {
			System.out.println("Error: queue is empty...");
			return;
		}
		else {
			System.out.println("Removing "+ this.orders[front].getName() + "'s order.");
			for(int i = 0; i < back-1; i++) {
				this.orders[i] = this.orders[i+1];
			}
			this.back--;
			this.size--;

			if(back < capacity) {
				this.orders[back] = null;
			}
			
		}
	
	}
		public Order peek() {
			
			if(this.size != 0) {
				return this.orders[front];
			}
			else {
				return null;
			}
		}
		
		public boolean isEmpty() {
			if(this.size == 0) {
				return true;
			}
			else {
				return false;
			}
		}
		
		
		
	
	
	
	
	
	
}
