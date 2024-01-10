
public class QueueLinkedListDemo {

	public static void main(String[] args) {
		
		Order o1 = new Order("Hamburger","Reese");
		Order o2 = new Order("Hot Dog","Jane");
		Order o3 = new Order("Taco","Joe");
		Order o4 = new Order("Milkshake","Mark");
		
		QueueLinkedList queue = new QueueLinkedList();
		queue.enqueue(o1);
		queue.enqueue(o2);
		queue.enqueue(o3);
		queue.enqueue(o4);
		
		queue.printQueue();
		System.out.println();
		
		queue.dequeue();
		queue.dequeue();
		queue.printQueue();

	}

}
