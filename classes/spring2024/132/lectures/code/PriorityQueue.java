import java.util.Collections;
import java.util.LinkedList;

public class PriorityQueue {

	private LinkedList<Patient> data;
	private int size;
	
	
	public PriorityQueue() {
		this.data = new LinkedList<Patient>();
		this.size = 0;
	}
	
	public void enqueue(Patient newPatient) {
		data.add(newPatient);
		Collections.sort(data); // O(???)
		this.size++;
	}
	
	public void dequeue() {
		Patient removed = data.removeFirst();
		System.out.println("Dequeued: " + removed.getName());
		this.size--;
	}
	
}
