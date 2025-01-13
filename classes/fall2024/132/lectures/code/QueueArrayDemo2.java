
public class QueueArrayDemo2 {

	public static void main(String[] args) {
		Order2 o1 = new Order2("Reese", "Cookie", "Coffee");
		Order2 o2 = new Order2("Iliana", "Sandwhich", "Latte");
		Order2 o3 = new Order2("Evan", "Cinnamon Roll", "Tea");
		Order2 o4 = new Order2("John", "Muffin", "Milk");
		Order2 o5 = new Order2("Sasha", "Tuna Wrap", "Milk");
		Order2 o6 = new Order2("Meatball", "Lox Bagel", "Milk");
		Order2 o7 = new Order2("Will", "Donut", "Coffee");
		
		QueueArray2 queue = new QueueArray2(6);
		
		queue.enqueue(o1);
		queue.enqueue(o2);
		queue.enqueue(o3);
		
		queue.printQueue();
		
		System.out.println("-----------------------");
		Order2 removed = queue.dequeue();
		System.out.println(removed);
		
		System.out.println("-----------------------");
		queue.enqueue(o4);
		queue.printQueue();
		
		System.out.println("-----------------------");
		queue.enqueue(o5);
		queue.enqueue(o6);
		queue.enqueue(o7);
		
		queue.printQueue();
		
		System.out.println("-----------------------");
		System.out.println(queue.peek());
		queue.enqueue(o1);
		
		

	}

}
