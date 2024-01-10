
public class QueueArrayDemo {

	public static void main(String[] args) {
		
		Order o1 = new Order("Hamburger","Reese");
		Order o2 = new Order("Hot Dog","Jane");
		Order o3 = new Order("Taco","Joe");
		Order o4 = new Order("Milkshake","Mark");
		Order o5 = new Order("sdasda","dasdas");
		Order o6 = new Order("dasdas","dasdas");
		Order o7 = new Order("dasdas","dsadas");
		QueueArray queue = new QueueArray();
		queue.enqueue(o1);
		queue.enqueue(o2);
		queue.enqueue(o3);
		queue.enqueue(o4);
		queue.enqueue(o5);
		queue.enqueue(o6);
		queue.enqueue(o7);
		
		queue.printQueue();
		System.out.println();
		
		queue.dequeue();
		queue.dequeue();

		queue.peek().printOrder();;
		
		queue.printQueue();
		
		System.out.println(queue.isEmpty());

	}

}
