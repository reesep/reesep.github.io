
public class Node {

	private String name;
	private int age;
	
	private Node next;
	
	public Node(String n, int a) {
		this.name = n;
		this.age = a;
		this.next = null;
	}
	
	public Node getNext() {
		return this.next;
	}
	
	public void setNext(Node newNode) {
		this.next = newNode;
	}
	
	public String getData() {
		return this.name + ", Age:" + this.age; 
	}
	
}
