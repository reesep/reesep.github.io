import java.util.Collections;
import java.util.LinkedList;

public class PriorityQueue {

	private LinkedList<Patient> queue;
	private int size;

	public PriorityQueue() {
		this.queue = new LinkedList<Patient>();
		this.size = 0;
	}
	
	public void enqueue(Patient newPaitent) {
		queue.add(newPaitent);
		Collections.sort(queue); //not O(1) time
		this.size++;
	}
	
	public Patient poll(){
		if(size == 0) {
			return null;
		}
		else {
			size--;
			return queue.removeFirst();
		}
		
	}
	
	public void printQueue() {
		int counter = 1;
		for(Patient p: queue) {
			System.out.println(counter + ". " + p.getInfo());
			counter++;
		}
	}
}
