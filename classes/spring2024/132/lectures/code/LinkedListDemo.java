
import java.util.LinkedList;

public class LinkedListDemo {

	public static void main(String[] args) {
		// This Linked List holds only strings
		LinkedList<String> ll = new LinkedList<String>();
	
		ll.add("One");
		ll.add("Two");
		ll.add("Three");
		ll.add("Four");
		
		System.out.println(ll);
		for(String s: ll) {
			System.out.println(s);
		}
		
		ll.remove("Two");
		ll.remove(1);
		
		System.out.println(ll);
		System.out.println(ll.getFirst());
		
		System.out.println(ll.getLast());
		
		ll.removeFirst();

		System.out.println(ll);
}
	
}
