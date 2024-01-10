
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
		this.back = -1;
		this.capacity = this.orders.length; //6
	}
	
	public void enqueue(Order newOrder) {
		System.out.println("Adding " + newOrder.getName() + "s order");
		if(this.size == this.capacity) {
			System.out.println("Error: Queue is full");
			return;
		}
		else {
			this.back++;
			this.orders[back] = newOrder;
			this.size++;
		}
	}
	
	public void dequeue() {
		
		if(this.size == 0) {
			System.out.println("Error: queue is empty");
			return;
		}
		else {
			System.out.println("Removing " + orders[front].getName() + "s order");
			for(int i = 0; i < back; i++) {
				this.orders[i] = this.orders[i+1];
			}

			this.orders[back] = null;
			
			this.size--;
			this.back--;

		}
	}
	
	public void printQueue() {
		for(int i = 0; i < this.back+1;i++) {
			orders[i].printOrder();
		}
	}
	
	public Order peek() {
		return this.orders[front];
	}
	
	public boolean isEmpty() {
		return this.size == 0;
	}
	
	
}
