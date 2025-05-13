
public class QueueArrayDemo {

	public static void main(String[] args) {
		QueueArray queue = new QueueArray(6);

		queue.enqueue(new Order("Reese","Orange Chicken"));
		queue.enqueue(new Order("Cosmo","Hamburger"));
		queue.enqueue(new Order("Susan","Milkshake"));
		queue.enqueue(new Order("Jack","Hot Dog"));

		queue.printQueue();

		System.out.println(queue.dequeue());
		System.out.println();
		queue.printQueue();
		
		System.out.println();
		queue.enqueue(new Order("AAAA","AAAAAA"));
		queue.enqueue(new Order("AAAA","AAAAAA"));

	}


}
