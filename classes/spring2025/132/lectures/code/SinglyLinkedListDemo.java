
public class SinglyLinkedListDemo {

	public static void main(String[] args) {
		
		SinglyLinkedList ll = new SinglyLinkedList();
		
		ll.addToFront(  new Node("Reese")  );
		ll.addToFront(  new Node("Susan")  );
		ll.addToFront(  new Node("Cosmo")  );
		ll.addToBack(  new Node("Sally")  );
		
		ll.printLinkedList();
		ll.removeFront();
		//ll.removeFront();
		ll.removeLast();
		
		System.out.println();
		ll.printLinkedList();
		
	}

}
