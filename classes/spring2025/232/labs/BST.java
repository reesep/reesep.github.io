
public class BST {

	private Node root;
	
	public BST() {
		this.root = null;
	}
	
	public void insert(int newValue) {
		
		if(root == null) {
			root = new Node(newValue);
		}
		else {
			
			Node currentNode = root;
			boolean placed = false;
			
			while(!placed) {
				
				if(currentNode.getValue() == newValue) {
					placed = true;
					System.out.println("No duplicate values allowed");
				}
				else if(newValue < currentNode.getValue()) {
					//move left
					if(currentNode.getLeft() == null) {
						// cant move left, so we found insertion spot
						//insert Node
						currentNode.setLeft(new Node(newValue));
						currentNode.getLeft().setParent(currentNode);
						placed = true;
					}
					else {
						// otherwise move left
						currentNode = currentNode.getLeft();
					}
				}
				else {
					//move right
					if(currentNode.getRight() == null) {
						//cant move right, insert new node
						currentNode.setRight(new Node(newValue));
						currentNode.getRight().setParent(currentNode);
						placed = true;
					}
					else {
						//move right
						currentNode = currentNode.getRight();
					}
				}	
			}		
		}	
	}
	
	public Node getRoot() {
		return this.root;
	}
	
	
	//These are the four methods you need to write for lab 4. You are welcome to make additional changes to the BST class.
	
	public void inOrder(Node n) {
		//TO DO: Lab 3
		
	}

	public void breadthFirst() {
		//TO DO: Lab 3
		
	}

	
	public int getMin() {
		//TO DO: Lab 3
		
		return -1;
	}
	
	public int getMax() {
		//TO DO: Lab 3
		
		return -1;
	}
	
	public Node find(int value) {
		//TO DO: Lab 3
		
		
		return null;
	}
	

	
}
