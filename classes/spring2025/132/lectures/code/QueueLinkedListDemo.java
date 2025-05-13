
public class QueueLinkedListDemo {

	public static void main(String[] args) {
		
		QueueLinkedList queue = new QueueLinkedList();
		
		queue.enqueue(new Order("Reese","Orange Chicken"));
		queue.enqueue(new Order("Cosmo","Hamburger"));
		queue.enqueue(new Order("Susan","Milkshake"));
		queue.enqueue(new Order("Jack","Hot Dog"));
		
		queue.printQueue();
		
		System.out.println(queue.dequeue());
		System.out.println();
		queue.printQueue();
		

	}

}
