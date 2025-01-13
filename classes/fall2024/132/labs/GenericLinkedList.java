
public class GenericLinkedList {

	public class Node<T>{
		
		T data;
		Node<T> next;
		
		public Node(T inData) {
			this.data = inData;
			this.next = null;
		}
		
		public T getData() {
			return this.data;
		}
		
		public Node getNext() {
			return this.next;
		}
		
	} //end my node class
	
	//start LL class
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
		size++;
	}
	
	public void print() {
		Node current = this.head;
		while(current != null) {
			System.out.println(current.getData());
			current = current.getNext();
		}
	}
	
	
	
}
