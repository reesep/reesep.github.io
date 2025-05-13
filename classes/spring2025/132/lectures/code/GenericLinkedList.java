
public class GenericLinkedList {

	public class Node<T>{
		
		T data;
		Node<T> next;
		
		public Node(T data) {
			this.data = data;
			this.next = null;
		}
		
		public Node getNext() {
			return this.next;
		}
		
		public T getData() {
			return this.data;
		}
		
	} //end of node class
	
	private Node head;
	private int size;
	
	public GenericLinkedList() {
		this.head = null;
		this.size = 0;
	}
	
	public <T> void add(T newData){
		Node<T> newNode = new Node<T>(newData);
		newNode.next = head;
		this.head = newNode;
		size++;
	}
	
	public void print() {
		Node current = head;
		while(current != null) {
			System.out.println(current.getData());
			current = current.getNext();
		}
	}
	

}
