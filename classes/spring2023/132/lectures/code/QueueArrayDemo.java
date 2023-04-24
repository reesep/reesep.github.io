
public class QueueArrayDemo {

	public static void main(String[] args) {
		
		QueueArray queue = new QueueArray();
		
		Order order1 = new Order("Cheeseburger","Tom");
		Order order2 = new Order("Hot Dog","Jane");
		Order order3 = new Order("Chicken Nuggets","Reese");
		Order order4 = new Order("Taco","Bob");
		
		queue.enqueue(order1);
		queue.enqueue(order2);
		queue.enqueue(order3);
		queue.enqueue(order4);
		
		queue.printQueue();
		System.out.println();
		
		queue.dequeue();
		
		queue.printQueue();
		
		Order peeked = queue.peek();
		System.out.println(peeked.getName());
		
		System.out.println(queue.isEmpty());

		
		
		
		
		
	}


}
