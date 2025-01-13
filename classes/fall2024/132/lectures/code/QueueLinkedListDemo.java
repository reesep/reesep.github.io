
public class QueueLinkedListDemo {

	public static void main(String[] args) {
		Order o1 = new Order("Reese", "Cookie", "Coffee");
		Order o2 = new Order("Iliana", "Sandwhich", "Latte");
		Order o3 = new Order("Evan", "Cinnamon Roll", "Tea");
		Order o4 = new Order("John", "Muffin", "Milk");
		
		QueueLinkedList queue = new QueueLinkedList();
		
		queue.enqueue(o1);
		queue.enqueue(o2);
		queue.enqueue(o3);
		
		queue.printQueue();
		
		System.out.println("-----------------------");
		Order removed = queue.dequeue();
		System.out.println(removed);
		
		System.out.println("-----------------------");
		queue.enqueue(o4);
		queue.printQueue();

	}

}
