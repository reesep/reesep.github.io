import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class FacultyTree {

	
	private Node root;
	private Node current;
	
	
	public FacultyTree() {
		root = new Node("MSU Faculty",0);
		current = root;
		fillTree();
	}
	
	private void insert(String name) {
		Node newNode = new Node(name, current.getDepth()+1);
		newNode.setParent(current);
		current.addChild(newNode);
	}
	
	private void insert(String name, String title, String office) {
		Node newNode = new Node(name, title, office, current.getDepth()+1);
		newNode.setParent(current);
		current.addChild(newNode);
		
	}
	
	private void goHome() {
		current = root;
	}
	
	private void moveDown(String name) {
		ArrayList<Node> children = current.getChildren();
		for(Node child : children) {
			if(child.getName().equals(name)) {
				current = child;
			}
		}
	}
	
	private void moveUp() {
		if( current != root ) {
			current = current.getParent();
		}
	}
	
	
	private void fillTree() {
        	insert("Administration");
	        insert("Sociology");
	        insert("Engineering");

        	moveDown("Administration");
	        insert("Waded Cruzado", "President", "Montana Hall 216");
        	insert("Bob Markwa", "Provost", "Montana Hall 212");
	        goHome();
		
        	moveDown("Sociology");
	        insert("Cody Warner", "Department Head", "Wilson Hall 2-128");
        	insert("Suzy McElrath", "Assistant Professor", "Wilson Hall 2-114");
	        insert("Sara Rasch", "Instructor", "Wilson Hall 2-109");
        	goHome();
        
	        moveDown("Engineering");
	        insert("Computer Science");
        	insert("Electrical Engineering");
        
	        moveDown("Computer Science");
        	insert("Reese Pearsall", "Instructor", "Barnard Hall 361");
	        insert("John Paxton", "Director", "Bardnard Hall 353");
        	insert("Shane Blanchard", "Academic Advisor", "Barnard Hall 357");
	        insert("Hunter Lloyd", "Teaching Professor", "Barnard Hall 354");
        
        	moveUp();
	        moveDown("Electrical Engineering");
	        insert("Brock LaMeres", "Professor", "Norm Asbjornson Hall 316");
        	insert("Bradley Whitaker", "Assistant Professor", "Cobbleigh Hall 630");
        
        

	}
	
	//
	// YOUR CODE SHOULD GO BELOW THIS COMMENT
	// DO NOT MODIFY ANYTHING ABOVE


	public void printTree() {
		//TO DO: Lab 3
		
	}

	public int getHeight() {
		//TO DO: Lab 3

	}

	public void searchFor(String name) {
		//TO DO: Lab 3		
	}
	
	
	
}
