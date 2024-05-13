
public class Node {

	private String code;
	private String city;
	
	private Node next;
	private Node prev;
	
	public Node(String c, String ci) {
		this.code = c;
		this.city = ci;
	}
	
	public Node getNext() {
		return this.next;
	}
	
	public Node getPrev() {
		return this.prev;
	}
	
	public void setNext(Node newNode) {
		this.next = newNode;
	}
	
	public void setPrev(Node newNode) {
		this.prev = newNode;
	}
	
	public String getInfo() {
		return this.code + " " + this.city;
	}

	public String getCode() {
		return this.code;
	}
}
