
public class Node {

	private String name;
	private int power_level;
	
	private Node next;
	private Node prev;
	
	public Node(String s, int p) {
		this.name = s;
		this.power_level = p;
		this.next = null;
		this.prev = null;
	}
	
	public String getName() {
		return this.name;
	}
	
	public int getPowerLevel() {
		return this.power_level;
	}
	
	public Node getNext() {
		return this.next;
	}
	
	public void setNext(Node newNode) {
		this.next = newNode;
	}
	
	public Node getPrev() {
		return this.prev;
	}
	
	public void setPrev(Node newNode) {
		this.prev = newNode;
	}
	
	public String printNode() {
		return(this.name + "\n" + "Power Level: " + this.power_level);
	}
	
}
