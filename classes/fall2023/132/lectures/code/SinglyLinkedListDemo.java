
public class SinglyLinkedListDemo {

	public static void main(String[] args) {
		
		SinglyLinkedList ll = new SinglyLinkedList();
		
		ll.addToFront( new Node("Reese",32) );
		//ll.addToFront( new Node("Jerry",51) );
		//ll.addToFront( new Node("Sally",17) );
		//ll.addToFront( new Node("Susan",28) );
		
		//ll.addToBack( new Node("Juan",61) );
		//ll.addToBack( new Node("Spencer",61) );
		
		ll.printLinkedList();
		
		System.out.println();
		//ll.removeFirst();
		//ll.removeFirst();
		//ll.removeFirst();
		ll.removeLast();
		ll.printLinkedList();
	}

}
