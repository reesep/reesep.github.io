import java.util.ArrayList;

public class Node {

	
	private Node parent;
	private ArrayList<Node> children;
	
	private String name;
	private int depth;
	
	// only for leaf nodes
	private String office;
	private String title;
	
	
	public Node(String n, int d) { //Internal Node constructor
		name = n;
		office = null;
		title = null;
		parent = null;
		children = new ArrayList<Node>();
		depth = d;
	}
	
	public Node(String n, String t, String o, int d) {  //Leaf node constructor
		name = n;
		title = t;
		office = o;
		parent = null;
		depth = d;
		children = new ArrayList<Node>();
	}

	public String getName() {
		return this.name;
	}
	
	public String getOffice() {
		return this.office;
	}
	
	public String getTitle() {
		return this.title;
	}
	
	public int getDepth() {
		return this.depth;
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
