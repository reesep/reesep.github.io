
public class GenericLinkedList {

	private class Node<E> {
		
		private E data;
		private Node<E> next;
		
		public Node(E data) {
			this.data= data;
			this.next = null;
		}

		public E getData() {
			return this.data;
		}
		
		public Node<E> getNext() {
			return this.next;
		}
	} // END OF THE NODE CLASS
	
	// begin linkedlist class
	
	private Node head;
	private int size;
	
	public GenericLinkedList() {
		this.head = null;
		this.size = 0;
	}
	
	public <E> void add(E newData) {
		
		Node<E> newNode = new Node<E>(newData);
		newNode.next = this.head;
		this.head = newNode;
		this.size++;
		
	}
	
	public void print() {
		
		Node current = this.head;
		while(current != null) {
			System.out.println(current.getData());
			current = current.getNext();
		}
		
	}
	
	
	
}
