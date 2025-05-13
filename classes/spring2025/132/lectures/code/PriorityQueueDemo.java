
public class PriorityQueueDemo {

	public static void main(String[] args) {
		
		PriorityQueue queue = new PriorityQueue();
		
		queue.enqueue(new Patient("Reese",40));
		queue.enqueue(new Patient("Gary",72));
		queue.enqueue(new Patient("Sally",17));
		queue.enqueue(new Patient("Jerry",55));
		
		queue.printQueue();
		
		System.out.println(queue.poll().getInfo());
		System.out.println(queue.poll().getInfo());
		
	}

}
