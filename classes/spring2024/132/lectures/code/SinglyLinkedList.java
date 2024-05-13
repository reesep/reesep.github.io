
public class SinglyLinkedList {

	private Node head;
	
	public SinglyLinkedList() {
		head = null;
	}
	
	public void addToFront(Node newNode) {
		
		if(head == null) {
			head = newNode;
		}
		else {
			newNode.setNext(head);
			head = newNode;
		}
		
	}
	
	public void addToBack(Node newNode) {
		
		if(head == null) {
			head = newNode;
		}
		else {
			
			Node current = head;
			while(current.getNext() != null) {
				current = current.getNext();
			}
			current.setNext(newNode);
			
		}
		
	}
	
	
	public void printLinkedList() {
		
		Node current = head;
		while(current != null) {
			current.printNode();
			current = current.getNext(); //move to next
		}
		
	}
	
	public void removeFirst() {
		
		if(head != null) {
			head = head.getNext();
		}

		
	}
	
	
}
