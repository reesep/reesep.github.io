
public class Node {

	private String name;
	private int age;
	
	private Node next;
	
	public Node(String s, int a) {
		this.name = s;
		this.age = a;
		this.next = null;
	}
	
	public Node getNext() {
		return this.next;
	}
	
	public void setNext(Node n) {
		this.next = n;
	}
	
	public String getData() {
		return this.name + ", Age: " + this.age;
	}
	
}
