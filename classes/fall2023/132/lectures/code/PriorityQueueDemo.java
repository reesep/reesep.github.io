
public class PriorityQueueDemo {

	public static void main(String[] args) {
		
		Patient p1 = new Patient("Reese",30);
		Patient p2 = new Patient("Gene",72);
		Patient p3 = new Patient("Susan",81);
		Patient p4 = new Patient("Sandy",85);
		
		PriorityQueue pq = new PriorityQueue();
		
		pq.enqueue(p1);
		pq.enqueue(p2);
		pq.enqueue(p3);
		pq.enqueue(p4);
		
		pq.printQueue();
		
		pq.dequeue();
		pq.dequeue();
		
		pq.printQueue();

	}

}
