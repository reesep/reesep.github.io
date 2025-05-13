
public class Node {

	private String name;
	
	private Node next;
	
	public Node(String n) {
		this.name = n;
		this.next = null;
	}
	
	public Node getNext() {
		return this.next;
	}
	
	public void setNext(Node newNode) {
		this.next = newNode;
	}
	
	public String getName() {
		return this.name;
	}
	
	
}
