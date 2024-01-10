
public class QueueArray2Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		QueueArray2 queue = new QueueArray2();
		
		Order order1 = new Order("Cheeseburger","Tom");
		Order order2 = new Order("Hot Dog","Jane");
		Order order3 = new Order("Chicken Nuggets","Reese");
		Order order4 = new Order("Taco","Bob");
		
		Order order5 = new Order("French Fries","Sam");
		Order order6 = new Order("Churro","Todd");
		Order order7 = new Order("Beer","Mason");
		
		
		queue.enqueue(order1);
		queue.enqueue(order2);
		queue.enqueue(order3);
		queue.enqueue(order4);
		queue.enqueue(order5);
		queue.enqueue(order6);
		
		queue.dequeue();
		queue.dequeue();
		
		queue.enqueue(order7);
		
		queue.printQueue();
		
	}

}
