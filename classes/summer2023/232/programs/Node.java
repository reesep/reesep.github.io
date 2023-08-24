
public class Node {

   // Instance Fields
   private int nodeNum;  // used when reading in from file 
   private String prompt; 
   private Node left;
   private Node right;
   private Node parent;
	
   // This is the constructor used when creating tree from file
    public Node(String prompt, int nodeNum) {
        this.prompt = prompt;
        this.nodeNum = nodeNum;
    }
    
    // This is the constructor used when creating Nodes for a never-before-seen animal in the tree
    public Node(String prompt, Node left, Node right, Node parent) {
        this.prompt = prompt;
        this.left = left;
        this.right = right;
        this.parent = parent;
    }
	
    // Getter Methods
    public Node getRight() {
        return right;
    }

    public Node getLeft() {
        return left;
    }
    
    public Node getParent() {
        return parent;
    }
    
    public int getNodeNum() {
        return nodeNum;
    }
    
    public String getPrompt() {
    	return this.prompt;
    }

    // Setter Methods
    public void setRight(Node right) {
        this.right = right;
    }

    public void setLeft(Node left) {
        this.left = left;
    }
    
    public void setParent(Node parent) {
        this.parent = parent;
    }

    public void changePrompt(String newPrompt) {
	this.prompt = newPrompt;
    }
    
    // Checks if current node is a leaf node.
    public boolean isLeaf() {
        return left == null;
    }
    
    



    
	
}
