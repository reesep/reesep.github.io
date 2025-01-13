
public class PriorityQueueDemo {

	public static void main(String[] args) {
		Patient e1 = new Patient("Iliana", 80);
		Patient e2 = new Patient("Reese", 2);
		Patient e3 = new Patient("Sasha", 15);
		Patient e4 = new Patient("Meatball", 65);
		
		PriorityQueue queue = new PriorityQueue();
		
		queue.enqueue(e1);
		queue.enqueue(e2);
		queue.enqueue(e3);
		queue.enqueue(e4);
		
		queue.dequeue();
		queue.dequeue();
		queue.dequeue();
		queue.dequeue();
		

	}

}
