
public class PriorityQueueDemo {

	public static void main(String[] args) {
		
		Patient e1 = new Patient("Reese",33);
		Patient e2 = new Patient("John", 67);
		Patient e3 = new Patient("Susan",81);
		Patient e4 = new Patient("Spencer",15);
		
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
