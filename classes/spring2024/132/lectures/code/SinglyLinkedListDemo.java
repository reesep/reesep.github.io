
public class SinglyLinkedListDemo {

	public static void main(String[] args) {
		
		Node n1 = new Node("Reese");
		Node n2 = new Node("Susan");
		Node n3 = new Node("Cosmo");
		
		SinglyLinkedList ll = new SinglyLinkedList();
		
		ll.addToFront(n1);
		ll.addToFront(n2);
		ll.addToFront(n3);
		
		ll.printLinkedList();
		
		ll.removeFirst();

		Node n4 = new Node("Mark");
		
		ll.addToBack(n4);
		
		ll.printLinkedList();
	}

}
