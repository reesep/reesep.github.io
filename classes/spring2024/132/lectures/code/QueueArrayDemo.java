
public class QueueArrayDemo {

	public static void main(String[] args) {
		Order o1 = new Order("Reese", "Orange Chicken", "White Rice");
		Order o2 = new Order("Susan", "Brocolli Beef", "Fried Rice");
		Order o3 = new Order("Mark", "Terryaki Chicken", "Chow Mein");
		Order o4 = new Order("Spencer", "Kung Pao Chicken", "Fried Rice");
		
		QueueArray queue = new QueueArray(6);
		
		queue.enqueue(o1);
		queue.enqueue(o2);
		queue.enqueue(o3);
		
		queue.printQueue();
		System.out.println();
		Order removed = queue.dequeue();
		System.out.println(removed.getInfo());
		
		queue.enqueue(o4);
		queue.printQueue();
		
		
	}

}
