
public class SinglyLinkedList {

	private Node head;
	private int size;
	
	public SinglyLinkedList() {
		this.head = null;
	}
	
	public void addToFront(Node newNode) {
		
		//if linked list is empty
		if(head == null) {
			head = newNode;
		}
		else {
			newNode.setNext(head);
			head = newNode;
		}
		this.size++;
		
	}
	
	public void addToBack(Node newNode) {
		
		//if linked list is empty
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
		this.size++;
		
	}
	
	
	public void printLinkedList() {
		
		Node current = head;
		while(current != null) {
			System.out.println(current.getData());
			current = current.getNext();
		}
	}
	
	public void removeFirst() {
		
		if(head != null) {
			head = head.getNext();
		}
		
	}
	
	public void removeLast() {
		if(size == 0) {
			return;
		}
		else if(size == 1) {
			head = null;
		}
		else {
			Node current = head;
			while(current.getNext().getNext() != null) {
				current = current.getNext();
			}
			current.setNext(null);
		}
	}
	
}
