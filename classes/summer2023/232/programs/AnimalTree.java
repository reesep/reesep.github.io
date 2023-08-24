
import java.io.FileReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class AnimalTree {

    private Node root;

    public AnimalTree() {
        loadBST();  // read file and construct tree
    }

    
    public void identify() {
    	
    	// TO DO: PART 2. Use tree to identify animals
    	
    }
	

    public void loadBST() {
        // TO DO: PART 1: Load BST from file (tree.txt)
    }

 
    public void insert(String newNode) {
       // TP DO: PART 1: Use insert() method to insert nodes into BST
    }
    
    // Performs breadth first search and prints out tree
    public void breadthFirst() {
		Queue<Node> queue = new LinkedList<>();
		if(root != null) {
			queue.add(root);
			while(!queue.isEmpty()) {
				
				Node node = queue.remove();
				
				System.out.println(node.getPrompt() + " " + node.getNodeNum());
				
				if (node.getLeft() != null) {
                    queue.add(node.getLeft());
                }
                if (node.getRight() != null) {
                    queue.add(node.getRight());
                }
			}
		}
	}
	
}
