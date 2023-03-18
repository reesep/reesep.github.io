
public class SinglyLinkedList {

	private Node head;
	
	public SinglyLinkedList() {
		this.head = null;
	}
	
	public void addToFront(Node newNode) {
		
		if(this.head == null) {
			this.head = newNode;
		}
		else {
			newNode.setNext(this.head);
			this.head = newNode;
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
		
		Node current = this.head;
		while(current != null) {
			System.out.println(current.getData());
			current = current.getNext();
		}
		
	}
	
	public void removeFirst() {
		if(this.head != null) {
			this.head = this.head.getNext();
		}
	}
	
	
	
	
}
