
import java.util.LinkedList;

public class LinkedListDemo {

	public static void main(String[] args) {
		
		LinkedList<String> ll = new LinkedList<String>();
		ll.add("Reese");
		ll.add("Susan");
		ll.add("Spencer");
		ll.addFirst("First");
		System.out.println(ll);
		
		ll.remove(2);
		ll.remove("First");
		
		System.out.println(ll);
		
		System.out.println(ll.get(0));
		
	}

}
