import java.util.LinkedList;

public class Node {

	private String name; //directory name
	private Node parent;
	private LinkedList<Node> children;
	
	public Node(String name) {
		this.name = name;
		children = new LinkedList<Node>();
	}
	
	public String getName() {
		return this.name;
	}
	
	public LinkedList<Node> getChildren(){
		return this.children;
	}
	
	public Node getParent() {
		return this.parent;
	}
	
	public void addChild(Node newChild) {
		this.children.add(newChild);
	}
	
	public void setParent(Node newParent) {
		this.parent = newParent;
	}
	
}