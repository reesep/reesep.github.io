
public class SinglyLinkedListDemo {

	public static void main(String[] args) {
		
		
		SinglyLinkedList ll = new SinglyLinkedList();
		
		ll.addToFront(  new Node("Reese",32) );
		ll.addToFront(  new Node("Susan",15) );
		ll.addToFront(  new Node("Sally",67) );
		
		
		ll.printLinkedList();
		
		ll.addToBack( new Node("Jerry",21) );
		
		ll.printLinkedList();
		
		ll.removeFirst();
		System.out.println();
		ll.printLinkedList();
		
		ll.addToFront(  new Node("Jack",42) );
		System.out.println();
		ll.printLinkedList();
		
		

	}

}
