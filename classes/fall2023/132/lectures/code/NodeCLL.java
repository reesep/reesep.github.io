
public class Node {

	private String code; //lax
	private String city; //Los angeles
	
	private Node next;
	private Node prev;
	
	public Node(String c, String city) {
		this.code = c;
		this.city = city;
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
	
	public void printNode() {
		System.out.println(this.code + ": " + this.city);
	}
	
}
