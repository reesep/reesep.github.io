
public class Node {

	private String code;
	private String location;
	
	private Node next;
	private Node prev;
	
	public Node(String c, String l) {
		this.code = c;
		this.location = l;
	}
	
	
	public Node getNext() {
		return this.next;
	}
	
	public Node getPrev() {
		return this.prev;
	}
	
	public void setPrev(Node newNode) {
		this.prev = newNode;
	}
	
	public void setNext(Node newNode) {
		this.next = newNode;
	}
	
	public String getCode() {
		return this.code;
	}
	
	public String getLocation() {
		return this.location;
	}
	
	public void printNode() {
		System.out.println(this.code + ": " + this.location);
	}
	
	
}
