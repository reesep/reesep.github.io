
public class BSTDemo {

	public static void main(String[] args) {
		
		BST bst = new BST();
		
		bst.insert(44);
		bst.insert(17);
		bst.insert(88);
		bst.insert(8);
		bst.insert(32);
		bst.insert(65);
		bst.insert(97);
		bst.insert(27);
		bst.insert(54);
		bst.insert(82);
		bst.insert(93);
		bst.insert(21);
		bst.insert(29);
		bst.insert(76);
		bst.insert(28);
		bst.insert(68);
		bst.insert(80);
		
		System.out.println("In order traversal");
		System.out.println("----------------------------------------");
		bst.inOrder(bst.getRoot());
		
		System.out.println();
		
		System.out.println("Breadth-first traversal");
		System.out.println("----------------------------------------");
		bst.breadthFirst();
		
		System.out.println();		
	
		int min = bst.getMin();
		System.out.println("The minimum value is: " + min);
		
		int max = bst.getMax();
		System.out.println("The maximum value is: " + max);
		
		System.out.println();
		
		System.out.println(bst.find(44).getValue());
		System.out.println(bst.find(93).getValue());
		System.out.println(bst.find(21).getValue());
		System.out.println(bst.find(1));

		
		
		

	}

}
