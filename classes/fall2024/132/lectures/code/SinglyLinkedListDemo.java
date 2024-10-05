
public class SinglyLinkedListDemo {

	public static void main(String[] args) {
		
		SinglyLinkedList ll = new SinglyLinkedList();
		
		ll.addToFront( new Node("Reese", 32) );
		ll.addToFront( new Node("Sally", 19) );
		ll.addToFront( new Node("John", 51) );
		
		ll.addToBack(  new Node("Parker", 33));
		
		System.out.println(ll.get(2).getData());
		
		ll.printLinkedList();
		System.out.println();
		ll.removeFirst();
		ll.printLinkedList();
		
		System.out.println();
		ll.removeLast();
		ll.printLinkedList();
		
		
		
	}

}
