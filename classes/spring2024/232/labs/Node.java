import java.util.ArrayList;

public class Node {

	private String name; //directory name
	private Node parent;
	private ArrayList<Node> children;
	
	public Node(String name) {
		this.name = name;
		children = new ArrayList<Node>();
	}
	
	public String getName() {
		return this.name;
	}
	
	public ArrayList<Node> getChildren(){
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