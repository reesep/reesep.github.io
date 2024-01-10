
import java.util.Collections;
import java.util.LinkedList;

public class PriorityQueue {

	private LinkedList<Patient> patients;
	private int size;
	
	public PriorityQueue() {
		this.patients = new LinkedList<Patient>();
		this.size = 0;
	}
	
	public void enqueue(Patient newPatient) {
		this.patients.add(newPatient);
		Collections.sort(this.patients);
	}
	
	public void dequeue() {
		Patient removed = this.patients.removeFirst();
		System.out.println("Removed: " + removed.getName());
	}

	public void printQueue() {
		
		for(Patient p: this.patients) {
			System.out.println(p.getAge() + ", " + p.getName());
		}
		
	}
}
