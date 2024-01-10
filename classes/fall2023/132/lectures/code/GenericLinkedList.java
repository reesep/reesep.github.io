
public class GenericLinkedList {

	
	public class Node<E> {
	
		E data;
		Node<E> next;
		
		public Node(E data) {
			this.data = data;
			this.next = null;
		}
		
		public E getData() {
			return this.data;
		}
		
		public Node getNext() {
			return this.next;
		}
	} //end of the node class
	
	//begin the linked list class
	
	private Node head;
	private int size;
	
	public GenericLinkedList() {
		this.head = null;
		this.size = 0;
	}
	
	public <E> void add(E newData) { //add data to front of linked list
		Node<E> newNode = new Node<E>(newData);
		newNode.next = this.head;
		this.head = newNode;
	}
	
	public void print() {
		Node current = this.head;
		while(current != null) {
			System.out.println(current.getData());
			current = current.getNext();
		}
		
	}
	
	
	
}
