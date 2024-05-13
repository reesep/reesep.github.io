
public class FacultyTreeDemo {

	public static void main(String args[]) {
		
		
		FacultyTree fc = new FacultyTree();
		
		fc.printTree();
		
		System.out.println();
		int height = fc.getHeight();
		System.out.println("The height of the tree is: " + height);
		
		System.out.println();
		fc.searchFor("Reese Pearsall");
		System.out.println();
		fc.searchFor("Waded Cruzado");
		System.out.println();
		fc.searchFor("Shane Blanchard");
		System.out.println();
		fc.searchFor("Travis Peters");
		
		
		
		
	}
	
	
}
