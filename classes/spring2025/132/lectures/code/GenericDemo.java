import java.util.LinkedList;

public class GenericDemo {

	public static void main(String[] args) {
		
		GenericLinkedList ll = new GenericLinkedList();
		
		ll.add(1);
		ll.add("Reese");
		ll.add(3.14);
		ll.add(true);
		
		ll.print();

	}

}
